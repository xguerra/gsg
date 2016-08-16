package com.gsgtech.gapp.social.google.api.analytics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"parentlink", "accountId"})
public class Account extends ApiEntityAnalytics {
	
}
