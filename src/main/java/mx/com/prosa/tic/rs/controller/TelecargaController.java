package mx.com.prosa.tic.rs.controller;

/*
#java
################################################################################
# Nombre del Programa : TelecargaController.java		                       #
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.com.prosa.tic.model.dto.TelecargaDTO;
import mx.com.prosa.tic.service.TelecargaService;

/**
 * The Class TelecargaController.
 */
@EnableResourceServer
@RestController
public class TelecargaController {

	/** The logger. */
	Logger logger = LoggerFactory.getLogger(TelecargaController.class);
	
	/** The telecarga service impl. */
	@Autowired
	TelecargaService telecargaServiceImpl;
	
	/**
	 * Gets the telecarga by folio.
	 *
	 * @param odtFolioTelecarga the odt folio telecarga
	 * @param servletRequest the servlet request
	 * @param servletResponse the servlet response
	 * @return the telecarga by folio
	 */
	@RequestMapping(method=RequestMethod.GET,
			produces="application/json",
			value="/consulta")
	@ResponseBody
	public TelecargaDTO getTelecargaByFolio(@RequestParam(required = true) String odtFolioTelecarga,HttpServletRequest servletRequest,HttpServletResponse servletResponse) {
		
		TelecargaDTO response= null;
		logger.info("Consulting folio telecarga: [{}] ", odtFolioTelecarga);
		try {
				response=telecargaServiceImpl.getTelecargaByFolio(odtFolioTelecarga);
		}
		catch(ResponseStatusException rse) {
			logger.error("Error  consulting folio telecarga",rse);
		}
	return response;
	}

}
