package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.reactive.messaging.*;
@Path("/queries")
@ApplicationScoped
public class QueryResource {

    // Injection d'une classe de service ou d'un repository pour accéder à la vue de la requête
    // ...

    @GET
    @Path("/{id}")
    public Response getQueryResult(@PathParam("id") Long id) {
        // Récupérer les données de la base de données de lecture
        // ...

        Object queryResult;
        return Response.ok("result").build();
    }


}


