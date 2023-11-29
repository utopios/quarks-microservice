package com.example;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.Duration;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("uni")
    public Uni<Response> getUni() {
        return Uni.createFrom().item(Response.ok("hello From uni").build());
    }

    @GET
    @Path("multi")
    public Multi<String> getMulti() {
        return Multi.createFrom().items("hello", "from", "multi").onItem()
                .call(i -> Uni.createFrom().item(i)
                        .onItem()
                        .delayIt()
                        .by(Duration.ofSeconds(1))
                );
    }
}
