package com.gsgtech.gapp.social.google.api;

/**
 * Define las operaciones para obtener información refereente a la cuenta
 * de usuario. Se coloca "me" como user ID, requiere OAuth2 scope
 * https://www.googleapis.com/auth/userinfo.profile.
 * 
 * @author Xavier Guerra
 */

public interface UserOperations {
	
	/**
	 * Recupera la información usuario autenticado.
	 * 
	 * @return la clase recuperada {@link UserInfo}
	 */
	UserInfo getInfo();

}
