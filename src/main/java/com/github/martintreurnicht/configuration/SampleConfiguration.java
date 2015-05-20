package com.github.martintreurnicht.configuration;

import io.dropwizard.Configuration;

public class SampleConfiguration extends Configuration {

//	@JsonProperty
//	@NotEmpty
	private String template;

//	@JsonProperty
	private String defaultName = "Stranger";

//	@JsonProperty
	private Derp test;

	public Derp getTest() {
		return test;
	}

	public void setTest(final Derp test) {
		this.test = test;
	}

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

	public static class Derp {
		private String derp;

		public String getDerp() {
			return derp;
		}

		public void setDerp(final String derp) {
			this.derp = derp;
		}
	}
}
