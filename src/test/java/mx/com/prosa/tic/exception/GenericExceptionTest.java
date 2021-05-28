package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : GenericExceptionTest.java	       				       #
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
import org.springframework.http.HttpStatus;

/**
 * The Class GenericExceptionTest.
 */
public class GenericExceptionTest {
	
	/**
	 * Test get status.
	 */
	@Test
	public void testGetStatus() {
		GenericException genericException = generateCostructor();
		assertEquals(HttpStatus.BAD_REQUEST, genericException.getStatus());
		
	}
	
	/**
	 * Generate costructor.
	 *
	 * @return the generic exception
	 */
	public GenericException generateCostructor() {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		String message = "Bad request";
		GenericException genericException = new GenericException(status, message);
		return genericException;
		
	}

}
