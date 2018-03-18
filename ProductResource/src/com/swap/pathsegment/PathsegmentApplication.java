package com.swap.pathsegment;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api/*")
public class PathsegmentApplication extends Application{

}
