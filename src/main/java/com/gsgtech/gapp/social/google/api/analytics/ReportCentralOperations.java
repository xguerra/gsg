package com.gsgtech.gapp.social.google.api.analytics;

import java.util.Map;

/**
 * Define las operaciones para la API de informes centrales que devuelve datos de informe que 
 * constan de estadísticas derivadas de los datos que se han recopilado mediante el 
 * código de seguimiento de Google Analytics. Cada informe está organizado como dimensiones y 
 * métricas. La API de informes centrales se utiliza para consultar las dimensiones y las métricas 
 * para crear informes personalizados..
 * 
 * @author Xavier Guerra
 */
public interface ReportCentralOperations {
	
	/** Único método para obtener información de la API.
	 * @param idView ID de tabla único con el formato ga:XXXX, donde XXXX es el ID de 
	 *        vista (perfil) de Analytics del que la consulta recuperará los datos.
	 * @param start-date Fecha de inicio para recuperar los datos de Analytics. En las 
	 *        solicitudes se puede especificar una fecha de inicio con el formato AAAA-MM-DD 
	 *        o una fecha relativa (por ejemplo, today, yesterday o NdaysAgo donde N es un 
	 *        entero positivo).
	 * @param end-date Fecha de finalización para recuperar los datos de Analytics. En las 
	 *        solicitudes se puede especificar una fecha de inicio con el formato AAAA-MM-DD 
	 *        o una fecha relativa (por ejemplo, today, yesterday o NdaysAgo donde N es un 
	 *        entero positivo).  
	 * @param metrics Lista de métricas separadas por comas, como ga:sessions,ga:bounces.
	 * @param otherParameters un mapa con datos clave valor que con tiene la información del
	 *        resto de los parámetros que se pueden agregar a la consulta del API. Los cuales
	 *        son los siguientes 
	 *        dimensions = Lista de dimensiones separadas por comas de los datos de Analytics, 
	 *        como ga:browser,ga:city.
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
	 *        include-empty-rows = Booleano para indicar si incluye filas vacias, Verdadero por
	 *        defecto.
	 *        start-index = Primera fila de los datos para recuperar, empezando en 1. 
	 *        Utiliza este parámetro como un mecanismo de paginación junto con el parámetro 
	 *        max-results.
	 *        max-results = Número máximo de filas que se incluirán en la respuesta.
	 *        output = Tipo de salida deseada, por defecto JSON, el otro valor aceptado es
	 *        dataTable.
	 *        fields = Selector que especifica un subconjunto de campos para incluirlos en la 
	 *        respuesta.
	 *        prettyPrint = Muestra la respuesta con sangrados y saltos de línea. Valor 
	 *        predeterminado: false.
	 *        userIp = Especifica la dirección IP del usuario final para el que se realiza la 
	 *        llamada de la API. Se utiliza para limitar el uso por IP. 
	 *        quotaUser = Alternativa a userIp en los casos en que se desconoce la dirección 
	 *        IP del usuario.
	 *        access_token = Una forma posible de proporcionar un token de OAuth 2.0.
	 *         
	 * @return Una entidad ReportCentral la cual posee metodos para obtener los resultados.
	 */
	ReportCentral getReportCentral(String idView, String starDate, String endDate,
			String metrics, Map<String, String> parameters);
	
}
