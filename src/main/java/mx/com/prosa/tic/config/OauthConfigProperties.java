package mx.com.prosa.tic.config;

/*
#java
################################################################################
# Nombre del Programa : OauthConfigProperties.java		                       #
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

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


/**
 * The Class OauthConfigProperties.
 */
@EnableConfigurationProperties
@Configuration("OauthConfigProperties")
@ConfigurationProperties(prefix="oauth")
public class OauthConfigProperties {
	
	/** The client secret. */
	private String clientSecret;
	
	/** The client id. */
	private String clientId;
	
	/** The token validity seconds. */
	private int tokenValiditySeconds;	
	
	/** The refresh token validity seconds. */
	private int refreshTokenValiditySeconds;
	
	/**
	 * Gets the client secret.
	 *
	 * @return the client secret
	 */
	public String getClientSecret() {
		return clientSecret;
	}
	
	/**
	 * Sets the client secret.
	 *
	 * @param clientSecret the new client secret
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	
	/**
	 * Gets the client id.
	 *
	 * @return the client id
	 */
	public String getClientId() {
		return clientId;
	}
	
	/**
	 * Sets the client id.
	 *
	 * @param clientId the new client id
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	/**
	 * Gets the token validity seconds.
	 *
	 * @return the token validity seconds
	 */
	public int getTokenValiditySeconds() {
		return tokenValiditySeconds;
	}
	
	/**
	 * Sets the token validity seconds.
	 *
	 * @param tokenValiditySeconds the new token validity seconds
	 */
	public void setTokenValiditySeconds(int tokenValiditySeconds) {
		this.tokenValiditySeconds = tokenValiditySeconds;
	}
	
	/**
	 * Gets the refresh token validity seconds.
	 *
	 * @return the refresh token validity seconds
	 */
	public int getRefreshTokenValiditySeconds() {
		return refreshTokenValiditySeconds;
	}
	
	/**
	 * Sets the refresh token validity seconds.
	 *
	 * @param refreshTokenValiditySeconds the new refresh token validity seconds
	 */
	public void setRefreshTokenValiditySeconds(int refreshTokenValiditySeconds) {
		this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
	}
	
}

