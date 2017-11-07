package com.lds.exito.vanaheim.vanir.securityenhancedweb.service;

public interface IWebUserAdminBusiness 
{
	public abstract boolean isAvalibleSecurityEnhanced()  throws Exception ;
	public abstract String isUserValid(String userId, String userPassword) ;
	public abstract String isUserAuthorizedSecurityEnhanced(String userId, String userPassword);
	public abstract String createUserPassword(String userIdAdmin, String passwordUserAdmin, String userIdOperator, String newPassword);
}
