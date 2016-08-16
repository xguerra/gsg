package com.gsgtech.gapp.social.google.api.analytics.impl;


import org.springframework.web.client.RestTemplate;

import com.gsgtech.gapp.social.google.api.analytics.AccountPage;
import com.gsgtech.gapp.social.google.api.analytics.AccountSummaryPage;
import com.gsgtech.gapp.social.google.api.analytics.AdminAnalyticsOperations;
import com.gsgtech.gapp.social.google.api.analytics.CustomDataSourcePage;
import com.gsgtech.gapp.social.google.api.analytics.CustomDimension;
import com.gsgtech.gapp.social.google.api.analytics.CustomDimensionPage;
import com.gsgtech.gapp.social.google.api.analytics.CustomMetric;
import com.gsgtech.gapp.social.google.api.analytics.CustomMetricPage;
import com.gsgtech.gapp.social.google.api.analytics.Filter;
import com.gsgtech.gapp.social.google.api.analytics.FilterPage;
import com.gsgtech.gapp.social.google.api.analytics.LinkAdWord;
import com.gsgtech.gapp.social.google.api.analytics.LinkAdWordPage;
import com.gsgtech.gapp.social.google.api.analytics.Objetive;
import com.gsgtech.gapp.social.google.api.analytics.ObjetivePage;
import com.gsgtech.gapp.social.google.api.analytics.SegmentPage;
import com.gsgtech.gapp.social.google.api.analytics.View;
import com.gsgtech.gapp.social.google.api.analytics.ViewPage;
import com.gsgtech.gapp.social.google.api.analytics.WebProperties;
import com.gsgtech.gapp.social.google.api.analytics.WebPropertiesPage;
import com.gsgtech.gapp.social.google.api.impl.AbstractGoogleApiOperations;

/**
 * {@link AdminAnalyticsOperations} implementation.
 * @author Xavier Guerra
 */
public class AdminAnalyticsTemplate extends AbstractGoogleApiOperations implements AdminAnalyticsOperations {
	private static final String ANALYTICS_BASE_URL = "https://www.googleapis.com/analytics/v3/";
	
	private static final String MANAGEMENT_URL = ANALYTICS_BASE_URL+"management";
	
	private static final String ACCOUNTSUMMARIES = "/accountSummaries";
	private static final String ACCOUNTS = "/accounts";
	private static final String WEB_PROPERTIES = "/webproperties";
	private static final String PROFILES = "/profiles";
	private static final String FILTERS = "/filters";
	private static final String GOALS = "/goals";
	private static final String SEGMENTS = "/segments";
	private static final String ADWODRSLINKS = "/entityAdWordsLinks";
	private static final String CUSTOMDATASOURCES = "/customDataSources";
	private static final String CUSTOMDIMENSIONS = "/customDimensions";
	private static final String CUSTOMMETRICS = "/customMetrics";
	
	
	public AdminAnalyticsTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

	public AccountSummaryPage getAccountSummarys() {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTSUMMARIES);
		return getEntity(sb.toString(), AccountSummaryPage.class);
	}

	public AccountPage getAccounts() {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS);
		return getEntity(sb.toString(), AccountPage.class);
	}

	public WebPropertiesPage getWebProperties(String accountId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES);
		return getEntity(sb.toString(), WebPropertiesPage.class);
	}

	public WebProperties getWebPropertie(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId);
		return getEntity(sb.toString(), WebProperties.class);
	}

	public ViewPage getViews(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(PROFILES);
		return getEntity(sb.toString(), ViewPage.class);
	}

	public View getView(String accountId, String webPropertieId, String profileId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(PROFILES).append("/").append(profileId);
		return getEntity(sb.toString(), View.class);
	}

	public FilterPage getFilters(String accountId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(FILTERS);
		return getEntity(sb.toString(), FilterPage.class);
	}

	public Filter getFilter(String accountId, String filterId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(FILTERS).append("/").append(filterId);
		return getEntity(sb.toString(), Filter.class);
	}

	public ObjetivePage getObjetives(String accountId, String webPropertieId, String profileId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(PROFILES).append("/").append(profileId).append(GOALS);
		return getEntity(sb.toString(), ObjetivePage.class);
	}

	public Objetive getObjetive(String accountId, String webPropertieId, String profileId, String goalId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(PROFILES).append("/").append(profileId).append(GOALS)
				.append("/").append(goalId);
		return getEntity(sb.toString(), Objetive.class);
	}

	public SegmentPage getSegments() {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(SEGMENTS);
		return getEntity(sb.toString(), SegmentPage.class);
	}

	public LinkAdWordPage getLinksAdWords(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(ADWODRSLINKS);
		return getEntity(sb.toString(), LinkAdWordPage.class);
	}

	public LinkAdWord getLinkAdWords(String accountId, String webPropertieId, String webPropertyAdWordsLinkId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(ADWODRSLINKS).append("/").append(webPropertyAdWordsLinkId);
		return getEntity(sb.toString(), LinkAdWord.class);
	}

	public CustomDataSourcePage getCustomSDataSources(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(CUSTOMDATASOURCES);
		return getEntity(sb.toString(), CustomDataSourcePage.class);
	}

	public CustomDimensionPage getCustomsDimensions(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(CUSTOMDIMENSIONS);
		return getEntity(sb.toString(), CustomDimensionPage.class);
	}

	public CustomDimension getCustomDimesion(String accountId, String webPropertieId, String customDimensionId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(CUSTOMDIMENSIONS).append("/").append(customDimensionId);
		return getEntity(sb.toString(), CustomDimension.class);
	}

	public CustomMetricPage getCustomsMetrics(String accountId, String webPropertieId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(CUSTOMMETRICS);
		return getEntity(sb.toString(), CustomMetricPage.class);
	}

	public CustomMetric getCustomMetric(String accountId, String webPropertieId, String customMetricId) {
		StringBuilder sb = new StringBuilder(MANAGEMENT_URL).append(ACCOUNTS).append("/")
				.append(accountId).append(WEB_PROPERTIES).append("/").append(webPropertieId)
				.append("/").append(CUSTOMMETRICS).append("/").append(customMetricId);
		return getEntity(sb.toString(), CustomMetric.class);
	}

}
