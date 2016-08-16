package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link LinkAdWord}.
 * 
 * @author Xavier Guerra
 */

public class LinkAdWordPage extends ApiPageAnalytics<LinkAdWord> {

	public LinkAdWordPage() {
		
	}

	protected LinkAdWordPage(List<LinkAdWord> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
