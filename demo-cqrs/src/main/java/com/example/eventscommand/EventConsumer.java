package com.example.eventscommand;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class EventConsumer {

    @Incoming("commands-in")
    public void onCommand(String commandData) {
        // Mettre à jour la base de données de lecture en conséquence
        // ...
    }
}