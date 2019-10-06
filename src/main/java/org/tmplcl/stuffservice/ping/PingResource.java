package org.tmplcl.stuffservice.ping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ping")
public class PingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Ping ping(){
        return new Ping();
    }

}
