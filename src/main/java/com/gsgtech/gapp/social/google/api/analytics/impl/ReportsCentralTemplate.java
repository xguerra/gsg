package com.gsgtech.gapp.social.google.api.analytics.impl;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.client.RestTemplate;

import com.gsgtech.gapp.social.google.api.analytics.ReportCentral;
import com.gsgtech.gapp.social.google.api.analytics.ReportCentralOperations;
import com.gsgtech.gapp.social.google.api.impl.AbstractGoogleApiOperations;

/**
 * {@link ReportCentralOperations} implementation.
 * @author Xavier Guerra
 */
public class ReportsCentralTemplate extends AbstractGoogleApiOperations implements ReportCentralOperations {
	private static final String BASE_URL = "https://www.googleapis.com/analytics/v3/data/ga";

	public ReportsCentralTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate, isAuthorized);
	}

	public ReportCentral getReportCentral(String idView, String starDate, String endDate, String metrics,
			Map<String, String> parameters) {
		StringBuilder url = new StringBuilder(BASE_URL);
		url.append("?").append("ids=").append(idView).append("&").append("start_date=").
		append(starDate).append("&").append("end_date=").append(endDate).append("&").
		append("metrics=").append(metrics);
		
		return getEntity(build(url.toString(), parameters), ReportCentral.class);
	}
	
	protected String build(String feedUrl, Map<String, String> params) {	
		StringBuilder sb = new StringBuilder(feedUrl);
		if(!params.isEmpty() && feedUrl.indexOf('?') < 0) {
			sb.append('?');
		}
		
		for(Entry<String, String> param : params.entrySet()) {
			if(sb.charAt(sb.length() - 1) != '?') {
				sb.append('&');
			}
			sb.append(param.getKey()).append('=').append(param.getValue());
		}
		
		return sb.toString();
	}

}
