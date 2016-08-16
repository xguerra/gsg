package com.gsgtech.gapp.social.google.api.analytics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions", "childLink"})
public class Filter extends ApiEntityAnalytics {
	
	public static class IncludeDetails{
		@JsonProperty
		private String field;
		@JsonProperty
	    private String matchType;
		@JsonProperty
	    private String expressionValue;
		@JsonProperty
	    private Boolean caseSensitive;
		@JsonProperty
	    private Integer fieldIndex;
	}
	
	@JsonProperty
	private IncludeDetails includeDetails;
	
	public static class ExcludeDetails{
		@JsonProperty
		private String field;
		@JsonProperty
	    private String matchType;
		@JsonProperty
	    private String expressionValue;
		@JsonProperty
	    private Boolean caseSensitive;
		@JsonProperty
	    private Integer fieldIndex;
	}
	@JsonProperty
	private ExcludeDetails excludeDetails;
	
	public static class LowerCaseDetails{
		@JsonProperty
		private String field;
		@JsonProperty
	    private Integer fieldIndex;
	}
	@JsonProperty
	private LowerCaseDetails lowercaseDetails;
	
	public static class UpperCaseDetails{
		@JsonProperty
		private String field;
		@JsonProperty
	    private Integer fieldIndex;
	}
	@JsonProperty
	private UpperCaseDetails uppercaseDetails;
	
	public static class SearchAndReplaceDetails{
		@JsonProperty
		private String field;
		@JsonProperty
	    private Integer fieldIndex;
		@JsonProperty
	    private String searchString;
		@JsonProperty
	    private String replaceString;
		@JsonProperty
	    private Boolean caseSensitive;
	}
	@JsonProperty
	private SearchAndReplaceDetails searchAndReplaceDetails;
	
	public static class AdvancedDetails{
		@JsonProperty
		private String fieldA;
		@JsonProperty
	    private Integer fieldAIndex;
		@JsonProperty
	    private String extractA;
		@JsonProperty
	    private String fieldB;
		@JsonProperty
	    private Integer fieldBIndex;
		@JsonProperty
	    private String extractB;
		@JsonProperty
	    private String outputToField;
		@JsonProperty
	    private Integer outputToFieldIndex;
		@JsonProperty
	    private String outputConstructor;
		@JsonProperty
	    private Boolean fieldARequired;
		@JsonProperty
	    private Boolean fieldBRequired;
		@JsonProperty
	    private Boolean overrideOutputField;
		@JsonProperty
	    private Boolean caseSensitive;
	}
	@JsonProperty
	private AdvancedDetails advancedDetails;
}
