package mx.com.prosa.tic.config;

/*
#java
################################################################################
# Nombre del Programa : SecurityConfig.java			                           #
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.ldap.authentication.LdapAuthenticationProvider;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

/**
 * The Class SecurityConfig.
 */
@DependsOn("LdapConfigProperties") 
@Configuration("SecurityConfig")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/** The ldap authentication provider. */
	@Autowired
	LdapAuthenticationProvider ldapAuthenticationProvider;
	
	/** The config properties. */
	@Autowired
	private LdapConfigProperties  configProperties;
	
	
	
	/**
	 * Configure.
	 *
	 * @param auth the auth
	 * @throws Exception the exception
	 */
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(ldapAuthenticationProvider);
    }

    /**
     * Authentication manager bean.
     *
     * @return the authentication manager
     * @throws Exception the exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean()
            throws Exception {
        return super.authenticationManagerBean();
 
    }
    
    /**
     * Configure.
     *
     * @param http the http
     * @throws Exception the exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        
        http.csrf().disable()
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
       http.authorizeRequests().antMatchers("/oauth/token").anonymous()
       .and().authorizeRequests().antMatchers("/api/v2/api-docs").anonymous()
       .and().authorizeRequests().antMatchers("/consulta").hasAnyRole(configProperties.getUser().getRoles())
       .and().headers()
       .addHeaderWriter(new StaticHeadersWriter("X-Frame-Options", "DENY"))
       .addHeaderWriter(new StaticHeadersWriter("Content-Security-Policy","default-src 'self'"))
       .addHeaderWriter(new StaticHeadersWriter("Strict-Transport-Security", "max-age=15768000"))
       .addHeaderWriter(new StaticHeadersWriter("X-Content-Type-Options", "nosniff"))
       .addHeaderWriter(new StaticHeadersWriter("Cache-Control", "no-cache, max-age=3600"))
       .addHeaderWriter(new StaticHeadersWriter("x-xss-protection", "1; mode=block"))
       .addHeaderWriter(new StaticHeadersWriter("Referrer-Policy", "no-referrer"));
    }
    
    /**
     * Configure.
     *
     * @param web the web
     * @throws Exception the exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs",
                                   "/configuration/ui",
                                   "/swagger-resources/**",
                                   "/configuration/security",
                                   "/swagger-ui.html",
                                   "/webjars/**");
    }   
}