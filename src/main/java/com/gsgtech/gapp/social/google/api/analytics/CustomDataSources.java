package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions"})
public class CustomDataSources extends ApiEntityAnalytics {
	
	@JsonProperty
	private String webPropertyId;
	@JsonProperty
	private String description;
	@JsonProperty
	private String type;
	@JsonProperty
	private String importBehavior;
	@JsonProperty
	private List<String> profilesLinked;

	public CustomDataSources() {
	}

}
