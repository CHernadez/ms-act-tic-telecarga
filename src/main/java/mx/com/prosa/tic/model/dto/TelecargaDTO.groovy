package mx.com.prosa.tic.model.dto;

/*
 #java
 ################################################################################
 # Nombre del Programa : TelecargaDTO.groovy				                    #
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

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * The Class TelecargaDTO.
 */
public class TelecargaDTO {

	/** The status. */
	@JsonProperty("status")
	int status;
	
	/** The message. */
	@JsonProperty("message")
	String message;
	
	/** The age viajes. */
	@JsonProperty("ageViajes")
	BigDecimal ageViajes;

	/** The apl amex. */
	@JsonProperty("aplAmex")
	BigDecimal aplAmex;

	/** The apl descripcion. */
	@JsonProperty("aplDescripcion")
	String aplDescripcion;

	/** The apl diners. */
	@JsonProperty("aplDiners")
	BigDecimal aplDiners;

	/** The apl nomina. */
	@JsonProperty("aplNomina")
	BigDecimal aplNomina;

	/** The ax activo. */
	@JsonProperty("axActivo")
	BigDecimal axActivo;

	/** The ax pln. */
	@JsonProperty("axPln")
	BigDecimal axPln;

	/** The bco cve. */
	@JsonProperty("bcoCve")
	BigDecimal bcoCve;

	/** The bco nombre. */
	@JsonProperty("bcoNombre")
	String bcoNombre;

	/** The c tram. */
	@JsonProperty("cTram")
	String cTram;

	/** The com afiliacion. */
	@JsonProperty("comAfiliacion")
	BigDecimal comAfiliacion;

	/** The com car servicio. */
	@JsonProperty("comCarServicio")
	String comCarServicio;

	/** The com domicilio. */
	@JsonProperty("comDomicilio")
	String comDomicilio;

	/** The com electronico. */
	@JsonProperty("comElectronico")
	BigDecimal comElectronico;

	/** The com iva. */
	@JsonProperty("comIva")
	BigDecimal comIva;

	/** The com multimerchant. */
	@JsonProperty("comMultimerchant")
	BigDecimal comMultimerchant;

	/** The com nombre. */
	@JsonProperty("comNombre")
	String comNombre;

	/** The com servicom. */
	@JsonProperty("comServicom")
	BigDecimal comServicom;

	/** The count servicomercios. */
	@JsonProperty("countServicomercios")
	BigDecimal countServicomercios;

	/** The cp cve. */
	@JsonProperty("cpCve")
	BigDecimal cpCve;

	/** The cve carrier. */
	@JsonProperty("cveCarrier")
	BigDecimal cveCarrier;

	/** The dev cve. */
	@JsonProperty("devCve")
	BigDecimal devCve;

	/** The esn. */
	@JsonProperty("esn")
	String esn;

	/** The excedeprop. */
	@JsonProperty("excedeprop")
	BigDecimal excedeprop;

	/** The fecha odt. */
	@JsonProperty("fechaOdt")
	Object fechaOdt;

	/** The gir cve. */
	@JsonProperty("girCve")
	BigDecimal girCve;

	/** The hab ajuste. */
	@JsonProperty("habAjuste")
	BigDecimal habAjuste;

	/** The hab bin. */
	@JsonProperty("habBin")
	BigDecimal habBin;

	/** The hab cifrado. */
	@JsonProperty("habCifrado")
	BigDecimal habCifrado;

	/** The hab dcc. */
	@JsonProperty("habDcc")
	BigDecimal habDcc;

	/** The hab imp ticket. */
	@JsonProperty("habImpTicket")
	BigDecimal habImpTicket;

	/** The hab op ctls. */
	@JsonProperty("habOpCtls")
	BigDecimal habOpCtls;

	/** The hab vta taire. */
	@JsonProperty("habVtaTaire")
	BigDecimal habVtaTaire;

	/** The id terminal. */
	@JsonProperty("idTerminal")
	String idTerminal;

	/** The ind mvs. */
	@JsonProperty("indMvs")
	BigDecimal indMvs;

	/** The ip. */
	@JsonProperty("ip")
	String ip;

	/** The leyenda impresion. */
	@JsonProperty("leyendaImpresion")
	String leyendaImpresion;

	/** The llave banco. */
	@JsonProperty("llaveBanco")
	String llaveBanco;

	/** The logobu. */
	@JsonProperty("logobu")
	BigDecimal logobu;

	/** The mod marca. */
	@JsonProperty("modMarca")
	String modMarca;

	/** The mod modelo. */
	@JsonProperty("modModelo")
	String modModelo;

	/** The moneda. */
	@JsonProperty("moneda")
	BigDecimal moneda;

	/** The monto imp ticket. */
	@JsonProperty("montoImpTicket")
	BigDecimal montoImpTicket;

	/** The monto max oper. */
	@JsonProperty("montoMaxOper")
	String montoMaxOper;

	/** The num telecarga dias. */
	@JsonProperty("numTelecargaDias")
	BigDecimal numTelecargaDias;

	/** The odt folio telecarga. */
	@JsonProperty("odtFolioTelecarga")
	BigDecimal odtFolioTelecarga;

	/** The pais. */
	@JsonProperty("pais")
	BigDecimal pais;

	/** The pbi nombre. */
	@JsonProperty("pbiNombre")
	String pbiNombre;

	/** The pln descripcion. */
	@JsonProperty("plnDescripcion")
	String plnDescripcion;

	/** The porcprop. */
	@JsonProperty("porcprop")
	BigDecimal porcprop;

	/** The promociones. */
	@JsonProperty("promociones")
	String promociones;

	/** The puerto. */
	@JsonProperty("puerto")
	BigDecimal puerto;

	/** The reseteo serie. */
	@JsonProperty("reseteoSerie")
	BigDecimal reseteoSerie;

	/** The sic cve. */
	@JsonProperty("sicCve")
	BigDecimal sicCve;

	/** The sol cve. */
	@JsonProperty("solCve")
	BigDecimal solCve;

	/** The tel avantel. */
	@JsonProperty("telAvantel")
	String telAvantel;

	/** The tel carrier 1. */
	@JsonProperty("telCarrier1")
	String telCarrier1;

	/** The tel carrier 2. */
	@JsonProperty("telCarrier2")
	String telCarrier2;

	/** The tel carrier 3. */
	@JsonProperty("telCarrier3")
	String telCarrier3;

	/** The tel local. */
	@JsonProperty("telLocal")
	String telLocal;

	/** The tel telmex. */
	@JsonProperty("telTelmex")
	String telTelmex;

	/** The ter cashback. */
	@JsonProperty("terCashback")
	BigDecimal terCashback;

	/** The ter id. */
	@JsonProperty("terId")
	String terId;

	/** The ter id encr. */
	@JsonProperty("terIdEncr")
	String terIdEncr;

	/** The ter limite devolucion. */
	@JsonProperty("terLimiteDevolucion")
	BigDecimal terLimiteDevolucion;

	/** The ter mac flag. */
	@JsonProperty("terMacFlag")
	BigDecimal terMacFlag;

	/** The ter operativa. */
	@JsonProperty("terOperativa")
	String terOperativa;

	/** The ter password. */
	@JsonProperty("terPassword")
	String terPassword;

	/** The ter postpropina. */
	@JsonProperty("terPostpropina")
	BigDecimal terPostpropina;

	/** The ter prepropina. */
	@JsonProperty("terPrepropina")
	BigDecimal terPrepropina;

	/** The ter protocolo. */
	@JsonProperty("terProtocolo")
	BigDecimal terProtocolo;

	/** The ter user. */
	@JsonProperty("terUser")
	String terUser;

	/** The ter venta forzada. */
	@JsonProperty("terVentaForzada")
	BigDecimal terVentaForzada;

	/** The ter version. */
	@JsonProperty("terVersion")
	BigDecimal terVersion;
}
