package mx.com.prosa.tic.security.ldap;

/*
#java
################################################################################
# Nombre del Programa : UserBeanTest.groovy						               #
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

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * The Class UserBeanTest.
 */
public class UserBeanTest {
	
	/**
	 * Test get username.
	 */
	@Test
	public void testGetUsername() { 
		String username = "AdminProsa";
		UserBean userBean = generateCostructor();
		assertEquals(username, userBean.getUsername());	
	}
	
	/**
	 * Test get estatus.
	 */
	@Test
	public void testGetFiid() { 
		String fiid = "B021";
		UserBean userBean = generateCostructor();
		assertEquals(fiid, userBean.getFiid());	
	}
	
	/**
	 * Test get error.
	 */
	@Test
	public void testGetAuthorities() { 
		UserBean userBean = generateCostructor();
		assertNotNull(userBean.getAuthorities());
	}
	
	/**
	 * Test get password.
	 */
	@Test
	public void testGetPassword() { 
		String password = "AdminProsa123";
		UserBean userBean = generateCostructor();
		assertEquals(password,userBean.getPassword());
	}
	
	/**
	 * Test is account non expired.
	 */
	@Test
	public void testIsAccountNonExpired() { 
		Boolean isAccountNonExpired = true;
		UserBean userBean = generateCostructor();
		assertEquals(isAccountNonExpired,userBean.isAccountNonExpired());
	}
	
	/**
	 * Test is account non locked.
	 */
	@Test
	public void testIsAccountNonLocked() { 
		Boolean isAccountNonLocked = true;
		UserBean userBean = generateCostructor();
		assertEquals(isAccountNonLocked,userBean.isAccountNonLocked());
	}
	
	/**
	 * Test is credentials non expired.
	 */
	@Test
	public void testIsCredentialsNonExpired() { 
		Boolean isCredentialsNonExpired = true;
		UserBean userBean = generateCostructor();
		assertEquals(isCredentialsNonExpired,userBean.isCredentialsNonExpired());
	}
	
	/**
	 * Test is enabled.
	 */
	@Test
	public void testIsEnabled() { 
		Boolean isEnabled = true;
		UserBean userBean = generateCostructor();
		assertEquals(isEnabled,userBean.isEnabled());
	}
	
	/**
	 * Generate costructor.
	 *
	 * @return the operation exception
	 */
	public UserBean generateCostructor() {
		
		UserBean userBean = new UserBean();
		List<String> authorities = new ArrayList<String>();
		authorities.add("ROLE_COMERCIO");
		
		userBean.setUsername("AdminProsa");
		userBean.setPassword("AdminProsa123");
		userBean.setAuthorities(authorities);
		userBean.setAuthority("ROLE_ADMINISTRADOR");
		userBean.setFiid("B021");
		
		return userBean;
		
	}

}
