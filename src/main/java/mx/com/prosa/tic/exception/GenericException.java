package mx.com.prosa.tic.exception;

/*
#java
################################################################################
# Nombre del Programa : GenericException.java                                  #
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

import org.springframework.http.HttpStatus;


/**
 * The Class GenericException.
 */
public class GenericException extends RuntimeException{
	

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9212728934674819869L;
	
	/** The status. */
	HttpStatus status;
	
	/**
	 * Instantiates a new generic exception.
	 *
	 * @param status the status
	 * @param message the message
	 */
	public GenericException(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
