package com.webvidhi.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/manager")
public class Manager {
	/*
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getServerName(){
		return "testRestServer";
	}
*/
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<DomainManager> getDM(){
		
		Service srv = new Service();
		return srv.getDomainManagers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addDomainManager(DomainManager dm){
		
		return "Added" +dm.getDomainName();
	}
	
	@GET
	@Path("/{domainName}")
	@Produces(MediaType.APPLICATION_JSON)
	public DomainManager getDomainManager(@PathParam("domainName") String dm){
		
		Service srv = new Service();
		srv.getDomainManagers();
		return srv.getDomainManager(dm);
	}

}
