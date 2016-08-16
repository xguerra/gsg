package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Super Clase Abstracta para entidades con atributos comunes. 
 * @author Xavier Guerra
 */
public abstract class ApiEntityAnalyticsExtended {
		
	public static class PermissionsObject {

		@JsonProperty
		private List<String> effective;
	}
	
	@JsonProperty
	private PermissionsObject 	permissions;
	
	public static class ChildLinkObject {

		@JsonProperty
		private String href;
	}
	
	@JsonProperty
	private ChildLinkObject childLink;
	
	protected ApiEntityAnalyticsExtended(){
		
	}
	
	protected ApiEntityAnalyticsExtended(PermissionsObject permissions, ChildLinkObject childLink) {
		this.permissions = permissions;
		this.childLink = childLink;
	}

	public String getHref(){
		return childLink != null ? childLink.href : null;
	}
	
	public List<String> getEffective(){
		return permissions != null ? permissions.effective : null;
	}
}
