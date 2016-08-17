package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * https://www.googleapis.com/analytics/v3/data/ga?ids=ga%3A126643292&start-date=7daysAgo&end-date=yesterday&metrics=ga%3AtotalEvents&dimensions=ga%3AeventLabel&sort=-ga%3AtotalEvents&filters=ga%3AeventCategory%3D%3DOutbound%20Link%2Cga%3AeventAction%3D%3Dclick&start-index=1&max-results=10
 **/

public class ReportCentral {
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
		private String samplingLevel;
		@JsonProperty("include-empty-rows")
		private Boolean includeEmptyRows;
		@JsonProperty
		private List<String> sort;
		@JsonProperty
		private String filters;
		@JsonProperty
		private String segment;
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
	private ProfileObject profileInfo;
	
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
	private List<List<String>> rows;
	@JsonProperty
	private Map<String, String> totalsForAllResults;
	
	public ReportCentral() {
		
	}

}
