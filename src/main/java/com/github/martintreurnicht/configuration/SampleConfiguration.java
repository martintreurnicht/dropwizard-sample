package com.github.martintreurnicht.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class SampleConfiguration extends Configuration {

	@JsonProperty
	@NotEmpty
	private String template;

	@JsonProperty
	@NotEmpty
	private String defaultName = "Stranger";

	public String getTemplate() {
		return template;
	}

	public void setTemplate(final String template) {
		this.template = template;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(final String defaultName) {
		this.defaultName = defaultName;
	}
}
