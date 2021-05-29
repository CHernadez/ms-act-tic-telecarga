package mx.com.prosa.tic.persistence.dao;

/*
#java
################################################################################
# Nombre del Programa : TelecargaDao.java				                       #
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

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.com.prosa.tic.persistence.entities.Telecarga1pq98U;

/**
 * The Interface TelecargaDao.
 */
@Repository
public interface TelecargaDao extends JpaRepository<Telecarga1pq98U, BigDecimal>{
	
	/**
	 * Find telecarga by folio.
	 *
	 * @param odtFolioTelecarga the odt folio telecarga
	 * @return the telecarga 1 pq 98 U
	 */
	@Query("SELECT t FROM Telecarga1pq98U t WHERE t.modMarca = 'INGENICO' and t.odtFolioTelecarga =?1")
	Telecarga1pq98U findTelecargaByFolio(BigDecimal odtFolioTelecarga);
}
