package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link CustomDataSources}.
 * 
 * @author Xavier Guerra
 */

public class CustomDataSourcePage extends ApiPageAnalytics<CustomDataSources> {

	public CustomDataSourcePage() {
		
	}

	protected CustomDataSourcePage(List<CustomDataSources> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
