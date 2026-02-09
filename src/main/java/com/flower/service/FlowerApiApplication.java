package com.flower.service;

import io.vertx.core.Vertx;
import com.flower.service.api.invoker.FiddHttpServerVerticle;

public class FlowerApiApplication {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        // Deploy the generated Vert.x/Netty HTTP server verticle
        vertx.deployVerticle(new FiddHttpServerVerticle())
             .onSuccess(id -> System.out.println("Vert.x/Netty server started successfully. Deployment ID: " + id))
             .onFailure(err -> {
                 System.err.println("Failed to start server: " + err.getMessage());
                 err.printStackTrace();
                 vertx.close();
             });
    }
}