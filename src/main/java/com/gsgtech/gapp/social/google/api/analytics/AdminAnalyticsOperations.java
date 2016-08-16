package com.gsgtech.gapp.social.google.api.analytics;

/**
 * Define las operaciones para buscar, recuperar, insertar, acuatlizar, datos de configuración 
 * de Analytics como (Resumén de Cuentas, Cuentas, Propiedades Web, Vistas(Perfiles), 
 * Filtros, Objetivos, Segmentos, Enlaces de Adword, Fuentes de datos Personalizadas,
 * Métricas y Dimensiones personalizadas).
 * 
 * @author Xavier Guerra
 */
public interface AdminAnalyticsOperations {
	
	/** Obtener un listado de Resumen de Cuentas.
	 * 
	 * @return Una entidad AccountSummaryPage con una propiedad items que contiene la lista
	 * de resumen de cuentas.
	 */
	AccountSummaryPage getAccountSummarys();
	
	/** Obtener un listado de Cuentas.
	 * 
	 * @return Una entidad AccountPage con una propiedad items que contiene la lista
	 * de cuentas.
	 */
	AccountPage getAccounts();
	
	/** Obtener un listado de Propiedades Web.
	 * @param accountId el ID de cuenta para la que se recuperarán las propiedades web.Puede ser
	 *  un ID de cuenta específico o "~all", que hace referencia a todas las cuentas a las que 
	 *  tiene acceso el usuario.
	 * 
	 * @return Una entidad WebPropertiesPage con una propiedad items que contiene la lista
	 * de propiedades web.
	 */
	WebPropertiesPage getWebProperties(String accountId);
	
	/** Obtener una Propiedad Web.
	 * @param accounId ID de cuenta para el que se recuperará la propiedad web.
	 * @param webPropertieId ID para el que se recuperará la propiedad web.
	 * 
	 * @return Una entidad WebProperties que corresponde a la Propiedad Web.
	 */
	WebProperties getWebPropertie(String accountId, String webPropertieId);
	
	/** Obtener un listado de Vistas (Perfiles).
	 * @param accountId el ID de cuenta para la que se recuperarán las propiedades web.Puede ser
	 * un ID de cuenta específico o "~all", que hace referencia a todas las cuentas a las que 
	 * tiene acceso el usuario.
	 * @param webPropertieId ID de propiedad web de las vistas (perfiles) que se recuperarán. 
	 * Puede ser un ID de propiedad web específico o "~all", que hace referencia a todas las 
	 * propiedades web a las que tiene acceso el usuario. 
	 * 
	 * @return Una entidad ViewPage con una propiedad items que contiene la lista
	 * de Vistas (Perfiles).
	 */
	ViewPage getViews(String accountId, String webPropertieId);
	
	/** Obtener una Vista (Perfil).
	 * @param accounId ID de cuenta para el que se recuperará la propiedad web.
	 * @param webPropertieId ID para el que se recuperará la propiedad web.
	 * @param profileId ID de vista (perfil) para el que se recuperará el objetivo.
	 * 
	 * @return Una entidad View que corresponde a la Vista (Perfil).
	 */
	View getView(String accountId, String webPropertieId, String profileId);
	
	/** Obtener un listado de Filtros.
	 * @param accountId el IID de cuenta para el que se recuperarán los filtros. 
	 * 
	 * @return Una entidad FilterPage con una propiedad items que contiene la lista
	 * de filtros.
	 */
	FilterPage getFilters(String accountId);
	
	/** Obtener un Filtro.
	 * @param accounId ID de cuenta para el que se recuperará la propiedad web.
	 * @param filterId ID de filtro para el que se recuperarán los filtros.
	 * 
	 * @return Una entidad Filter que corresponde al filtro.
	 */
	Filter getFilter(String accountId, String filterId);
	
	/** Obtener un listado de Objetivos.
	 * @param accountId el ID de cuenta para la que se recuperarán las propiedades web.Puede ser
	 * un ID de cuenta específico o "~all", que hace referencia a todas las cuentas a las que 
	 * tiene acceso el usuario.
	 * @param webPropertieId ID de propiedad web de las vistas (perfiles) que se recuperarán. 
	 * Puede ser un ID de propiedad web específico o "~all", que hace referencia a todas las 
	 * propiedades web a las que tiene acceso el usuario.
	 * @param profileId ID de vista (perfil) para el que se recuperarán los objetivos. Puede ser
	 * un ID de vista (perfil) específico o "~all", que hace referencia a todas las 
	 * vistas (perfiles) a las que tiene acceso el usuario. 
	 * 
	 * @return Una entidad ObjetivePage con una propiedad items que contiene la lista
	 * de Objetivos.
	 */
	ObjetivePage getObjetives(String accountId, String webPropertieId, String profileId);
	
	/** Obtener un Objetivo.
	 * @param accounId ID de cuenta para el que se recuperará la propiedad web.
	 * @param webPropertieId ID para el que se recuperará la propiedad web.
	 * @param profileId ID de vista (perfil) para el que se recuperará el objetivo.
	 * @param goalId ID de objetivo para el que se recuperará el objetivo.
	 * 
	 * @return Una entidad Objetive que corresponde al Objetivo.
	 */
	Objetive getObjetive(String accountId, String webPropertieId, String profileId, String goalId);
	
	/** Obtener un listado de Segmentos.
	 * 
	 * @return Una entidad SegmentoPage con una propiedad items que contiene la lista
	 * de segmentos.
	 */
	SegmentPage getSegments();
	
	/** Obtener un listado de Enlaces de AdWords.
	 * @param accountId el ID de la cuenta a la que pertenece la propiedad web indicada. 
	 * @param webPropertieId ID de propiedad web para el que se recuperarán los enlaces 
	 * de AdWords.
	 * 
	 * @return Una entidad LinkAdWordPage con una propiedad items que contiene la lista
	 * de enlaces AdWords.
	 */
	LinkAdWordPage getLinksAdWords(String accountId, String webPropertieId);
	
	/** Obtener un enlace de AdWords.
	 * @param accounId ID de la cuenta a la que pertenece la propiedad web indicada.
	 * @param webPropertieId ID de propiedad web para el que se recuperará el enlace de AdWords. 
	 * @param webPropertyAdWordsLinkId ID de enlace de propiedad web-AdWords. 
	 * 
	 * @return Una entidad LinkAdWord que corresponde al enlace de AdWords.
	 */
	LinkAdWord getLinkAdWords(String accountId, String webPropertieId, String webPropertyAdWordsLinkId);
	
	/** Obtener un listado de Fuentes de datos personalizadas.
	 * @param accountId el ID de cuenta de las fuentes de datos personalizadas que se 
	 * recuperarán.  
	 * @param webPropertieId ID de propiedad web de las fuentes de datos personalizadas 
	 * que se recuperarán.
	 * 
	 * @return Una entidad CustomDataSourcePage con una propiedad items que contiene la lista
	 * de fuentes de datos personalizadas.
	 */
	CustomDataSourcePage getCustomSDataSources(String accountId, String webPropertieId);
	
	/** Obtener un listado de Dimensiones Personalizadas.
	 * @param accountId el ID de cuenta de las dimensiones personalizadas que se recuperarán. 
	 * @param webPropertieId ID de propiedad web de las dimensiones personalizadas que se 
	 * recuperarán.
	 * 
	 * @return Una entidad CustomDimensionPage con una propiedad items que contiene la lista
	 * de Dimensiones Personalizadas.
	 */
	CustomDimensionPage getCustomsDimensions(String accountId, String webPropertieId);
	
	/** Obtener una Dimesion Personalizada.
	 * @param accounId ID de cuenta de la dimensión personalizada que se recuperará. 
	 * @param webPropertieId ID de propiedad web de la dimensión personalizada que se recuperará. 
	 * @param customDimensionId ID correspondiente a la dimensión personalizada que se recuperará. 
	 * 
	 * @return Una entidad CustomDimesion que corresponde a la Dimesion Personalizada.
	 */
	CustomDimension getCustomDimesion(String accountId, String webPropertieId, 
			String customDimensionId);
	
	/** Obtener un listado de Metricas Personalizadas.
	 * @param accountId el ID de cuenta de las metricas personalizadas que se recuperarán. 
	 * @param webPropertieId ID de propiedad web de las metricas personalizadas que se 
	 * recuperarán.
	 * 
	 * @return Una entidad CustomMetricPage con una propiedad items que contiene la lista
	 * de Metricas Personalizadas.
	 */
	CustomMetricPage getCustomsMetrics(String accountId, String webPropertieId);
	
	/** Obtener una Mterica Personalizada.
	 * @param accounId ID de cuenta de la metrica personalizada que se recuperará. 
	 * @param webPropertieId ID de propiedad web de la metrica personalizada que se recuperará. 
	 * @param customMetricId ID correspondiente a la métrica personalizada que se recuperará. 
	 * 
	 * @return Una entidad CustomMetric que corresponde a la Metrica Personalizada.
	 */
	CustomMetric getCustomMetric(String accountId, String webPropertieId, 
			String customMetricId);
}
