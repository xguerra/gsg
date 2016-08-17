package com.gsgtech.gapp.social.google.api.analytics;

import java.util.Map;

/**
 * Define las operaciones para la API de informes de embudos multicanal que te permite solicitar 
 * datos de embudos multicanal de un usuario autenticado. Los datos se deducen a partir de los 
 * datos de ruta de conversión, que muestra las interacciones de usuario con diferentes fuentes 
 * de tráfico sobre varias sesiones antes de realizar la conversión. De este modo se puede 
 * analizar el modo en que varios canales de marketing influyen en las conversiones a lo largo 
 * del tiempo.
 * 
 * @author Xavier Guerra
 */

public interface MultiChanelFunnelOperations {
	
	/** Único método para obtener información de la API.
	 * @param idView ID de tabla único con el formato ga:XXXX, donde XXXX es el ID de 
	 *        vista (perfil) de Analytics del que la consulta recuperará los datos.
	 * @param start-date Fecha de inicio para recuperar los datos de Analytics. En las 
	 *        solicitudes se puede especificar una fecha de inicio con el formato AAAA-MM-DD 
	 *        o una fecha relativa (por ejemplo, today, yesterday o NdaysAgo donde N es un 
	 *        entero positivo). (Campo Obligatorio)
	 * @param end-date Fecha de finalización para recuperar los datos de Analytics. En las 
	 *        solicitudes se puede especificar una fecha de inicio con el formato AAAA-MM-DD 
	 *        o una fecha relativa (por ejemplo, today, yesterday o NdaysAgo donde N es un 
	 *        entero positivo). (Campo Obligatorio) 
	 * @param metrics Lista de métricas separadas por comas, como mcf:totalConversions,
	 *        mcf:totalConversionValue. En una consulta válida se debe especificar al menos 
	 *        una métrica. (Campo obligatorio)
	 * @param otherParameters un mapa con datos clave valor que con tiene la información del
	 *        resto de los parámetros que se pueden agregar a la consulta del API. Los cuales
	 *        son los siguientes:
	 *        dimensions = Lista de dimensiones separadas por comas del informe de embudos 
	 *        multicanal, como mcf:source,mcf:keyword.
	 *        sort = Lista de dimensiones y métricas separadas por comas que indica el orden 
	 *        y la dirección de clasificación de los datos devueltos.
	 *        filters = Filtros de dimensión o métrica que limitan los datos devueltos para la
	 *        solicitud. La sintaxis debe consultarse en la página oficial de la API.
	 *        segment = Segmenta los datos devueltos para la solicitud.Puede ser el ID de uno ya
	 *        creado o armar uno, mayor información en la página oficial de la API.
	 *        samplingLevel = Nivel de muestreo deseado. Valores permitidos:
	 *            DEFAULT: devuelve una respuesta con un tamaño de muestra que equilibra 
	 *            velocidad y exactitud.
	 *            FASTER: devuelve una respuesta rápida con un tamaño de muestra menor.
	 *            HIGHER_PRECISION: devuelve una respuesta más exacta con un tamaño de muestra 
	 *            grande, pero puede provocar que la respuesta sea más lenta.
	 *        start-index = Primera fila de los datos para recuperar, empezando en 1. 
	 *        Utiliza este parámetro como un mecanismo de paginación junto con el parámetro 
	 *        max-results.
	 *        max-results = Número máximo de filas que se incluirán en la respuesta.
	 *         
	 * @return Una entidad MultiChanelFunnelsReports la cual posee metodos para obtener los 
	 * resultados deseados.
	 */
	MultiChanelFunnelsReports getMultiChanelFunnelsReports(String idView, String starDate, 
			String endDate,	String metrics, Map<String, String> parameters);
	
}
