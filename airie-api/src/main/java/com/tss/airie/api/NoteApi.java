package com.tss.airie.api;

import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.tss.airie.model.Note;

@Api(name = "note",
		version = "v1",
		authenticators = { EspAuthenticator.class },
		issuers = { @ApiIssuer(name = "firebase",
				issuer = "https://securetoken.google.com/airie-app",
				jwksUri = "https://www.googleapis.com/service_accounts/v1/metadata/x509/securetoken@system.gserviceaccount.com") },
		issuerAudiences = { @ApiIssuerAudience(name = "firebase", audiences = "airie-app") })
public class NoteApi {

	@ApiMethod
	public Note create() {

		Note note = new Note();
		note.setId(123456L);
		note.setDescription("Thiago sinixtro");

		return note;
	}
}
