package com.gsgtech.gapp.social.google.api.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebProperties extends ApiEntityAnalytics {
	private String 	internalWebPropertyId;
	private String 	websiteUrl;
	private String 	level;
	private Integer profileCount;
	private String 	industryVertical;
	private Long 	defaultProfileId;
	
	public static final class ParentLink{
		@JsonProperty
		private String href;
	}
	
	@JsonProperty
	private ParentLink parentLink;

	public String getInternalWebPropertyId() {
		return internalWebPropertyId;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public String getLevel() {
		return level;
	}

	public Integer getProfileCount() {
		return profileCount;
	}

	public String getIndustryVertical() {
		return industryVertical;
	}

	public Long getDefaultProfileId() {
		return defaultProfileId;
	}

	public String getAccountLink() {
		return parentLink != null ? parentLink.href : null;
	}

}
