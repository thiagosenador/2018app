package com.tss.airie.service;

import com.tss.airie.model.Note;
import com.tss.airie.persistence.DatastorePersistence;

public class NoteServiceImpl implements NoteService {

	private final DatastorePersistence datastore;

	public NoteServiceImpl(DatastorePersistence datastore) {
		this.datastore = datastore;
	}

	@Override
	public Note createNote(Note note) {
		return this.datastore.createNote(note);
	}
}