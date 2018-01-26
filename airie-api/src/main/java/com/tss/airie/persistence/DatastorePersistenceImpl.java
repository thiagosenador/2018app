package com.tss.airie.persistence;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.cloud.datastore.Entity;
import com.googlecode.objectify.Key;
import com.tss.airie.model.Note;

public class DatastorePersistenceImpl implements DatastorePersistence {

	@Override
	public Note createNote(Note note) {

		Key<Note> key = ofy().save().entity(note).now();
		key.toString();

		return note;
	}

	public List<Note> getNotesFromUser(String user) {

		return null;
	}

	public Entity getNote(Long id) {

		return null;
	}

	public void getNotesByLocation(Double latitude, Double longitude) {

	}
}
