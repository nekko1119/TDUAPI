package org.nek.api.tdu.controller;

import javax.ws.rs.*;

@Path("/")
public class RootController {
	@GET
	public String hello() {
		return "hello";
	}
}
