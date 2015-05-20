package com.github.martintreurnicht.application;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.github.martintreurnicht.SampleHealth;
import com.github.martintreurnicht.configuration.SampleConfiguration;
import com.github.martintreurnicht.service.SampleResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class SampleApplication extends Application<SampleConfiguration>{

	public static void main(String... args) throws Exception {
		new SampleApplication().run(args);
	}

	@Override
	public void run(final SampleConfiguration configuration, final Environment environment) throws Exception {
		environment.getObjectMapper().disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		configuration.getTest().getDerp();
		SampleResource resource = new SampleResource(configuration.getTemplate(), configuration.getDefaultName());
		environment.jersey().register(resource);
		SampleHealth health = new SampleHealth(configuration.getTemplate());
		environment.healthChecks().register("template", health);
	}

	@Override
	public String getName() {
		return "Sample";
	}
}
