package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link Objetive}.
 * 
 * @author Xavier Guerra
 */

public class ObjetivePage extends ApiPageAnalytics<Objetive> {

	public ObjetivePage() {
		
	}

	protected ObjetivePage(List<Objetive> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
