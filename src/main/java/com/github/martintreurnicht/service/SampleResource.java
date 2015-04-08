package com.github.martintreurnicht.service;

import com.codahale.metrics.annotation.Timed;
import com.github.martintreurnicht.model.Saying;
import com.google.common.base.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.concurrent.atomic.AtomicLong;

@Produces("application/json")
@Consumes("*/*")
@Path("/sample")
public class SampleResource {

	private final String template;
	private final String defaultName;
	private final AtomicLong counter;

	public SampleResource(String template, String defaultName) {
		this.template = template;
		this.defaultName = defaultName;
		this.counter = new AtomicLong();
	}

	@Path("greet")
	@GET
	@Timed
	public Saying sayHello(@QueryParam("name") Optional<String> name) {
		final String value = String.format(template, name.or(defaultName));
		return new Saying(counter.incrementAndGet(), value);
	}
}
