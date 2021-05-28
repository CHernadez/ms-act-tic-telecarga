package mx.com.prosa.tic.security.ldap;

/*
#java
################################################################################
# Nombre del Programa : UserBean.java			         	                   #
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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * Class UserBean.
 * @author gCadena
 */
public class UserBean implements Serializable,UserDetails {
	
	

	/** Constante serialVersionUID. */
	private static final long serialVersionUID = 141515L;
	
	
	/** Objeto username. */
	private String username;
	
	/** Objeto opensesame. */
	private String opensesame;
	
	/** Objeto authorities. */
	private List<String> authorities;
	
	/** Objeto fiid. */
	private String fiid;
	

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	public Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		for (String authority : authorities) {
			auths.add(new SimpleGrantedAuthority( authority ));
		}
		return auths;
	}
	
	/**
	 * Establece el valor de Username.
	 *
	 * @param username the username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 */
	public String getUsername() {
		return this.username;
	}
	
	/**
	 * Establece el valor de opensesame.
	 *
	 * @param opensesame the opensesame
	 */
	public void setPassword(String opensesame) {
		this.opensesame = opensesame;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 */
	public String getPassword() {
		return this.opensesame;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 */
	public boolean isAccountNonExpired() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 */
	public boolean isAccountNonLocked() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 */
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	public boolean isEnabled() {
		return true;
	}
	
	/**
	 * Establece el valor de Authorities.
	 *
	 * @param authorities the authorities
	 */
	public void setAuthorities(List<String> authorities){
		if(this.authorities == null){
			this.authorities = new ArrayList<String>();
		}
		for(String authority : authorities)
			this.authorities.add(authority);
	}
	
	/**
	 * Establece el valor de Authority.
	 *
	 * @param authority the authority
	 */
	public void setAuthority(String authority){
		if(authorities == null){
			authorities = new ArrayList<String>();
		}
		authorities.add(authority);
	}
	
	/**
	 * Obtiene fiid.
	 *
	 * @return fiid
	 */
	public String getFiid() {
		return fiid;
	}

	/**
	 * Establece el valor de Fiid.
	 *
	 * @param fiid the fiid
	 */
	public void setFiid(String fiid) {
		this.fiid = fiid;
	}

}
