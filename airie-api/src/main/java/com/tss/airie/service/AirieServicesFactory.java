package com.tss.airie.service;

import com.tss.airie.persistence.DatastorePersistenceImpl;

public class AirieServicesFactory {

	public static NoteService createNoteService() {

		return new NoteServiceImpl(new DatastorePersistenceImpl());
	}
}
