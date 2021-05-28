package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : OperationExceptionTest.java			       		       #
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
import java.time.ZonedDateTime;

import org.junit.Test;

/**
 * The Class OperationExceptionTest.
 */
public class OperationExceptionTest {
	
	/**
	 * Test get time zone.
	 */
	@Test
	public void testGetTimeZone() { 
		ZonedDateTime timestamp = ZonedDateTime.parse("2020-10-09T08:20:11.252+05:30[America/Mexico_City]");
		
		OperationException operationException = generateCostructor();
		assertEquals(timestamp, operationException.getTimestamp());	
	}
	
	/**
	 * Test get estatus.
	 */
	@Test
	public void testGetEstatus() { 
		int status = 200;
		OperationException operationException = generateCostructor();
		assertEquals(status, operationException.getStatus());	
	}
	
	/**
	 * Test get error.
	 */
	@Test
	public void testGetError() { 
		String error = "Operation Error";
		OperationException operationException = generateCostructor();
		assertEquals(error, operationException.getError());	
	}
	
	/**
	 * Test get message.
	 */
	@Test
	public void testGetMessage() { 
		String message = "Genereted operation error";
		OperationException operationException = generateCostructor();
		assertEquals(message, operationException.getMessage());	
	}
	
	/**
	 * Test get path.
	 */
	@Test
	public void testGetPath() { 
		String path = "/act/tic/api/telecarga/consulta";
		OperationException operationException = generateCostructor();
		assertEquals(path, operationException.getPath());	
	}
	
	/**
	 * Generate costructor.
	 *
	 * @return the operation exception
	 */
	public OperationException generateCostructor() {
		ZonedDateTime timestamp = ZonedDateTime.parse("2020-10-09T08:20:11.252+05:30[America/Mexico_City]");
		int status = 200;
		String error = "Operation Error";
		String message = "Genereted operation error";
		String path = "/act/tic/api/telecarga/consulta";
		OperationException operationException = new OperationException(timestamp, status, error, message, path);
		return operationException;
	}

}
