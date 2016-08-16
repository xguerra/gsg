package com.gsgtech.gapp.social.google.api.analytics.impl;

import java.util.List;

/**
 * API para el consultas de tipo lista.
 * @author Xavier Guerra
 * @param <T> item type
 */
public abstract class ApiListAnalytics<T> {

	private List<T> items;

	protected ApiListAnalytics() {
	}
	
	protected ApiListAnalytics(List<T> items) {
		this.items = items;
	}

	public List<T> getItems() {
		return items;
	}

}