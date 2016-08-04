package com.gsgtech.gapp.social.google.api.impl;

import org.springframework.web.client.RestTemplate;

import com.gsgtech.gapp.social.google.api.UserInfo;
import com.gsgtech.gapp.social.google.api.UserOperations;

public class UserTemplate extends AbstractGoogleApiOperations implements UserOperations{
	
	private static final String USER_INFO_URL = "https://www.googleapis.com/userinfo/v2/me";

	protected UserTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

	public UserInfo getInfo() {
		return getEntity(USER_INFO_URL, UserInfo.class);
	}

}
