package com.gsgtech.gapp.social.google.api.analytics.impl;

import java.util.List;

/**
 * API para resultado en forma paginada.
 * @author Xavier Guerra
 * @param <T> item type
 */
public abstract class ApiPageAnalytics<T> extends ApiListAnalytics<T> {

	private String totalResults;
	private String startIndex;
	private String itemsPerPage;
	private String previousLink;
	private String nextLink;
	
	protected ApiPageAnalytics() {
	}
	
	protected ApiPageAnalytics(List<T> items, String totalResults, String startIndex, 
			                   String itemsPerPage, String previousLink, String nextLink) {
		super(items);
		this.totalResults = totalResults;
		this.startIndex = startIndex;
		this.itemsPerPage = itemsPerPage;
		this.previousLink = previousLink;
		this.nextLink = nextLink;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public String getStartIndex() {
		return startIndex;
	}

	public String getItemsPerPage() {
		return itemsPerPage;
	}

	public String getPreviousLink() {
		return previousLink;
	}

	public String getNextLink() {
		return nextLink;
	}
	
}