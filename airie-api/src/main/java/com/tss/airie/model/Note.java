package com.tss.airie.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import lombok.Data;

@Data
@Entity
public class Note {

	@Id
	private Long id;

	private String description;

}