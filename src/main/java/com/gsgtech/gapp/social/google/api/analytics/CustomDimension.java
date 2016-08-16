package com.gsgtech.gapp.social.google.api.analytics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions", "childLink"})
public class CustomDimension extends ApiEntityAnalytics {
	@JsonProperty
	private String 	webPropertyId;
	@JsonProperty
	private Integer index;
	@JsonProperty
	private String 	scope;
	@JsonProperty
	private Boolean	active;

	public CustomDimension() {
	}

}
