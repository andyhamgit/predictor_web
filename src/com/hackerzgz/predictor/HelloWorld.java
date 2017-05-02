package com.hackerzgz.predictor;
/**
 * Created by HackerZ on 02/05/2017.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorld {

    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "Hello World";
    }
}
