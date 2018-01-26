package com.tss.airie.service;

import com.tss.airie.model.Note;
import com.tss.airie.persistence.DatastorePersistence;

public class NoteServiceImpl implements NoteService {

	private DatastorePersistence datastore;

	@Override
	public Note createNote(Note note) {

		return this.datastore.createNote(note);
	}

	public void setDatastore(DatastorePersistence datastore) {
		this.datastore = datastore;
	}
}