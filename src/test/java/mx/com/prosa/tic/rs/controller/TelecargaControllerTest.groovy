package mx.com.prosa.tic.rs.controller;

/*
#java
################################################################################
# Nombre del Programa : TelecargaControllerTest.groovy		       		       #
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

import org.junit.Test
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.server.ResponseStatusException

import mx.com.prosa.tic.model.dto.TelecargaDTO
import mx.com.prosa.tic.service.TelecargaService

import static org.junit.Assert.assertNotNull
import static org.mockito.Mockito.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * The Class TelecargaControllerTest.
 */
@RunWith(MockitoJUnitRunner.class)
class TelecargaControllerTest {
	
	/** The telecarga service. */
	@Mock
	TelecargaService telecargaService;
	
	
	/** The telecarga controller. */
	@InjectMocks
	TelecargaController telecargaController = new TelecargaController();
	
	/**
	 * Gets the telecarga by folio.
	 *
	 * @return the telecarga by folio
	 */
	@Test
	public void getTelecargaByFolio() {
		HttpServletRequest httpRequest;
		HttpServletResponse httpResponse;
		TelecargaDTO response = new TelecargaDTO();
		String odtFolioTelecarga = "159674";
		TelecargaDTO responseExpected = createNonEmptyResponse();
		when(telecargaService.getTelecargaByFolio(any(String.class))).thenReturn(responseExpected);
		response=telecargaController.getTelecargaByFolio(odtFolioTelecarga,httpRequest, httpResponse);
		assertNotNull(response);
	}
	
	/**
	 * Gets the telecarga by folio exception.
	 *
	 * @return the telecarga by folio exception
	 */
	@Test
	public void getTelecargaByFolioException() {	
		HttpServletRequest httpRequest;
		HttpServletResponse httpResponse;
		TelecargaDTO response = new TelecargaDTO();
		String odtFolioTelecarga = "159674";
		TelecargaDTO responseExpected = createNonEmptyResponse();
		when(telecargaService.getTelecargaByFolio(any(String.class))).thenThrow(mock(ResponseStatusException.class));
		response=telecargaController.getTelecargaByFolio(odtFolioTelecarga,httpRequest, httpResponse);
	}
	
	/**
	 * Creates the non empty response.
	 *
	 * @return the telecarga DTO
	 */
	public TelecargaDTO createNonEmptyResponse() {
		
		TelecargaDTO telecarga = new TelecargaDTO();
		
		telecarga.ageViajes= 0;
		telecarga.aplAmex= 0;
		telecarga.aplDescripcion= "RETAIL-PDIFERIDO-Q6-EMV";
		telecarga.aplDiners= 0;
		telecarga.aplNomina= 0;
		telecarga.axActivo= 0;
		telecarga.axPln= 0;
		telecarga.bcoCve= 21;
		telecarga.bcoNombre= "HSBC";
		telecarga.cTram= "021,21/04/1999,000";
		telecarga.comAfiliacion= 7969447;
		telecarga.comCarServicio="30";
		telecarga.comDomicilio= "IGNACIO ALLENDE NO 1025";
		telecarga.comElectronico= 0;
		telecarga.comIva= 15;
		telecarga.comMultimerchant= 0;
		telecarga.comNombre= "BAJA FERRIES VT";
		telecarga.comServicom= 0;
		telecarga.countServicomercios=0;
		telecarga.cpCve= 23000;
		telecarga.cveCarrier= 0;
		telecarga.devCve= 2;
		telecarga.esn= "280452861";
		telecarga.excedeprop= 0;
		telecarga.fechaOdt= new Date();
		telecarga.girCve= 2560;
		telecarga.habAjuste= 0;
		telecarga.habBin=0;
		telecarga.habCifrado= 1;
		telecarga.habDcc= 0;
		telecarga.habImpTicket= 0;
		telecarga.habOpCtls= 0;
		telecarga.habVtaTaire= 0;
		telecarga.idTerminal= "";
		telecarga.indMvs= 0;
		telecarga.ip= "";
		telecarga.leyendaImpresion= "";
		telecarga.llaveBanco="";
		telecarga.logobu= 0;
		telecarga.modMarca= "VERIFONE";
		telecarga.modModelo= "VX-520 ETHERNET";
		telecarga.moneda= 1;
		telecarga.montoImpTicket= 0;
		telecarga.montoMaxOper= "";
		telecarga.numTelecargaDias= 0;
		telecarga.odtFolioTelecarga= 184156;
		telecarga.pais= 1;
		telecarga.pbiNombre= "LA PAZ BCS";
		telecarga.plnDescripcion= "CAPTURA CREDITO";
		telecarga.porcprop= 0;
		telecarga.promociones= "";
		telecarga.puerto= 0;
		telecarga.reseteoSerie= 0;
		telecarga.sicCve= 5969;
		telecarga.solCve= 0;
		telecarga.telAvantel= "8007118409";
		telecarga.telCarrier1= "01800123000";
		telecarga.telCarrier2= "#777";	
		telecarga.telCarrier3= "";
		telecarga.telLocal= "8007118409";
		telecarga.telTelmex= "8008369113";
		telecarga.terCashback= 0;
		telecarga.terId="002";
		telecarga.terIdEncr= "P0886065";
		telecarga.terLimiteDevolucion= 1500;
		telecarga.terMacFlag= 0;
		telecarga.terOperativa= "M";
		telecarga.terPassword= "";
		telecarga.terPostpropina= 0;
		telecarga.terPrepropina= 0;
		telecarga.terProtocolo= 0;
		telecarga.terUser= "";
		telecarga.terVentaForzada= 0;
		telecarga.terVersion= 1;
		
		return telecarga
		
	}
}
