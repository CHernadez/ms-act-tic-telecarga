package mx.com.prosa.tic.config;

/*
#java
################################################################################
# Nombre del Programa : OauthConfigPropertiesTest.groovy		               #
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/**
 * The Class OauthConfigPropertiesTest.
 */
public class OauthConfigPropertiesTest {
	
	/**
	 * Test get client id.
	 */
	@Test
	public void testGetClientId() { 
		String client = "test";
		OauthConfigProperties props = generateCostructor();
		assertEquals(client, props.getClientId());	
	}
	
	/**
	 * Test get estatus.
	 */
	@Test
	public void testGetSecret() { 
		String secret = "secret";
		OauthConfigProperties props = generateCostructor();
		assertEquals(secret, props.getClientSecret());	
	}
	
	/**
	 * Test get error.
	 */
	@Test
	public void testGetTokenValiditySeconds() { 
		int tokenValiditySeconds = 60;
		OauthConfigProperties props = generateCostructor();
		assertEquals(tokenValiditySeconds, props.getTokenValiditySeconds());	
	}
	
	/**
	 * Test get refresh token validity seconds.
	 */
	@Test
	public void testGetRefreshTokenValiditySeconds() { 
		int refreshTokenValiditySeconds = 120;
		OauthConfigProperties props = generateCostructor();
		assertEquals(refreshTokenValiditySeconds, props.getRefreshTokenValiditySeconds());	
	}
	
	/**
	 * Generate costructor.
	 *
	 * @return the operation exception
	 */
	public OauthConfigProperties generateCostructor() {
		
		OauthConfigProperties props = new OauthConfigProperties();
		
		props.setClientId("test");
		props.setClientSecret("secret");
		props.setRefreshTokenValiditySeconds(120);
		props.setTokenValiditySeconds(60);
		
		return props;
	}

}
