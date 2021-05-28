package mx.com.prosa.tic.service.impl

/*
 #java
 ################################################################################
 # Nombre del Programa : TelecargaServiceImpl.groovy	                        #
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

import javax.persistence.Column
import javax.persistence.Id

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.DataAccessException
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import com.fasterxml.jackson.annotation.JsonProperty

import mx.com.prosa.tic.exception.GenericException
import mx.com.prosa.tic.model.dto.TelecargaDTO
import mx.com.prosa.tic.persistence.dao.TelecargaDao
import mx.com.prosa.tic.persistence.entities.Telecarga1pq98U
import mx.com.prosa.tic.service.TelecargaService

/**
 * The Class TelecargaServiceImpl.
 */
@Service("telecargaServiceImpl")
class TelecargaServiceImpl implements TelecargaService {
	
	/** The logger. */
	Logger logger = LoggerFactory.getLogger(TelecargaServiceImpl.class);
	
	/** The telecarga dao. */
	@Autowired
	TelecargaDao telecargaDao

	/**
	 * Gets the telecarga by folio.
	 *
	 * @param odtFolioTelecarga the odt folio telecarga
	 * @return the telecarga by folio
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public TelecargaDTO getTelecargaByFolio(String odtFolioTelecarga) {
		
		TelecargaDTO responseDTO = new TelecargaDTO();
		Telecarga1pq98U telecarga = new Telecarga1pq98U();
		
		
		try {
			logger.debug("Consulting telecarga by folio: ${odtFolioTelecarga}");
			telecarga = telecargaDao.findTelecargaByFolio( new BigDecimal(odtFolioTelecarga));
			if (telecarga == null){
				logger.debug("No se encontraron registros asocioados al folio telecarga: [${odtFolioTelecarga}]");
				throw new GenericException(
					  HttpStatus.NOT_FOUND, "No se encontraron registros asocioados al folio telecarga [${odtFolioTelecarga}]");
			}else {
				logger.debug("Se encontraron registros asociados al folio telecarga: [${odtFolioTelecarga}] ");
				responseDTO = entityToDto(telecarga)
				responseDTO.setMessage(HttpStatus.OK.getReasonPhrase());
				responseDTO.setStatus(HttpStatus.OK.value());
			}
		}catch (DataAccessException dae){
			logger.error("Error obteniendo registros asocioados al folio ", dae);
			 throw new GenericException(
					  HttpStatus.INTERNAL_SERVER_ERROR, "Failed to get data");
		}
		
		return responseDTO;
	}
	
	/**
	 * Entity to dto.
	 *
	 * @param telecarga the telecarga
	 * @return the telecarga DTO
	 */
	public TelecargaDTO entityToDto (Telecarga1pq98U telecarga) {
		TelecargaDTO dto = new TelecargaDTO()
		dto.ageViajes= telecarga?.ageViajes
		dto.aplAmex= telecarga?.aplAmex
		dto.aplDescripcion= telecarga?.aplDescripcion
		dto.aplDiners= telecarga?.aplDiners
		dto.aplNomina= telecarga?.aplNomina
		dto.axActivo= telecarga?.axActivo
		dto.axPln= telecarga?.axPln
		dto.bcoCve= telecarga?.bcoCve
		dto.bcoNombre= telecarga?.bcoNombre
		dto.cTram= telecarga?.cTram
		dto.comAfiliacion= telecarga?.comAfiliacion
		dto.comCarServicio= telecarga?.comCarServicio
		dto.comDomicilio= telecarga?.comDomicilio
		dto.comElectronico= telecarga?.comElectronico
		dto.comIva= telecarga?.comIva
		dto.comMultimerchant= telecarga?.comMultimerchant
		dto.comNombre= telecarga?.comNombre
		dto.comServicom= telecarga?.comServicom
		dto.countServicomercios= telecarga?.countServicomercios
		dto.cpCve= telecarga?.cpCve
		dto.cveCarrier= telecarga?.cveCarrier
		dto.devCve= telecarga?.devCve
		dto.esn= telecarga?.esn
		dto.excedeprop= telecarga?.excedeprop
		dto.fechaOdt= telecarga?.fechaOdt
		dto.girCve= telecarga?.girCve
		dto.habAjuste= telecarga?.habAjuste
		dto.habBin= telecarga?.habBin
		dto.habCifrado= telecarga?.habCifrado
		dto.habDcc= telecarga?.habDcc
		dto.habImpTicket= telecarga?.habImpTicket
		dto.habOpCtls= telecarga?.habOpCtls
		dto.habVtaTaire= telecarga?.habVtaTaire
		dto.idTerminal= telecarga?.idTerminal
		dto.indMvs= telecarga?.indMvs
		dto.ip= telecarga?.ip
		dto.leyendaImpresion= telecarga?.leyendaImpresion
		dto.llaveBanco= telecarga?.llaveBanco
		dto.logobu= telecarga?.logobu
		dto.modMarca= telecarga?.modMarca
		dto.modModelo= telecarga?.modModelo
		dto.moneda= telecarga?.moneda
		dto.montoImpTicket= telecarga?.montoImpTicket
		dto.montoMaxOper= telecarga?.montoMaxOper
		dto.numTelecargaDias= telecarga?.numTelecargaDias
		dto.odtFolioTelecarga= telecarga?.odtFolioTelecarga
		dto.pais= telecarga?.pais
		dto.pbiNombre= telecarga?.pbiNombre
		dto.plnDescripcion= telecarga?.plnDescripcion
		dto.porcprop= telecarga?.porcprop
		dto.promociones= telecarga?.promociones
		dto.puerto= telecarga?.puerto
		dto.reseteoSerie= telecarga?.reseteoSerie
		dto.sicCve= telecarga?.sicCve
		dto.solCve= telecarga?.solCve
		dto.telAvantel= telecarga?.telAvantel
		dto.telCarrier1= telecarga?.telCarrier1
		dto.telCarrier2= telecarga?.telCarrier2
		dto.telCarrier3= telecarga?.telCarrier3
		dto.telLocal= telecarga?.telLocal
		dto.telTelmex= telecarga?.telTelmex
		dto.terCashback= telecarga?.terCashback
		dto.terId= telecarga?.terId
		dto.terIdEncr= telecarga?.terIdEncr
		dto.terLimiteDevolucion= telecarga?.terLimiteDevolucion
		dto.terMacFlag= telecarga?.terMacFlag
		dto.terOperativa= telecarga?.terOperativa
		dto.terPassword= telecarga?.terPassword
		dto.terPostpropina= telecarga?.terPostpropina
		dto.terPrepropina= telecarga?.terPrepropina
		dto.terProtocolo= telecarga?.terProtocolo
		dto.terUser= telecarga?.terUser
		dto.terVentaForzada= telecarga?.terVentaForzada
		dto.terVersion= telecarga?.terVersion
		return dto;
	}	
}