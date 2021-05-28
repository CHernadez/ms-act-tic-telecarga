package mx.com.prosa.tic.service.impl;

/*
#java
################################################################################
# Nombre del Programa : TelecargaServiceImplTest.groovy		       		       #
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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.dao.DataAccessException

import mx.com.prosa.tic.exception.GenericException
import mx.com.prosa.tic.model.dto.TelecargaDTO
import mx.com.prosa.tic.persistence.dao.TelecargaDao
import mx.com.prosa.tic.persistence.entities.Telecarga1pq98U
import mx.com.prosa.tic.service.TelecargaService

import static org.junit.Assert.assertNotNull
import static org.mockito.Mockito.*;

/**
 * The Class TelecargaServiceImplTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class TelecargaServiceImplTest {
	
	/** The telecarga dao. */
	@Mock
    TelecargaDao telecargaDao;
	
	/** The telecarga service. */
	@InjectMocks
	TelecargaService telecargaService = new TelecargaServiceImpl();
	
	/**
	 * Gets the telecarga by folio.
	 *
	 * @return the telecarga by folio
	 */
	@Test 
	public void getTelecargaByFolio() {
		String folioTelecarga = "159674"
		TelecargaDTO response = new TelecargaDTO()
		Telecarga1pq98U result = createNonEmptyResult();
		when(telecargaDao.findTelecargaByFolio(any(BigDecimal.class))).thenReturn(result);
		response = telecargaService.getTelecargaByFolio(folioTelecarga);
		assertNotNull(response);		
	}
	
	/**
	 * Gets the telecarga by folio empty.
	 *
	 * @return the telecarga by folio empty
	 */
	@Test(expected = GenericException.class)
	public void getTelecargaByFolioEmpty() {
		String folioTelecarga = "159674"
		Telecarga1pq98U result = null
		when(telecargaDao.findTelecargaByFolio(any(BigDecimal.class))).thenReturn(result);
		telecargaService.getTelecargaByFolio(folioTelecarga);
	}
	
	/**
	 * Gets the telecarga by folio data access exception.
	 *
	 * @return the telecarga by folio data access exception
	 */
	@Test(expected = GenericException.class)
	public void getTelecargaByFolioDataAccessException() {
		String folioTelecarga = "159674"
		TelecargaDTO response = new TelecargaDTO()
		Telecarga1pq98U result = null
		when(telecargaDao.findTelecargaByFolio(any(BigDecimal.class))).thenThrow(mock(DataAccessException.class));
		response = telecargaService.getTelecargaByFolio(folioTelecarga);
	}
	
	/**
	 * Creates the non empty result.
	 *
	 * @return the telecarga 1 pq 98 U
	 */
	public Telecarga1pq98U createNonEmptyResult(){
				
		Telecarga1pq98U entity = new Telecarga1pq98U();
		entity.ageViajes= 0;
		entity.aplAmex= 0;
		entity.aplDescripcion= "RETAIL-PDIFERIDO-Q6-EMV";
		entity.aplDiners= 0;
		entity.aplNomina= 0;
		entity.axActivo= 0;
		entity.axPln= 0;
		entity.bcoCve= 21;
		entity.bcoNombre= "HSBC";
		entity.cTram= "021,21/04/1999,000";
		entity.comAfiliacion= 7969447;
		entity.comCarServicio="30";
		entity.comDomicilio= "IGNACIO ALLENDE NO 1025";
		entity.comElectronico= 0;
		entity.comIva= 15;
		entity.comMultimerchant= 0;
		entity.comNombre= "BAJA FERRIES VT";
		entity.comServicom= 0;
		entity.countServicomercios=0;
		entity.cpCve= 23000;
		entity.cveCarrier= 0;
		entity.devCve= 2;
		entity.esn= "280452861";
		entity.excedeprop= 0;
		entity.fechaOdt= new Date();
		entity.girCve= 2560;
		entity.habAjuste= 0;
		entity.habBin=0;
		entity.habCifrado= 1;
		entity.habDcc= 0;
		entity.habImpTicket= 0;
		entity.habOpCtls= 0;
		entity.habVtaTaire= 0;
		entity.idTerminal= "";
		entity.indMvs= 0;
		entity.ip= null;
		entity.leyendaImpresion= "";
		entity.llaveBanco="";
		entity.logobu= 0;
		entity.modMarca= "VERIFONE";
		entity.modModelo= "VX-520 ETHERNET";
		entity.moneda= 1;
		entity.montoImpTicket= 0;
		entity.montoMaxOper= "";
		entity.numTelecargaDias= 0;
		entity.odtFolioTelecarga= 184156;
		entity.pais= 1;
		entity.pbiNombre= "LA PAZ BCS";
		entity.plnDescripcion= "CAPTURA CREDITO";
		entity.porcprop= 0;
		entity.promociones= "";
		entity.puerto= 0;
		entity.reseteoSerie= 0;
		entity.sicCve= 5969;
		entity.solCve= 0;
		entity.telAvantel= "8007118409";
		entity.telCarrier1= "01800123000";
		entity.telCarrier2= "#777";	
		entity.telCarrier3= "";
		entity.telLocal= "8007118409";
		entity.telTelmex= "8008369113";
		entity.terCashback= 0;
		entity.terId="002";
		entity.terIdEncr= "P0886065";
		entity.terLimiteDevolucion= 1500;
		entity.terMacFlag= 0;
		entity.terOperativa= "M";
		entity.terPassword= "";
		entity.terPostpropina= 0;
		entity.terPrepropina= 0;
		entity.terProtocolo= 0;
		entity.terUser= "";
		entity.terVentaForzada= 0;
		entity.terVersion= 1;
				
		return entity
	}

}
