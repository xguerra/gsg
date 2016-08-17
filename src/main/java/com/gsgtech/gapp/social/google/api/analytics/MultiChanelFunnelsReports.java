package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiChanelFunnelsReports {
	@JsonProperty
	private String id;
	@JsonProperty
	private String selfLink;
	@JsonProperty
	private Boolean containsSampledData;
	
	public static class QueryObject{
		@JsonProperty("start-date")
		private String startDate;
		@JsonProperty("end-date")
		private String endDate;
		@JsonProperty
		private String ids;
		@JsonProperty
		private List<String> dimensions;
		@JsonProperty
		private List<String> metrics;
		@JsonProperty
		private List<String> sort;
		@JsonProperty
		private String filters;
		@JsonProperty
		private String samplingLevel;
		@JsonProperty("start-index")
		private Integer startIndex;
		@JsonProperty("max-results")
		private Integer maxResults;
	}
	@JsonProperty
	private QueryObject query;
	
	@JsonProperty
	private Integer itemsPerPage;
	@JsonProperty
	private Integer totalResults;
	@JsonProperty
	private String previousLink;
	@JsonProperty
	private String nextLink;
	
	public static class ProfileObject{
		@JsonProperty
		private String profileId;
		@JsonProperty
		private String accountId;
		@JsonProperty
		private String webPropertyId;
		@JsonProperty
		private String internalWebPropertyId;
		@JsonProperty
		private String profileName;
		@JsonProperty
		private String tableId;
	}
	@JsonProperty
	private String profileInfo;
	
	@JsonProperty
	private ProfileObject sampleSize;
	@JsonProperty
	private ProfileObject sampleSpace;
	
	public static class ColumnHeader{
		@JsonProperty
		private String name;
		@JsonProperty
		private String columnType;
		@JsonProperty
		private String dataType;
	}
	@JsonProperty
	private List<ColumnHeader> columnHeaders;
	
	@JsonProperty
	private Map<String, String> totalsForAllResults;
	
	
	public static class MultiChanelFunnelRows{
		@JsonProperty
		private String primitiveValue;
		
		public static class ConversionPathValue {
			@JsonProperty
			private String interactionType;
			@JsonProperty
			private String nodeValue;
		}
		@JsonProperty
		private List<ConversionPathValue> conversionPathValue;
	}
	@JsonProperty
	private List<List<MultiChanelFunnelRows>> rows;
	
	
	public MultiChanelFunnelsReports() {
		
	}

}
