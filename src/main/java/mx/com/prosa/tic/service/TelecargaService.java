package mx.com.prosa.tic.service;

/*
#java
################################################################################
# Nombre del Programa : TelecargaService.java			                       #
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

import mx.com.prosa.tic.model.dto.TelecargaDTO;

/**
 * The Interface TelecargaService.
 */
public interface TelecargaService {
	
	/**
	 * Gets the telecarga by folio.
	 *
	 * @param odtFolioTelecarga the odt folio telecarga
	 * @return the telecarga by folio
	 */
	public TelecargaDTO getTelecargaByFolio(String odtFolioTelecarga);
}
