package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : OperationException.java                                #
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

import java.time.ZonedDateTime;

/**
 * The Class OperationException.
 */
public class OperationException {

	/** The timestamp. */
	private final ZonedDateTime timestamp;
	
	/** The status. */
	private final int status;
	
	/** The error. */
	private final String error;
	
	/** The message. */
	private final String message;
	
	/** The path. */
	private final String path;
	
	/**
	 * Instantiates a new operation exception.
	 *
	 * @param timestamp the timestamp
	 * @param status the status
	 * @param error the error
	 * @param message the message
	 * @param path the path
	 */
	public OperationException(ZonedDateTime timestamp, int status, String error, String message,String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}


	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}


	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}


	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public String getError() {
		return error;
	}


	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * Gets the path.
	 *
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
}
