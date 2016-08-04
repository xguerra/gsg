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
package com.gsgtech.gapp.social.google.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;

import com.gsgtech.gapp.social.google.api.Google;
import com.gsgtech.gapp.social.google.api.UserInfo;

/**
 * Google ApiAdapter implementation.
 * 
 * @author Xavier Guerra
 */
public class GoogleAdapter implements ApiAdapter<Google> {

	public boolean test(Google google) {
		try {
			google.userOperations().getInfo();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	public void setConnectionValues(Google google, ConnectionValues values) {
	    UserInfo profile = google.userOperations().getInfo();
		values.setProviderUserId(profile.getId());
		values.setDisplayName(profile.getName());
		values.setProfileUrl(profile.getLink());
		values.setImageUrl(profile.getUrlImage());
	}

	public UserProfile fetchUserProfile(Google google) {
		UserInfo profile = google.userOperations().getInfo();
		return new UserProfileBuilder().setUsername(profile.getId())
				.setEmail("")
				.setName(profile.getName())
				.setFirstName(profile.getGivenName())
				.setLastName(profile.getFamilyName()).build();
	}

	public void updateStatus(Google google, String message) {
		throw new UnsupportedOperationException();
	}

}
