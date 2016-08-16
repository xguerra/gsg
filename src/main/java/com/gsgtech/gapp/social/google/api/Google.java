/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gsgtech.gapp.social.google.api;

import org.springframework.social.ApiBinding;

import com.gsgtech.gapp.social.google.api.analytics.AnalyticsOperations;

/**
 * Interface specifying a basic set of operations for interacting with Google
 * APIs. Implemented by {@link GoogleTemplate}.
 *
 * @author Gabriel Axel
 */
public interface Google extends ApiBinding {
	
	/**
	 * Obtiene {@link UserOperations}, usado para interactuar en la información de un Usuario.
	 * Algunos métodos requieren OAuth2 scope https://www.googleapis.com/auth/userinfo.profile
	 *
	 * @return {@link UserOperations} Para el usuario autenticado
	 *         
	 */
	UserOperations userOperations();
	
	/**
	 * Obtiene {@link AnalyticsOperations}, usado para obtener las operaciones expuestas en la
	 * la API de Google Analytics.
	 * Algunos métodos requieren de al menos uno de los OAuth2 scope siguientes:
	 * https://www.googleapis.com/auth/analytics.readonly | Acceso de solo lectura a la API de Analytics.
	 * https://www.googleapis.com/auth/analytics | Acceso de escritura a la API de Analytics.
	 * https://www.googleapis.com/auth/analytics.edit | Modificar entidades de administración de Google Analytics.
	 * https://www.googleapis.com/auth/analytics.manage.users | Ver y administrar los permisos de usuario de las cuentas de Analytics.
	 * https://www.googleapis.com/auth/analytics.manage.users.readonly | Ver permisos de usuarios de Google Analytics.
	 *@return {@link AnalyticsOperations} Para el usuario autenticado
	 *         
	 */
	AnalyticsOperations analyticsOperations();
	
	/**
	 * Returns the access token, allowing interoperability with other libraries
	 *
	 * @see <a href="http://code.google.com/p/google-api-java-client/">Google
	 *      APIs Client Library for Java</a>
	 *
	 * @return The OAuth2 access token
	 */
	String getAccessToken();
}
