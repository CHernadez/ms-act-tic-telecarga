package mx.com.prosa.tic.security;

/*
#java
################################################################################
# Nombre del Programa : SecureFilterTest.groovy					               #
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

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import static org.mockito.Mockito.*;

/**
 * The Class SecureFilterTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class SecureFilterTest {
	
	/** The session. */
	@Mock
	HttpSession session; 
	
	/** The web application context util. */
	@Mock
    WebApplicationContextUtils webApplicationContextUtil;
	
	/** The application context. */
	@Mock
	WebApplicationContext applicationContext;
	
	/** The filter config. */
	@Mock
	FilterConfig filterConfig;
	
	   /**
   	 * Test do filter.
   	 *
   	 * @throws ServletException the servlet exception
   	 * @throws IOException Signals that an I/O exception has occurred.
   	 */
   	@Test
	    public void testDoFilter() throws ServletException, IOException {

	        SecureFilter filter = new SecureFilter();
	       
	        HttpServletRequest mockReq = mock(HttpServletRequest.class);
	        HttpServletResponse mockResp = mock(HttpServletResponse.class);
	        FilterChain mockFilterChain = mock(FilterChain.class);
	        String sessionId = "000000001";
	        when(session.getId()).thenReturn(sessionId);
	        when(mockReq.getSession()).thenReturn(this.session);
	        filter.doFilter(mockReq, mockResp, mockFilterChain);
	        filter.destroy();
	    }

}
