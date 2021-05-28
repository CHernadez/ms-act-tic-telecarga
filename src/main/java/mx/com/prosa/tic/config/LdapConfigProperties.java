package mx.com.prosa.tic.config;

/*
#java
################################################################################
# Nombre del Programa : LdapConfigProperties.java	                           #
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
import org.springframework.context.annotation.DependsOn;


/**
 * The Class LdapConfigProperties.
 */
@DependsOn("OauthConfigProperties") 
@EnableConfigurationProperties
@Configuration("LdapConfigProperties")
@ConfigurationProperties(prefix="ldap")
public class LdapConfigProperties {
	
	/** The user. */
	private LdapUserConfigProperties user;
	
	/** The server. */
	private LdapServerConfigProperties server;
	
	/** The group. */
	private LdapGroupConfigProperties group;	
	
	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public LdapUserConfigProperties getUser() {
		return user;
	}
	
	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(LdapUserConfigProperties user) {
		this.user = user;
	}
	
	/**
	 * Gets the server.
	 *
	 * @return the server
	 */
	public LdapServerConfigProperties getServer() {
		return server;
	}
	
	/**
	 * Sets the server.
	 *
	 * @param server the new server
	 */
	public void setServer(LdapServerConfigProperties server) {
		this.server = server;
	}
	
	/**
	 * Gets the group.
	 *
	 * @return the group
	 */
	public LdapGroupConfigProperties getGroup() {
		return group;
	}
	
	/**
	 * Sets the group.
	 *
	 * @param group the new group
	 */
	public void setGroup(LdapGroupConfigProperties group) {
		this.group = group;
	}
}

class LdapUserConfigProperties{
    private String roles;
    private String username;
    
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}

class LdapServerConfigProperties{
	private String url;
	private String init;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInit() {
		return init;
	}
	public void setInit(String init) {
		this.init = init;
	}	
}

class LdapGroupConfigProperties{
    private String searchBase;
    private String searchFilter;
    
	public String getSearchBase() {
		return searchBase;
	}
	public void setSearchBase(String searchBase) {
		this.searchBase = searchBase;
	}
	public String getSearchFilter() {
		return searchFilter;
	}
	public void setSearchFilter(String searchFilter) {
		this.searchFilter = searchFilter;
	}
}

