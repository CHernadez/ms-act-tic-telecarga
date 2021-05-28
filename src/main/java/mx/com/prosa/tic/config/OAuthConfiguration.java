package mx.com.prosa.tic.config;

/*
#java
################################################################################
# Nombre del Programa : OAuthConfiguration.java		                           #
# Autor               : Carlos Hernandez                                       #
# Compania            : Karvon                                                 #
# Proyecto/Procliente : P-24-5481-20                     Fecha: 14-05-2021     #
# Descripcion General :                                                        #
# Programa Dependiente: N/A                                                    #
# Programa Subsecuente: N/A                                                    #
# Cond. de ejecucion  : N/A                                                    #
# Dias de ejecucion   :                                  Horario:              #
#                              MODIFICACIONES                                  #
#------------------------------------------------------------------------------#
# Autor               :                                                        #
# Compania            :                                                        #
# Proyecto/Procliente :                                  Fecha: dd/mm/aaaa     #
# Modificacion        :                                                        #
#------------------------------------------------------------------------------#
# PARAMETROS          : N/A                                                    #
# Parametros Entrada  : N/A                              Formato:              #
# Parametros Salida   : N/A                              Formato:              #
################################################################################
*/

import org.springframework.security.oauth2.config.annotation.web.configuration.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.userdetails.UserDetailsByNameServiceWrapper;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
import org.springframework.security.ldap.authentication.BindAuthenticator;
import org.springframework.security.ldap.authentication.LdapAuthenticationProvider;
import org.springframework.security.ldap.search.FilterBasedLdapUserSearch;
import org.springframework.security.ldap.search.LdapUserSearch;
import org.springframework.security.ldap.userdetails.DefaultLdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapUserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.*;
import org.springframework.security.oauth2.config.annotation.web.configurers.*;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.error.*;
import org.springframework.context.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.token.*;
import org.springframework.security.oauth2.provider.token.store.*;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;

import com.google.common.collect.Lists;
import org.springframework.security.oauth2.common.exceptions.*;

import mx.com.prosa.tic.security.ldap.UserDetailsContextMapperImpl;


/**
 * The Class OAuthConfiguration.
 */
@DependsOn("SecurityConfig") 
@Configuration
@EnableAuthorizationServer
public class OAuthConfiguration extends AuthorizationServerConfigurerAdapter {
	
	/** The authentication manager. */
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;
	
	/** The ldap config properties. */
	@Autowired
	private LdapConfigProperties  ldapConfigProperties;
	
	/** The oauth config properties. */
	@Autowired
	private OauthConfigProperties  oauthConfigProperties;
	
	/** The sign. */
	private final String SIGN = "51433ca6-90e2-11eb-a8b3-0242ac130003"; 

	/**
	 * Configure.
	 *
	 * @param oauthServer the oauth server
	 * @throws Exception the exception
	 */
	@Override
	public void configure(final AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
		oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");

	}

	/**
	 * Configure.
	 *
	 * @param clients the clients
	 * @throws Exception the exception
	 */
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

		clients.inMemory().withClient(oauthConfigProperties.getClientId()).secret("{noop}"+oauthConfigProperties.getClientSecret())
				.authorizedGrantTypes("refresh_token", "password", "access_token")
				.scopes("consume").accessTokenValiditySeconds(oauthConfigProperties.getTokenValiditySeconds())
				.refreshTokenValiditySeconds(oauthConfigProperties.getRefreshTokenValiditySeconds());
	}
	

	
	/**
	 * Configure.
	 *
	 * @param endpoints the endpoints
	 * @throws Exception the exception
	 */
	@Override
	public void configure(final AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		// para un token mas robusto
		endpoints
				.tokenServices(defaultTokenServices())
				.authenticationManager(authenticationManager)
				.exceptionTranslator(loggingExceptionTranslator());
	}
	
	/** The client details service. */
	@Autowired
    private ClientDetailsService clientDetailsService;
	
	/**
	 * Default token services.
	 *
	 * @return the default token services
	 */
	@Bean
    public DefaultTokenServices defaultTokenServices() {
        final DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        defaultTokenServices.setTokenStore(tokenStore());
        defaultTokenServices.setClientDetailsService(clientDetailsService);
        defaultTokenServices.setTokenEnhancer(tokenEnhancerChain());
        defaultTokenServices.setSupportRefreshToken(true);
        defaultTokenServices.setAuthenticationManager(authenticationManager);
        defaultTokenServices.setAuthenticationManager(createPreAuthProvider());
        return defaultTokenServices;
    }
	
	/**
	 * Token enhancer chain.
	 *
	 * @return the token enhancer chain
	 */
	@Bean
    public TokenEnhancerChain tokenEnhancerChain() {
        final TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Lists.newArrayList( //new AmbaTokenEnhancer(),
        		defaultAccessTokenConverter()));
        return tokenEnhancerChain;
    }
	
	/**
	 * Ldap user details manager.
	 *
	 * @return the ldap user details service
	 */
	private LdapUserDetailsService ldapUserDetailsManager() {
		LdapUserDetailsService bean =new  LdapUserDetailsService(userSearch(), ldapAuthoritiesPopulator());
				bean.setUserDetailsMapper(new UserDetailsContextMapperImpl());
				
				return bean;
	}

	/**
	 * Ldap authorities populator.
	 *
	 * @return the ldap authorities populator
	 */
	@Bean
	public LdapAuthoritiesPopulator ldapAuthoritiesPopulator() {
		DefaultLdapAuthoritiesPopulator authPopulator = new DefaultLdapAuthoritiesPopulator(contextSource(),
				ldapConfigProperties.getGroup().getSearchBase());
		authPopulator.setGroupSearchFilter(ldapConfigProperties.getGroup().getSearchFilter());
		authPopulator.setGroupRoleAttribute("cn");
		authPopulator.setSearchSubtree(true);
		authPopulator.setGroupSearchFilter("(uniquemember={0})");
		return authPopulator;
	}

	/**
	 * User search.
	 *
	 * @return the ldap user search
	 */
	private LdapUserSearch userSearch() {
		return new FilterBasedLdapUserSearch(ldapConfigProperties.getGroup().getSearchBase(), "uid={0}", contextSource());

	}
	
	/**
	 * Context source.
	 *
	 * @return the default spring security context source
	 */
	@Bean
	public DefaultSpringSecurityContextSource contextSource() {
		DefaultSpringSecurityContextSource bean = new DefaultSpringSecurityContextSource(ldapConfigProperties.getServer().getUrl());
		bean.setPassword(ldapConfigProperties.getServer().getInit());
		bean.setUserDn(ldapConfigProperties.getUser().getUsername());
		return bean;
	}

	/**
	 * Token store.
	 *
	 * @return the token store
	 */
	// para un token mas robusto
	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(defaultAccessTokenConverter());
	}

	/**
	 * Default access token converter.
	 *
	 * @return the jwt access token converter
	 */
	@Bean
	public JwtAccessTokenConverter defaultAccessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey(SIGN);
		return converter;
	}


	/**
	 * Logging exception translator.
	 *
	 * @return the web response exception translator
	 */
	@Bean
	public WebResponseExceptionTranslator<OAuth2Exception> loggingExceptionTranslator() {
		return new DefaultWebResponseExceptionTranslator() {
			@Override
			public ResponseEntity<OAuth2Exception> translate(Exception e) throws Exception {

				e.printStackTrace();
				// Carry on handling the exception
				ResponseEntity<OAuth2Exception> responseEntity = super.translate(e);
				HttpHeaders headers = new HttpHeaders();
				headers.setAll(responseEntity.getHeaders().toSingleValueMap());
				OAuth2Exception excBody = responseEntity.getBody();
				return new ResponseEntity<>(excBody, headers, responseEntity.getStatusCode());
			}
		};
	}
	
	/**
	 * Ldap authentication provider.
	 *
	 * @return the org.springframework.security.ldap.authentication. ldap authentication provider
	 */
	@Bean 
	public org.springframework.security.ldap.authentication.LdapAuthenticationProvider ldapAuthenticationProvider(){
		
				               BindAuthenticator bindAuthenticator = new BindAuthenticator(contextSource());
				               bindAuthenticator.setUserSearch(userSearch() );
				               
				               LdapAuthenticationProvider ldapAuthenticationProvider = new LdapAuthenticationProvider(bindAuthenticator,  ldapAuthoritiesPopulator());
				               ldapAuthenticationProvider.setUserDetailsContextMapper(new UserDetailsContextMapperImpl());
				               return ldapAuthenticationProvider;
		
	}
	
	/**
	 * Creates the pre auth provider.
	 *
	 * @return the provider manager
	 */
	private ProviderManager createPreAuthProvider() {
	    PreAuthenticatedAuthenticationProvider provider = new PreAuthenticatedAuthenticationProvider();
	    provider.setPreAuthenticatedUserDetailsService(new UserDetailsByNameServiceWrapper<>(ldapUserDetailsManager()));
	    return new ProviderManager(Arrays.asList(provider));
	}
	
}
