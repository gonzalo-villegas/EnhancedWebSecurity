/**
 * 
 */
package com.lds.exito.vanaheim.vanir.securityenhancedweb.endpoint.impl;

import java.io.InputStream;
import java.util.List;

import javax.jws.HandlerChain;
import javax.persistence.Access;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lds.exito.vanaheim.vanir.securityenhancedweb.endpoint.IWebUserAdmin;
import com.lds.exito.vanaheim.vanir.securityenhancedweb.service.extension.ErrorCodesSecurityEnhanced;
import com.lds.exito.vanaheim.vanir.securityenhancedweb.service.extension.dto.Users;
import com.lds.exito.vanaheim.vanir.securityenhancedweb.service.impl.WebUserAdminBusiness;


/**
 * @author jorge.lima
 *
 */
@Path(value = "/validation")
public class WebUserAdmin
{

	private static Logger logger = LoggerFactory.getLogger(WebUserAdmin.class);

	@POST
	@Path(value = "/jsonServices")
	@Produces("application/json")
	public Response produceJson(InputStream inputstream)
	{
		
		Users user = new Users("jlima", "Master10");
		return Response.ok().header("Access-Control-Allow-Origin", "*").type(MediaType.APPLICATION_JSON).entity(user.toString()).build();
	}
	
	
	@GET
	@Path(value = "/isavalible")
	@Produces(MediaType.APPLICATION_JSON)
	public void securityEnhancedAvalible() 
	{
		logger.info("Inicia isavalible/securityEnhancedAvalible - WebUserAdmin capa de servicios");
		String responseData = null;
		boolean statusSecurityEnhance = true;
		
		try
		{
			if(statusSecurityEnhance)
			{
				logger.info("SecurityEnhanced si avalible");
				responseData = "{\"isavalible\":\"false\"}";
			} else 
			{
				logger.info("SecurityEnhanced si disabled");
				responseData = "{\"isavalible\":\"false\"}";
			}
			
		} catch(Exception er)
		{
			responseData = "[{\"status\":\"true\"}]";
			logger.error("error validando estado de seguridad mejorada", er.getLocalizedMessage());
		}
		
	}

	
	@POST
	@Path(value = "/isvalid")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isUserValid(InputStream inputStream)  
	{
		logger.info("Inicia isUserValid - WebUserAdmin capa de servicios");
		String userIdIsValid = null;
		String userIdIsAuthorized = "{\"user\":\"true\"}";
		return Response.ok().type(MediaType.APPLICATION_JSON).entity(userIdIsAuthorized).build();
	}

	
	@POST
	@Path(value = "/changepassword/")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response createPassword() 
	{
		String changesPassword = null;
		try
		{
			WebUserAdminBusiness webUserAdminB = new WebUserAdminBusiness();
			changesPassword ="{\"isavalible\":\"true\"}";
			if(changesPassword.equals("true"))
			{
				Users user = new Users("jlima", "Master10");
				changesPassword = user.toString();
			} 
		}catch(Exception err)
		{
			changesPassword = err.getLocalizedMessage();
			logger.error(err.getLocalizedMessage());
			return Response.status(500).type(MediaType.APPLICATION_JSON).entity(changesPassword).build();
		}
		return Response.ok().type(MediaType.APPLICATION_JSON).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
	            .entity(changesPassword).allow("OPTIONS").build();
	}
		
}
