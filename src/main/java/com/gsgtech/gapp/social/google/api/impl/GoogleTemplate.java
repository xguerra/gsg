/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gsgtech.gapp.social.google.api.impl;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.OAuth2Version;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gsgtech.gapp.social.google.api.Google;
import com.gsgtech.gapp.social.google.api.UserOperations;
import com.gsgtech.gapp.social.google.api.analytics.AdminAnalyticsOperations;
import com.gsgtech.gapp.social.google.api.analytics.MultiChanelFunnelOperations;
import com.gsgtech.gapp.social.google.api.analytics.ReportCentralOperations;
import com.gsgtech.gapp.social.google.api.analytics.impl.AdminAnalyticsTemplate;
import com.gsgtech.gapp.social.google.api.analytics.impl.MultiChanelFunnelsReportsTemplate;
import com.gsgtech.gapp.social.google.api.analytics.impl.ReportsCentralTemplate;

/**
 * <p>
 * The central class for interacting with Google APIs.
 * </p>
 * <p>
 * Most of the APIs, specifically all GData APIs and Google+ usage of "me", require OAuth2 authentication.
 * To use methods that require OAuth2 authentication, {@link GoogleTemplate} must be constructed with
 * an access token which is authorized for the appropriate scope.
 * For using Google+ without authenticating, {@link GoogleTemplate} default constructor can be used.
 * </p>
 * @author Gabriel Axel
 */
public class GoogleTemplate extends AbstractOAuth2ApiBinding implements Google {
	private UserOperations userOperations;
	private AdminAnalyticsOperations adminAnalyticsOperations;
	private ReportCentralOperations reportCentralOperations;
	private MultiChanelFunnelOperations multiChanelFunnelOperations;
	private String accessToken;


	/**
	 * Creates a new instance of GoogleTemplate.
	 * This constructor creates a new GoogleTemplate able to perform unauthenticated operations against Google+.
	 */
	public GoogleTemplate() {
		initialize();
	}

	/**
	 * Creates a new instance of GoogleTemplate.
	 * This constructor creates the GoogleTemplate using a given access token.
	 * @param accessToken an access token granted by Google after OAuth2 authentication
	 */
	public GoogleTemplate(String accessToken) {
		super(accessToken);
		this.accessToken = accessToken;
		initialize();
	}

	private void initialize() {
		userOperations = new UserTemplate(getRestTemplate(), isAuthorized());
		adminAnalyticsOperations = new AdminAnalyticsTemplate(getRestTemplate(), isAuthorized());
		reportCentralOperations = new ReportsCentralTemplate(getRestTemplate(), isAuthorized());
		multiChanelFunnelOperations = new MultiChanelFunnelsReportsTemplate(getRestTemplate(),
				isAuthorized());
	}

	@Override
	protected List<HttpMessageConverter<?>> getMessageConverters() {

		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setSerializationInclusion(NON_NULL);
		jsonConverter.setObjectMapper(objectMapper);

		FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		formHttpMessageConverter.addPartConverter(jsonConverter);

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(jsonConverter);
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(formHttpMessageConverter);
		messageConverters.add(new ResourceHttpMessageConverter());
		return messageConverters;
	}

	@Override
	protected OAuth2Version getOAuth2Version() {
		return OAuth2Version.BEARER;
	}
	
	public UserOperations userOperations() {
		return userOperations;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public AdminAnalyticsOperations adminAnalyticsOperations() {
		return adminAnalyticsOperations;
	}

	public ReportCentralOperations reportCentralOperations() {
		return reportCentralOperations;
	}

	public MultiChanelFunnelOperations multiChanelFunnelOperations() {
		return multiChanelFunnelOperations;
	}

}