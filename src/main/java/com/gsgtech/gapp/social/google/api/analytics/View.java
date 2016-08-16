package com.gsgtech.gapp.social.google.api.analytics;

public class View extends ApiEntityAnalytics {
	
	private String 	internalWebPropertyId;
	private String 	webPropertyId;
	private String 	currency;
	private String 	timezone;
	private String 	websiteUrl;
	private String 	defaultPage;
	private String 	excludeQueryParameters;
	private String 	siteSearchQueryParameters;
	private Boolean	stripSiteSearchQueryParameters;
	private String 	siteSearchCategoryParameters;
	private String 	stripSiteSearchCategoryParameters;
	private String 	type;
	private Boolean	eCommerceTracking;
	private Boolean	enhancedECommerceTracking;
	private Boolean	botFilteringEnabled;
	
	public String getInternalWebPropertyId() {
		return internalWebPropertyId;
	}



	public String getWebPropertyId() {
		return webPropertyId;
	}



	public String getCurrency() {
		return currency;
	}



	public String getTimezone() {
		return timezone;
	}



	public String getWebsiteUrl() {
		return websiteUrl;
	}



	public String getDefaultPage() {
		return defaultPage;
	}



	public String getExcludeQueryParameters() {
		return excludeQueryParameters;
	}



	public String getSiteSearchQueryParameters() {
		return siteSearchQueryParameters;
	}



	public Boolean getStripSiteSearchQueryParameters() {
		return stripSiteSearchQueryParameters;
	}



	public String getSiteSearchCategoryParameters() {
		return siteSearchCategoryParameters;
	}



	public String getStripSiteSearchCategoryParameters() {
		return stripSiteSearchCategoryParameters;
	}



	public String getType() {
		return type;
	}



	public Boolean geteCommerceTracking() {
		return eCommerceTracking;
	}



	public Boolean getEnhancedECommerceTracking() {
		return enhancedECommerceTracking;
	}



	public Boolean getBotFilteringEnabled() {
		return botFilteringEnabled;
	}

}
