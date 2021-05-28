package mx.com.prosa.tic.security.ldap;

/*
#java
################################################################################
# Nombre del Programa : UserDetailsContextMapperImplTest.groovy	               #
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

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * The Class UserDetailsContextMapperImplTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserDetailsContextMapperImplTest {
	
	
    /** The context. */
    @Mock
    DirContextOperations context;
	   
	   /**
   	 * Test map user from context with out fiid.
   	 */
   	@Test
	    public void testMapUserFromContextWithOutFiid() {
		   
		   UserDetailsContextMapperImpl userDatail = new UserDetailsContextMapperImpl();
		   UserDetails response;
		   Collection<? extends GrantedAuthority> roles = AuthorityUtils.createAuthorityList("ROLE_COMERCIO");
		   String nameInNamespaces = "uid=neoxadm,o=Clientes,o=prosa.com.mx,o=isp";
		   String user= "neoxadm";
	        when(context.getNameInNamespace()).thenReturn(nameInNamespaces);
	        response = userDatail.mapUserFromContext(context, user, roles);
	        assertNotNull(response);
	    }
	   
	   /**
   	 * Test map user from context with fiid.
   	 */
   	@Test
	    public void testMapUserFromContextWithFiid() {
		   
		   UserDetailsContextMapperImpl userDatail = new UserDetailsContextMapperImpl();
		   UserDetails response;
		   Collection<? extends GrantedAuthority> roles = AuthorityUtils.createAuthorityList("ROLE_COMERCIO");
		   String nameInNamespaces = "uid=9097734,ou=9097734,o=B021,o=NACIONALES,o=Bancos,o=Clientes,o=prosa.com.mx,o=isp";
		   String user= "neoxadm";
	        when(context.getNameInNamespace()).thenReturn(nameInNamespaces);
	        response = userDatail.mapUserFromContext(context, user, roles);
	        assertNotNull(response);
	    }
	   
	   /**
   	 * Test map user from context with authorities null.
   	 */
   	@Test
	    public void testMapUserFromContextWithAuthoritiesNull() {
		   
		   UserDetailsContextMapperImpl userDatail = new UserDetailsContextMapperImpl();
		   UserDetails response;
		   Collection<? extends GrantedAuthority> roles = null;
		   String nameInNamespaces = "uid=9097734,ou=9097734,o=B021,o=NACIONALES,o=Bancos,o=Clientes,o=prosa.com.mx,o=isp";
		   String user= "neoxadm";
	        when(context.getNameInNamespace()).thenReturn(nameInNamespaces);
	        response = userDatail.mapUserFromContext(context, user, roles);
	        assertNotNull(response);
	    }
	   
	   /**
   	 * Test map user to context.
   	 */
   	@Test
		public void testMapUserToContext() {
			
			UserDetailsContextMapperImpl userDetailsContextMapperImpl = new UserDetailsContextMapperImpl();
			UserDetails userDetails = mock(UserDetails.class);
			DirContextAdapter dirContextAdapter = mock(DirContextAdapter.class);
			userDetailsContextMapperImpl.mapUserToContext(userDetails, dirContextAdapter);
			
			
		}

}
