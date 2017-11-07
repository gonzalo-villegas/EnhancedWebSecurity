/**
 * 
 */
package com.lds.exito.vanaheim.vanir.securityenhancedweb.rest;

import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

import javax.ws.rs.core.Application;


/**
 * @author jorge.lima
 *
 */
@ApplicationPath("/")
public class WebSecurityEnhanced extends Application{
	@Override
	public Set<Object> getSingletons() {
		
		return super.getSingletons();
	}
}
