package com.tss.airie.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.tss.airie.model.Note;

@Api(name = "note", version = "v1", title = "My app APIs", description = "APIs for my awesome app")
public class NoteApi {

	@ApiMethod(name = "create", httpMethod = ApiMethod.HttpMethod.GET)
	public Note createNote() {

		Note note = new Note();
		note.setId(123456L);

		return note;
	}
}
