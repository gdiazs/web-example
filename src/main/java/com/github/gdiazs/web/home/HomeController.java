package com.github.gdiazs.web.home;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/home")
@Controller
@RequestScoped
public class HomeController {
	
	@Inject
	private Models models;

	@GET
	public String index() {
		
		return "home/index.html";
	}
}
