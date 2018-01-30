package com.tss.airie.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;
import com.tss.airie.model.Note;

public class AirieObjectifyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ObjectifyService.register(Note.class);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
}