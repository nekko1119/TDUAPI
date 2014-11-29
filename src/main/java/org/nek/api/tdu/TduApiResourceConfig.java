package org.nek.api.tdu;

import org.glassfish.jersey.server.ResourceConfig;

public class TduApiResourceConfig extends ResourceConfig {
    public TduApiResourceConfig() {
        super();
        packages("org.nek.api.tdu.controllers");
        packages(true, "com.fasterxml.jackson.jaxrs");
    }
}
