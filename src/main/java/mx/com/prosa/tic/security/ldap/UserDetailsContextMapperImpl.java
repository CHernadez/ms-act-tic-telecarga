package mx.com.prosa.tic.security.ldap;

/*
#java
################################################################################
# Nombre del Programa : UserDetailsContextMapperImpl.java		               #
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.UserDetailsContextMapper;

/**
 * Class UserDetailsContextMapperImpl.
 * @author gCadena
 */ 
public class UserDetailsContextMapperImpl implements UserDetailsContextMapper 
{
	

	/** Objeto LOG. */
	Logger LOG = LoggerFactory.getLogger(UserDetailsContextMapperImpl.class);
	
	@Override
	public UserDetails mapUserFromContext(DirContextOperations ctx,String user, Collection<? extends GrantedAuthority> authorities) 
	{
		UserBean u = new UserBean();
		System.out.println("#################################");
		String nameInNamespace = ctx.getNameInNamespace();
		
		String [] namespaces = nameInNamespace.split(",");
		String fiid = namespaces[2].split("=")[1];
		if(fiid != null && fiid.trim().matches("\\w\\d\\d\\d")){
			u.setFiid(fiid.toUpperCase());
		}
		else{
			u.setFiid(null);
		}
		u.setUsername(user);
		LOG.info("nameInNamespace["+nameInNamespace+"]");
		LOG.info("FIID["+u.getFiid()+"]");
		LOG.info("user["+u.getUsername()+"]");
		
		if(authorities!=null){
			for(GrantedAuthority authority : authorities){
				System.out.println("authority ["+authority.getAuthority()+"]");
				u.setAuthority(authority.getAuthority());
			}
		}
		else{
			LOG.info("Authorities null");
		}
		
		return u;
	}

	public void mapUserToContext(UserDetails arg0, DirContextAdapter arg1) {
		LOG.info("in mapusertocontext");
	}
}
