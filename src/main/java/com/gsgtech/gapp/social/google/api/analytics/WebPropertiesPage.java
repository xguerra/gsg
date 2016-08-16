package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link WebProperties}.
 * 
 * @author Xavier Guerra
 */

public class WebPropertiesPage extends ApiPageAnalytics<WebProperties> {

	public WebPropertiesPage() {
		
	}

	protected WebPropertiesPage(List<WebProperties> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
