package com.github.martintreurnicht.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

public class Saying {

	@JsonProperty
	private long id;

	@JsonProperty
	@Length(max = 3)
	private String content;

	public Saying() {
		// Jackson deserialization
	}

	public Saying(long id, String content) {
		this.id = id;
		this.content = content;
	}


	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
