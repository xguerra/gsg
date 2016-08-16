package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountSummary {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private String name;
	
	public static class WebPropertie{
		@JsonProperty
		private String id;
		@JsonProperty
		private String name;
		@JsonProperty
		private String internalWebPropertyId;
		@JsonProperty
		private String level;
		@JsonProperty
		private String websiteUrl;
		
		public static class Profile{
			@JsonProperty
			private String id;
			@JsonProperty
			private String name;
			@JsonProperty
			private String type;
		}
		@JsonProperty
		private List<Profile> profiles;
	}
	@JsonProperty
	private List<WebPropertie> webProperties;

	public AccountSummary() {
	}

}
