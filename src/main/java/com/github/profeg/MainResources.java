package com.github.profeg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Path("/")
public class MainResources {
    /* Get index file */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String index() throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("web/index.html"));
        StringBuilder s = new StringBuilder();
        while (f.ready())
            s.append(f.readLine());
        f.close();
        return s.toString();
    }
}
