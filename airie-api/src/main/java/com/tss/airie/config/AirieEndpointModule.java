package com.tss.airie.config;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import com.google.api.control.ServiceManagementConfigFilter;
import com.google.api.control.extensions.appengine.GoogleAppEngineControlFilter;
import com.google.api.server.spi.guice.EndpointsModule;
import com.google.common.collect.ImmutableList;
import com.tss.airie.api.NoteApi;
import com.tss.airie.persistence.DatastorePersistence;
import com.tss.airie.persistence.DatastorePersistenceImpl;
import com.tss.airie.service.NoteService;
import com.tss.airie.service.NoteServiceImpl;

public class AirieEndpointModule extends EndpointsModule {

	@Override
	public void configureServlets() {
		super.configureServlets();

		this.bind(ServiceManagementConfigFilter.class).in(Singleton.class);
		this.filter("/_ah/api/*").through(ServiceManagementConfigFilter.class);

		Map<String, String> apiController = new HashMap<String, String>();
		apiController.put("endpoints.projectId", "airie-app");
		apiController.put("endpoints.serviceName", "endpoints.projectId");

		this.bind(GoogleAppEngineControlFilter.class).in(Singleton.class);
		this.filter("/_ah/api/*").through(GoogleAppEngineControlFilter.class, apiController);

		// this.bind(NoteApi.class).toInstance(new NoteApi());

		this.bind(NoteService.class).to(NoteServiceImpl.class);
		this.bind(DatastorePersistence.class).to(DatastorePersistenceImpl.class);

		this.configureEndpoints("/_ah/api/*", ImmutableList.of(NoteApi.class));

	}
}
