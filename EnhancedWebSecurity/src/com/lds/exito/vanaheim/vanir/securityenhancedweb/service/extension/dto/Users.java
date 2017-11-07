/**
 * 
 */
package com.lds.exito.vanaheim.vanir.securityenhancedweb.service.extension.dto;

import java.io.Serializable;

/**
 * @author jorge.lima
 *
 */
public class Users implements Serializable 
{
	private String userId;
	private String userPass;
	
	public Users()
	{
		
	}
	public Users(String userId, String userPass)
	{
		this.userId = userId;
		this.userPass = userPass;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	@Override
	public String toString()
	{
		return new StringBuffer("{\"status\" : \"true\"}")
				.toString();
	}
}
