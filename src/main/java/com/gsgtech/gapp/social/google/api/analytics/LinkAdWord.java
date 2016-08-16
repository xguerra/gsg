package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"permissions", "childLink", "parentLink", "accountId", "create", "update"})
public class LinkAdWord extends ApiEntityAnalytics {
	@JsonProperty
	private List<String>	profileIds;
	
	public static class Entity{
		public static class WebPropertyRef{
			@JsonProperty
			private String id;
			@JsonProperty
			private String href;
			@JsonProperty
			private String accountId;
			@JsonProperty
			private String internalWebPropertyId;
			@JsonProperty
		    private String name;
		}
		@JsonProperty
		private WebPropertyRef webPropertyRef;
	}
	@JsonProperty
	private Entity entity;
	
	public static class AdWordsAccounts{
		@JsonProperty
		private String customerId;
		@JsonProperty
		private Boolean autoTaggingEnabled;
	}
	@JsonProperty
	private List<AdWordsAccounts> adWordsAccounts;
}
