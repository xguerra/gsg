package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link CustomDimension}.
 * 
 * @author Xavier Guerra
 */

public class CustomDimensionPage extends ApiPageAnalytics<CustomDimension> {

	public CustomDimensionPage() {
		
	}

	protected CustomDimensionPage(List<CustomDimension> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
