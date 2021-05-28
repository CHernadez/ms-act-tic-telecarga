package mx.com.prosa.tic.persistence.entities;

/*
#java
################################################################################
# Nombre del Programa : Telecarga1pq98U.java			                       #
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

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TELECARGA1PQ98_U database table.
 * 
 */
@Entity
@Table(name="TELECARGA1PQ98_U")
@NamedQuery(name="Telecarga1pq98U.findAll", query="SELECT t FROM Telecarga1pq98U t")
public class Telecarga1pq98U implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AGE_VIAJES")
	private BigDecimal ageViajes;

	@Column(name="APL_AMEX")
	private BigDecimal aplAmex;

	@Column(name="APL_DESCRIPCION")
	private String aplDescripcion;

	@Column(name="APL_DINERS")
	private BigDecimal aplDiners;

	@Column(name="APL_NOMINA")
	private BigDecimal aplNomina;

	@Column(name="AX_ACTIVO")
	private BigDecimal axActivo;

	@Column(name="AX_PLN")
	private BigDecimal axPln;

	@Column(name="BCO_CVE")
	private BigDecimal bcoCve;

	@Column(name="BCO_NOMBRE")
	private String bcoNombre;

	@Column(name="C_TRAM")
	private String cTram;

	@Column(name="COM_AFILIACION")
	private BigDecimal comAfiliacion;

	@Column(name="COM_CAR_SERVICIO")
	private String comCarServicio;

	@Column(name="COM_DOMICILIO")
	private String comDomicilio;

	@Column(name="COM_ELECTRONICO")
	private BigDecimal comElectronico;

	@Column(name="COM_IVA")
	private BigDecimal comIva;

	@Column(name="COM_MULTIMERCHANT")
	private BigDecimal comMultimerchant;

	@Column(name="COM_NOMBRE")
	private String comNombre;

	@Column(name="COM_SERVICOM")
	private BigDecimal comServicom;

	@Column(name="COUNT_SERVICOMERCIOS")
	private BigDecimal countServicomercios;

	@Column(name="CP_CVE")
	private BigDecimal cpCve;

	@Column(name="CVE_CARRIER")
	private BigDecimal cveCarrier;

	@Column(name="DEV_CVE")
	private BigDecimal devCve;

	private String esn;

	private BigDecimal excedeprop;

	@Column(name="FECHA_ODT")
	private Date fechaOdt;

	@Column(name="GIR_CVE")
	private BigDecimal girCve;

	@Column(name="HAB_AJUSTE")
	private BigDecimal habAjuste;

	@Column(name="HAB_BIN")
	private BigDecimal habBin;

	@Column(name="HAB_CIFRADO")
	private BigDecimal habCifrado;

	@Column(name="HAB_DCC")
	private BigDecimal habDcc;

	@Column(name="HAB_IMP_TICKET")
	private BigDecimal habImpTicket;

	@Column(name="HAB_OP_CTLS")
	private BigDecimal habOpCtls;

	@Column(name="HAB_VTA_TAIRE")
	private BigDecimal habVtaTaire;

	@Column(name="ID_TERMINAL")
	private String idTerminal;

	@Column(name="IND_MVS")
	private BigDecimal indMvs;

	private String ip;

	@Column(name="LEYENDA_IMPRESION")
	private String leyendaImpresion;

	@Column(name="LLAVE_BANCO")
	private String llaveBanco;

	private BigDecimal logobu;

	@Column(name="MOD_MARCA")
	private String modMarca;

	@Column(name="MOD_MODELO")
	private String modModelo;

	private BigDecimal moneda;

	@Column(name="MONTO_IMP_TICKET")
	private BigDecimal montoImpTicket;

	@Column(name="MONTO_MAX_OPER")
	private String montoMaxOper;

	@Column(name="NUM_TELECARGA_DIAS")
	private BigDecimal numTelecargaDias;

	@Id
	@Column(name="ODT_FOLIO_TELECARGA")
	private BigDecimal odtFolioTelecarga;

	private BigDecimal pais;

	@Column(name="PBI_NOMBRE")
	private String pbiNombre;

	@Column(name="PLN_DESCRIPCION")
	private String plnDescripcion;

	private BigDecimal porcprop;

	private String promociones;

	private BigDecimal puerto;

	@Column(name="RESETEO_SERIE")
	private BigDecimal reseteoSerie;

	@Column(name="SIC_CVE")
	private BigDecimal sicCve;

	@Column(name="SOL_CVE")
	private BigDecimal solCve;

	@Column(name="TEL_AVANTEL")
	private String telAvantel;

	@Column(name="TEL_CARRIER_1")
	private String telCarrier1;

	@Column(name="TEL_CARRIER_2")
	private String telCarrier2;

	@Column(name="TEL_CARRIER_3")
	private String telCarrier3;

	@Column(name="TEL_LOCAL")
	private String telLocal;

	@Column(name="TEL_TELMEX")
	private String telTelmex;

	@Column(name="TER_CASHBACK")
	private BigDecimal terCashback;

	@Column(name="TER_ID")
	private String terId;

	@Column(name="TER_ID_ENCR")
	private String terIdEncr;

	@Column(name="TER_LIMITE_DEVOLUCION")
	private BigDecimal terLimiteDevolucion;

	@Column(name="TER_MAC_FLAG")
	private BigDecimal terMacFlag;

	@Column(name="TER_OPERATIVA")
	private String terOperativa;

	@Column(name="TER_PASSWORD")
	private String terPassword;

	@Column(name="TER_POSTPROPINA")
	private BigDecimal terPostpropina;

	@Column(name="TER_PREPROPINA")
	private BigDecimal terPrepropina;

	@Column(name="TER_PROTOCOLO")
	private BigDecimal terProtocolo;

	@Column(name="TER_USER")
	private String terUser;

	@Column(name="TER_VENTA_FORZADA")
	private BigDecimal terVentaForzada;

	@Column(name="TER_VERSION")
	private BigDecimal terVersion;

	public Telecarga1pq98U() {
	}

	public BigDecimal getAgeViajes() {
		return this.ageViajes;
	}

	public void setAgeViajes(BigDecimal ageViajes) {
		this.ageViajes = ageViajes;
	}

	public BigDecimal getAplAmex() {
		return this.aplAmex;
	}

	public void setAplAmex(BigDecimal aplAmex) {
		this.aplAmex = aplAmex;
	}

	public String getAplDescripcion() {
		return this.aplDescripcion;
	}

	public void setAplDescripcion(String aplDescripcion) {
		this.aplDescripcion = aplDescripcion;
	}

	public BigDecimal getAplDiners() {
		return this.aplDiners;
	}

	public void setAplDiners(BigDecimal aplDiners) {
		this.aplDiners = aplDiners;
	}

	public BigDecimal getAplNomina() {
		return this.aplNomina;
	}

	public void setAplNomina(BigDecimal aplNomina) {
		this.aplNomina = aplNomina;
	}

	public BigDecimal getAxActivo() {
		return this.axActivo;
	}

	public void setAxActivo(BigDecimal axActivo) {
		this.axActivo = axActivo;
	}

	public BigDecimal getAxPln() {
		return this.axPln;
	}

	public void setAxPln(BigDecimal axPln) {
		this.axPln = axPln;
	}

	public BigDecimal getBcoCve() {
		return this.bcoCve;
	}

	public void setBcoCve(BigDecimal bcoCve) {
		this.bcoCve = bcoCve;
	}

	public String getBcoNombre() {
		return this.bcoNombre;
	}

	public void setBcoNombre(String bcoNombre) {
		this.bcoNombre = bcoNombre;
	}

	public String getCTram() {
		return this.cTram;
	}

	public void setCTram(String cTram) {
		this.cTram = cTram;
	}

	public BigDecimal getComAfiliacion() {
		return this.comAfiliacion;
	}

	public void setComAfiliacion(BigDecimal comAfiliacion) {
		this.comAfiliacion = comAfiliacion;
	}

	public String getComCarServicio() {
		return this.comCarServicio;
	}

	public void setComCarServicio(String comCarServicio) {
		this.comCarServicio = comCarServicio;
	}

	public String getComDomicilio() {
		return this.comDomicilio;
	}

	public void setComDomicilio(String comDomicilio) {
		this.comDomicilio = comDomicilio;
	}

	public BigDecimal getComElectronico() {
		return this.comElectronico;
	}

	public void setComElectronico(BigDecimal comElectronico) {
		this.comElectronico = comElectronico;
	}

	public BigDecimal getComIva() {
		return this.comIva;
	}

	public void setComIva(BigDecimal comIva) {
		this.comIva = comIva;
	}

	public BigDecimal getComMultimerchant() {
		return this.comMultimerchant;
	}

	public void setComMultimerchant(BigDecimal comMultimerchant) {
		this.comMultimerchant = comMultimerchant;
	}

	public String getComNombre() {
		return this.comNombre;
	}

	public void setComNombre(String comNombre) {
		this.comNombre = comNombre;
	}

	public BigDecimal getComServicom() {
		return this.comServicom;
	}

	public void setComServicom(BigDecimal comServicom) {
		this.comServicom = comServicom;
	}

	public BigDecimal getCountServicomercios() {
		return this.countServicomercios;
	}

	public void setCountServicomercios(BigDecimal countServicomercios) {
		this.countServicomercios = countServicomercios;
	}

	public BigDecimal getCpCve() {
		return this.cpCve;
	}

	public void setCpCve(BigDecimal cpCve) {
		this.cpCve = cpCve;
	}

	public BigDecimal getCveCarrier() {
		return this.cveCarrier;
	}

	public void setCveCarrier(BigDecimal cveCarrier) {
		this.cveCarrier = cveCarrier;
	}

	public BigDecimal getDevCve() {
		return this.devCve;
	}

	public void setDevCve(BigDecimal devCve) {
		this.devCve = devCve;
	}

	public String getEsn() {
		return this.esn;
	}

	public void setEsn(String esn) {
		this.esn = esn;
	}

	public BigDecimal getExcedeprop() {
		return this.excedeprop;
	}

	public void setExcedeprop(BigDecimal excedeprop) {
		this.excedeprop = excedeprop;
	}

	public Object getFechaOdt() {
		return this.fechaOdt;
	}

	public void setFechaOdt(Date fechaOdt) {
		this.fechaOdt = fechaOdt;
	}

	public BigDecimal getGirCve() {
		return this.girCve;
	}

	public void setGirCve(BigDecimal girCve) {
		this.girCve = girCve;
	}

	public BigDecimal getHabAjuste() {
		return this.habAjuste;
	}

	public void setHabAjuste(BigDecimal habAjuste) {
		this.habAjuste = habAjuste;
	}

	public BigDecimal getHabBin() {
		return this.habBin;
	}

	public void setHabBin(BigDecimal habBin) {
		this.habBin = habBin;
	}

	public BigDecimal getHabCifrado() {
		return this.habCifrado;
	}

	public void setHabCifrado(BigDecimal habCifrado) {
		this.habCifrado = habCifrado;
	}

	public BigDecimal getHabDcc() {
		return this.habDcc;
	}

	public void setHabDcc(BigDecimal habDcc) {
		this.habDcc = habDcc;
	}

	public BigDecimal getHabImpTicket() {
		return this.habImpTicket;
	}

	public void setHabImpTicket(BigDecimal habImpTicket) {
		this.habImpTicket = habImpTicket;
	}

	public BigDecimal getHabOpCtls() {
		return this.habOpCtls;
	}

	public void setHabOpCtls(BigDecimal habOpCtls) {
		this.habOpCtls = habOpCtls;
	}

	public BigDecimal getHabVtaTaire() {
		return this.habVtaTaire;
	}

	public void setHabVtaTaire(BigDecimal habVtaTaire) {
		this.habVtaTaire = habVtaTaire;
	}

	public String getIdTerminal() {
		return this.idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}

	public BigDecimal getIndMvs() {
		return this.indMvs;
	}

	public void setIndMvs(BigDecimal indMvs) {
		this.indMvs = indMvs;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLeyendaImpresion() {
		return this.leyendaImpresion;
	}

	public void setLeyendaImpresion(String leyendaImpresion) {
		this.leyendaImpresion = leyendaImpresion;
	}

	public String getLlaveBanco() {
		return this.llaveBanco;
	}

	public void setLlaveBanco(String llaveBanco) {
		this.llaveBanco = llaveBanco;
	}

	public BigDecimal getLogobu() {
		return this.logobu;
	}

	public void setLogobu(BigDecimal logobu) {
		this.logobu = logobu;
	}

	public String getModMarca() {
		return this.modMarca;
	}

	public void setModMarca(String modMarca) {
		this.modMarca = modMarca;
	}

	public String getModModelo() {
		return this.modModelo;
	}

	public void setModModelo(String modModelo) {
		this.modModelo = modModelo;
	}

	public BigDecimal getMoneda() {
		return this.moneda;
	}

	public void setMoneda(BigDecimal moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getMontoImpTicket() {
		return this.montoImpTicket;
	}

	public void setMontoImpTicket(BigDecimal montoImpTicket) {
		this.montoImpTicket = montoImpTicket;
	}

	public String getMontoMaxOper() {
		return this.montoMaxOper;
	}

	public void setMontoMaxOper(String montoMaxOper) {
		this.montoMaxOper = montoMaxOper;
	}

	public BigDecimal getNumTelecargaDias() {
		return this.numTelecargaDias;
	}

	public void setNumTelecargaDias(BigDecimal numTelecargaDias) {
		this.numTelecargaDias = numTelecargaDias;
	}

	public BigDecimal getOdtFolioTelecarga() {
		return this.odtFolioTelecarga;
	}

	public void setOdtFolioTelecarga(BigDecimal odtFolioTelecarga) {
		this.odtFolioTelecarga = odtFolioTelecarga;
	}

	public BigDecimal getPais() {
		return this.pais;
	}

	public void setPais(BigDecimal pais) {
		this.pais = pais;
	}

	public String getPbiNombre() {
		return this.pbiNombre;
	}

	public void setPbiNombre(String pbiNombre) {
		this.pbiNombre = pbiNombre;
	}

	public String getPlnDescripcion() {
		return this.plnDescripcion;
	}

	public void setPlnDescripcion(String plnDescripcion) {
		this.plnDescripcion = plnDescripcion;
	}

	public BigDecimal getPorcprop() {
		return this.porcprop;
	}

	public void setPorcprop(BigDecimal porcprop) {
		this.porcprop = porcprop;
	}

	public String getPromociones() {
		return this.promociones;
	}

	public void setPromociones(String promociones) {
		this.promociones = promociones;
	}

	public BigDecimal getPuerto() {
		return this.puerto;
	}

	public void setPuerto(BigDecimal puerto) {
		this.puerto = puerto;
	}

	public BigDecimal getReseteoSerie() {
		return this.reseteoSerie;
	}

	public void setReseteoSerie(BigDecimal reseteoSerie) {
		this.reseteoSerie = reseteoSerie;
	}

	public BigDecimal getSicCve() {
		return this.sicCve;
	}

	public void setSicCve(BigDecimal sicCve) {
		this.sicCve = sicCve;
	}

	public BigDecimal getSolCve() {
		return this.solCve;
	}

	public void setSolCve(BigDecimal solCve) {
		this.solCve = solCve;
	}

	public String getTelAvantel() {
		return this.telAvantel;
	}

	public void setTelAvantel(String telAvantel) {
		this.telAvantel = telAvantel;
	}

	public String getTelCarrier1() {
		return this.telCarrier1;
	}

	public void setTelCarrier1(String telCarrier1) {
		this.telCarrier1 = telCarrier1;
	}

	public String getTelCarrier2() {
		return this.telCarrier2;
	}

	public void setTelCarrier2(String telCarrier2) {
		this.telCarrier2 = telCarrier2;
	}

	public String getTelCarrier3() {
		return this.telCarrier3;
	}

	public void setTelCarrier3(String telCarrier3) {
		this.telCarrier3 = telCarrier3;
	}

	public String getTelLocal() {
		return this.telLocal;
	}

	public void setTelLocal(String telLocal) {
		this.telLocal = telLocal;
	}

	public String getTelTelmex() {
		return this.telTelmex;
	}

	public void setTelTelmex(String telTelmex) {
		this.telTelmex = telTelmex;
	}

	public BigDecimal getTerCashback() {
		return this.terCashback;
	}

	public void setTerCashback(BigDecimal terCashback) {
		this.terCashback = terCashback;
	}

	public String getTerId() {
		return this.terId;
	}

	public void setTerId(String terId) {
		this.terId = terId;
	}

	public String getTerIdEncr() {
		return this.terIdEncr;
	}

	public void setTerIdEncr(String terIdEncr) {
		this.terIdEncr = terIdEncr;
	}

	public BigDecimal getTerLimiteDevolucion() {
		return this.terLimiteDevolucion;
	}

	public void setTerLimiteDevolucion(BigDecimal terLimiteDevolucion) {
		this.terLimiteDevolucion = terLimiteDevolucion;
	}

	public BigDecimal getTerMacFlag() {
		return this.terMacFlag;
	}

	public void setTerMacFlag(BigDecimal terMacFlag) {
		this.terMacFlag = terMacFlag;
	}

	public String getTerOperativa() {
		return this.terOperativa;
	}

	public void setTerOperativa(String terOperativa) {
		this.terOperativa = terOperativa;
	}

	public String getTerPassword() {
		return this.terPassword;
	}

	public void setTerPassword(String terPassword) {
		this.terPassword = terPassword;
	}

	public BigDecimal getTerPostpropina() {
		return this.terPostpropina;
	}

	public void setTerPostpropina(BigDecimal terPostpropina) {
		this.terPostpropina = terPostpropina;
	}

	public BigDecimal getTerPrepropina() {
		return this.terPrepropina;
	}

	public void setTerPrepropina(BigDecimal terPrepropina) {
		this.terPrepropina = terPrepropina;
	}

	public BigDecimal getTerProtocolo() {
		return this.terProtocolo;
	}

	public void setTerProtocolo(BigDecimal terProtocolo) {
		this.terProtocolo = terProtocolo;
	}

	public String getTerUser() {
		return this.terUser;
	}

	public void setTerUser(String terUser) {
		this.terUser = terUser;
	}

	public BigDecimal getTerVentaForzada() {
		return this.terVentaForzada;
	}

	public void setTerVentaForzada(BigDecimal terVentaForzada) {
		this.terVentaForzada = terVentaForzada;
	}

	public BigDecimal getTerVersion() {
		return this.terVersion;
	}

	public void setTerVersion(BigDecimal terVersion) {
		this.terVersion = terVersion;
	}

}