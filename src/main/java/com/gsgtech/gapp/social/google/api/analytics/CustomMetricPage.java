package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link CustomMetric}.
 * 
 * @author Xavier Guerra
 */

public class CustomMetricPage extends ApiPageAnalytics<CustomMetric> {

	public CustomMetricPage() {
		
	}

	protected CustomMetricPage(List<CustomMetric> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
