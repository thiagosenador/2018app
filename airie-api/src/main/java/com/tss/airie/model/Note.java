package com.tss.airie.model;

import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.IncompleteKey;

public class Note extends DatastoreEntity {

	public static final String KIND = "name";

	@Override
	public FullEntity<IncompleteKey> toDatastore(IncompleteKey key) {
		return null;
	}
}