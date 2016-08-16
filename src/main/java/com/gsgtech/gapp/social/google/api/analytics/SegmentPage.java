package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link Segment}.
 * 
 * @author Xavier Guerra
 */

public class SegmentPage extends ApiPageAnalytics<Segment> {

	public SegmentPage() {
		
	}

	protected SegmentPage(List<Segment> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
