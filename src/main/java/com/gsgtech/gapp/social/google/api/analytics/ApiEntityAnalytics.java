package com.gsgtech.gapp.social.google.api.analytics;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Super Clase Abstracta para entidades con API especificos. 
 * @author Xavier Guerra
 */
public abstract class ApiEntityAnalytics {
	private String id;
	private String selfLink;
	private String name;
	
	public static class PermissionsObject {

		@JsonProperty
		private List<String> effective;
	}
	
	@JsonProperty
	private PermissionsObject 	permissions;
	private Date 				create;
	private Date 				update;
	
	public static class ChildLinkObject {

		@JsonProperty
		private String href;
	}
	
	@JsonProperty
	private ChildLinkObject childLink;
	
	@JsonProperty
	private String 	accountId;
	
	protected ApiEntityAnalytics(){
		
	}
	
	public static final class ParentLink{
		@JsonProperty
		private String href;
	}
	
	@JsonProperty
	private ParentLink parentLink;

	public String getId() {
		return id;
	}

	public String getSelfLink() {
		return selfLink;
	}

	public String getName() {
		return name;
	}

	public Date getCreate() {
		return create;
	}

	public Date getUpdate() {
		return update;
	}

	public String getHref(){
		return childLink != null ? childLink.href : null;
	}
	
	public List<String> getEffective(){
		return permissions != null ? permissions.effective : null;
	}
	
	public String getAccountLink() {
		return parentLink != null ? parentLink.href : null;
	}
}
