package com.tss.airie.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.tss.airie.model.Note;

@Api(name = "note", version = "v1")
public class NoteApi {

	@ApiMethod
	public Note create() {

		Note note = new Note();
		note.setId(123456L);
		note.setDescription("Thiago sinixtro");

		return note;
	}
}
