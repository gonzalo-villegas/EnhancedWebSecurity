/**
 * 
 */
package com.lds.exito.vanaheim.vanir.securityenhancedweb.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lds.exito.vanaheim.vanir.securityenhancedweb.service.IWebUserAdminBusiness;
import com.lds.exito.vanaheim.vanir.securityenhancedweb.service.extension.ErrorCodesSecurityEnhanced;

/**
 * @author jorge.lima
 *
 */
public class WebUserAdminBusiness implements IWebUserAdminBusiness
{
	public WebUserAdminBusiness() 
	{

	}
	
	private static Logger logger = LoggerFactory.getLogger(WebUserAdminBusiness.class);
	
	@Override
	public boolean isAvalibleSecurityEnhanced() throws Exception 
	{
		logger.info("Inicia validacion isAvalibleSecurityEnhanced - WebUserAdminBusiness");
		boolean statusSecurityEnhanced = false;
		statusSecurityEnhanced = true;
		return statusSecurityEnhanced;
	}
	
	@Override
	public String isUserValid(String userId, String userPassword)
	{
		logger.info("Inicia validacion isUserValid - WebUserAdminBusiness.");
		String userValid = null;
		userValid = "true";
		return userValid;
	}

	@Override
	public String isUserAuthorizedSecurityEnhanced(String userId, String userPassword) 
	{
		logger.info("Inicia validacion de permiso de usuario en security enhanced.");
		boolean isauthorized = true;
		String responseData = null;
		if (isauthorized)
		{
			responseData = "true";
			logger.info("user is authorized");
		} else 
		{
			responseData = "user ".concat(userId).concat(" is not authorized");
			logger.info("user is unauthorized");
		}
		return responseData;
	}

	@Override
	public String createUserPassword(String userIdAdmin, String passwordUserAdmin, String userIdOperator, String newPassword) 
	{
		logger.info("Inicia createUserPassword");
		String responseData = null;
		try
		{
			responseData = "true";
		} catch(Exception err)
		{
			logger.error(err.getLocalizedMessage());
			responseData = "false";
		} 
		return responseData;
	}
	
}
