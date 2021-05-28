package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : OperationExceptionHandlerTest.java	       		       #
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

import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * The Class OperationExceptionHandlerTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class OperationExceptionHandlerTest {
	
	/** The request. */
	@Mock
    HttpServletRequest request;
	
	/**
	 * Test generic operation exception.
	 */
	@Test
	public void testGenericOperationException() {
		OperationExceptionHandler oeh = new OperationExceptionHandler();
		GenericException genericException = createGenericException();
		when(request.getRequestURI()).thenReturn("/act/tic/api/telecarga/consulta");
		ResponseEntity<Object> response = oeh.genericOperationException(genericException,request);
		assertNotNull(response);	
	}
	
	/**
	 * Test handle bad request exception.
	 */
	@Test
	public void testHandleBadRequestException() {
		OperationExceptionHandler oeh = new OperationExceptionHandler();
		GenericException genericException = createGenericException();
		when(request.getRequestURI()).thenReturn("/act/tic/api/telecarga/consulta");
		ResponseEntity<Object> response = oeh.handleBadRequestException(genericException,request);
		assertNotNull(response);	
	}
	
	/**
	 * Creates the generic exception.
	 *
	 * @return the generic exception
	 */
	public GenericException createGenericException() {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		String message = "Bad request";
		GenericException genericException = new GenericException(status, message);
		return genericException;
	}

}
