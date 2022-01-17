package com.github.gdiazs.web.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/api/ping")
public class PingResource {

	@GET
	@Produces("text/html")
	public String ping() {
		return "" + System.currentTimeMillis();
	}
}
