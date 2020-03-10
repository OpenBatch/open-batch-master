package org.openbatch.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openbatch.master.storage.IStorage;

@Path("/monitor")
public class MonitorResource {

    @Inject
    IStorage storageManager;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }
}