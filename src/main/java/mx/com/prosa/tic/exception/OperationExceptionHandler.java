package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : OperationExceptionHandler.java                         #
# Autor               : Carlos Hernandez                                       #
# Compania            : Karvon                                                 #
# Proyecto/Procliente : P-24-5207-20                     Fecha: 14-10-2020     #
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

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The Class OperationExceptionHandler.
 */
@ControllerAdvice	
public class OperationExceptionHandler {
	
	/**
	 * Generic operation exception.
	 *
	 * @param e the e
	 * @return the response entity
	 */
	@ExceptionHandler(value= {GenericException.class})
	public ResponseEntity<Object> genericOperationException(GenericException e, HttpServletRequest request){
		
		HttpStatus unauthorizedError = e.getStatus();
		String context=request.getRequestURI();
		OperationException operationException = new OperationException(ZonedDateTime.now(ZoneId.of("America/Mexico_City")), e.getStatus().value(),e.getStatus().getReasonPhrase(),e.getMessage(), context);
		return new ResponseEntity<Object>(operationException, unauthorizedError);
	}
	
	/**
	 * Handle badRequest exceptions.
	 *
	 * @param ex the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ExceptionHandler(value = {MissingServletRequestParameterException.class, MethodArgumentNotValidException.class, MissingPathVariableException.class})
	public ResponseEntity<Object> handleBadRequestException(Exception ex, HttpServletRequest request) {
		
		HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
		String message = ex.getMessage();
		OperationException txException = new OperationException (ZonedDateTime.now(ZoneId.of("America/Mexico_City")), httpStatus.value(),httpStatus.getReasonPhrase(),message, request.getRequestURI());
		return new ResponseEntity<Object>(txException, httpStatus);
	}

}
