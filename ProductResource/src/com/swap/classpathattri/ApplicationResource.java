package com.swap.classpathattri;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.monitoring.ApplicationEvent;

@ApplicationPath("/api/*")
public class ApplicationResource extends ResourceConfig{

}
