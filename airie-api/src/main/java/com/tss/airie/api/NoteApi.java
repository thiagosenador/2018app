package com.tss.airie.api;

import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;
import com.tss.airie.model.Note;
import com.tss.airie.service.NoteService;

@Api(name = "note",
		version = "v1",
		issuers = { @ApiIssuer(name = "firebase",
				issuer = "https://securetoken.google.com/airie-app",
				jwksUri = "https://www.googleapis.com/robot/v1/metadata/x509/securetoken@system.gserviceaccount.com") })
public class NoteApi {

	private NoteService noteService;

	@ApiMethod(httpMethod = ApiMethod.HttpMethod.POST,
			authenticators = { EspAuthenticator.class },
			issuerAudiences = { @ApiIssuerAudience(name = "firebase", audiences = "airie-app") })
	public Note create(Note note) throws UnauthorizedException {

		this.noteService.createNote(note);

		return note;
	}

	@ApiMethod(apiKeyRequired = AnnotationBoolean.TRUE)
	public Note echoApiKey(Note message, @Named("n") @Nullable Integer n) {

		Note note = new Note();
		note.setId(new Long(n));
		note.setDescription(message.getDescription());

		return note;
	}
}