package mx.com.prosa.tic.security

/*
 #groovy
 ################################################################################
 # Nombre del Programa : SecureFilter.groovy                                    #
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

import java.io.IOException

import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.web.context.WebApplicationContext
import org.springframework.web.context.support.WebApplicationContextUtils


/**
 *	@author rotten
 **/

@Component
@Order(1)
public class SecureFilter implements Filter
{
	private Logger LOG = LoggerFactory.getLogger(this.getClass())

	public void destroy()
	{
		LOG.debug("SecureFilter destroyed.")
	}

	public void doFilter(ServletRequest req, ServletResponse resp,	FilterChain chain) throws IOException, ServletException
	{
		
		HttpServletRequest request = (HttpServletRequest) req
		HttpServletResponse response = (HttpServletResponse) resp

		String sessionid = request.getSession().getId()

		LOG.debug("Setting secure headers for sessionId["+sessionid+"] session["+request.getSession()+"]")
		response.setHeader("SET-COOKIE", "JSESSIONID=" + sessionid + "; HttpOnly; secure;")

		
		response.setHeader("X-Frame-Options", "DENY")
		response.setHeader("Content-Security-Policy", "default-src 'self'")
		response.setHeader("Strict-Transport-Security", "max-age=15768000")
		response.setHeader("X-Content-Type-Options", "nosniff")
		response.setHeader("Cache-Control", "no-cache, max-age=3600")
		response.setHeader("x-xss-protection", "1; mode=block")
		response.setHeader("Referrer-Policy", "no-referrer")
		
		
		
		

		chain.doFilter(request, response)
		return


	}

	public void init(FilterConfig config) throws ServletException
	{
		LOG.debug("SecureFilter init.")

		WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext())

	}
}


