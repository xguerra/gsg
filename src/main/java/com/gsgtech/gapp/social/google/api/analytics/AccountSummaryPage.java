package com.gsgtech.gapp.social.google.api.analytics;

import java.util.List;

import com.gsgtech.gapp.social.google.api.analytics.impl.ApiPageAnalytics;

/**
 * {@link ApiPageAnalytics} a {@link AccountSummary}.
 * 
 * @author Xavier Guerra
 */

public class AccountSummaryPage extends ApiPageAnalytics<AccountSummary> {

	public AccountSummaryPage() {
		
	}

	protected AccountSummaryPage(List<AccountSummary> items, String totalResults, String startIndex, String itemsPerPage,
			String previousLink, String nextLink) {
		super(items, totalResults, startIndex, itemsPerPage, previousLink, nextLink);
	}
	
	

}
