package com.github.gdiazs.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class IndexController {

	private String welcomeMessage;

	public IndexController() {
		this.welcomeMessage = "Welcome to Jakarta Web Profile 9.0";
	}

	public String getWelcomeMessage() {
		return welcomeMessage;
	}

	public void ping() {
		var simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:MM:ss");
		this.welcomeMessage = String.format("%s - %s", this.welcomeMessage, simpleDateFormat.format(new Date()));
	}
}
