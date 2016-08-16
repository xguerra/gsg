package com.gsgtech.gapp.social.google.api.analytics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions", "childLink", "parentLink", "accountId"})
public class Segment extends ApiEntityAnalytics {
	@JsonProperty
	private String 	definition;
	@JsonProperty
	private String 	type;
}
