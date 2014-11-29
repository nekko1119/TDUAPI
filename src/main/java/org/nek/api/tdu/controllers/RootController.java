package org.nek.api.tdu.controllers;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/hello")
public class RootController {
    public static class Message {
        private String message;
        public String getMessage() {
            return message;
        }
        Message(String message) {
            this.message = message;
        }
    }
    @GET
    public Response hello(@QueryParam("q") String message) {
        System.out.println("here");
        if (message == null)
            throw new WebApplicationException(Response.status(400).entity(new Message("error")).type(MediaType.APPLICATION_JSON_TYPE).build());
        Message response = new Message("hello " + message);
        return Response.status(404).entity(response).type(MediaType.APPLICATION_JSON_TYPE).build();
    }
}
