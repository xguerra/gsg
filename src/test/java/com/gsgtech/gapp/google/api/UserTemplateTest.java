package com.gsgtech.gapp.google.api;

import org.junit.Test;

import com.gsgtech.gapp.social.google.api.UserInfo;

import static org.junit.Assert.*;
import static org.springframework.http.HttpMethod.*;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

public class UserTemplateTest extends AbstractGoogleApiTest {

	@Test
	public void getPersonById() {
		mockServer
				.expect(requestTo("https://www.googleapis.com/userinfo/v2/me"))
				.andExpect(method(GET))
				.andRespond(
						withSuccess(jsonResource("userInfo"), APPLICATION_JSON));
		UserInfo userInfo = google.userOperations().getInfo();
		assertUserInfo(userInfo);
	}
	
	private void assertUserInfo(UserInfo userInfo) {
		assertNotNull(userInfo);
		assertEquals("108121188482636659827", userInfo.getId());
		assertEquals("Xavier Emilio", userInfo.getGivenName());
		assertEquals("Guerra Rodriguez", userInfo.getFamilyName());
		assertEquals("Xavier Emilio Guerra Rodriguez", userInfo.getName());
		assertEquals("male", userInfo.getGender());
		assertEquals("es", userInfo.getLocale());
	}

}
