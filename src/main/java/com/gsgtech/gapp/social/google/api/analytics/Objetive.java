package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions", "childLink"})
public class Objetive extends ApiEntityAnalytics {
	@JsonProperty
	private String webPropertyId;
	@JsonProperty
	private String internalWebPropertyId;
	@JsonProperty
	private String profileId;
	@JsonProperty
	private Float value;
	@JsonProperty
	private Boolean active;

	public static class UrlDestinationDetails{
		@JsonProperty
		private String url;
		@JsonProperty
	    private Boolean caseSensitive;
		@JsonProperty
	    private String matchType;
		@JsonProperty
	    private Boolean firstStepRequired;
		
		public static class Step{
			@JsonProperty
			private Integer number;
			@JsonProperty
			private String name;
			@JsonProperty
			private String url;
		}
		@JsonProperty
		private List<Step> steps;
	}	
	@JsonProperty
	private UrlDestinationDetails urlDestinationDetails;
	
	public static class VisitTimeOnSiteDetails{
		@JsonProperty
		private String comparisonType;
		@JsonProperty
	    private Long comparisonValue;
	}
	@JsonProperty
	private VisitTimeOnSiteDetails visitTimeOnSiteDetails;
	
	public static class VisitNumPagesDetails{
		@JsonProperty
		private String comparisonType;
		@JsonProperty
	    private Long comparisonValue;
	}
	@JsonProperty
	private VisitNumPagesDetails visitNumPagesDetails;
	
	public static class EventDetails{
		@JsonProperty
		private Boolean useEventValue;
		
		public static class EventCondition{
			@JsonProperty
			private String type;
			@JsonProperty
		    private String matchType;
			@JsonProperty
		    private String expression;
			@JsonProperty
			private String comparisonType;
			@JsonProperty
		    private Long comparisonValue;
		}
		@JsonProperty
		private List<EventCondition> eventConditions;
	}
	@JsonProperty
	private EventDetails eventDetails;
}
