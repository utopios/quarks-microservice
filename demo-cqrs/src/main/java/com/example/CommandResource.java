package com.example;

import io.smallrye.reactive.messaging.annotations.Channel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/commands")
@ApplicationScoped
public class CommandResource {

    @Inject
    @Channel("commands-out")
    Emitter<String> commandEmitter;

    @POST
    public Response createCommand(String commandData) {
        // Traiter la commande, c'est-à-dire, mettre à jour la base de données, etc.

        // Publier un événement pour informer le système que la commande a été traitée
        commandEmitter.send(commandData);

        return Response.ok().status(Response.Status.ACCEPTED).build();
    }
}

