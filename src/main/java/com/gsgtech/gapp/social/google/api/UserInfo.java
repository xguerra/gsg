package com.gsgtech.gapp.social.google.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {
	@JsonProperty("family_name") private String familyName;
	private String name;
	private String urlImage;
	private String locale;
	private String gender;
	private String link;
	@JsonProperty("given_name") private String givenName;
	private String id;
	
	
	UserInfo() {
		
	}

	public UserInfo(String familyName, String name, String urlImage, String locale, String gender, String link,
			String givenName, String id) {
		super();
		this.familyName = familyName;
		this.name = name;
		this.urlImage = urlImage;
		this.locale = locale;
		this.gender = gender;
		this.link = link;
		this.givenName = givenName;
		this.id = id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getName() {
		return name;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public String getLocale() {
		return locale;
	}

	public String getGender() {
		return gender;
	}

	public String getLink() {
		return link;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getId() {
		return id;
	}
	
}
