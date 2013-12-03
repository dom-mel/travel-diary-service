package org.linesofcode.travelDiary.api.api.v1;

import org.linesofcode.travelDiary.api.model.User;
import org.linesofcode.travelDiary.api.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.Serializable;

@Path("/test")
public class Test implements Serializable {

    @Inject
    private UserService userService;

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        User user = userService.getUser();
        String name = "";

        if (user != null) {
            name = user.getName();
        }
        return "Hello " + name;
    }

    @GET
    public String set(String name) {
        User user = new User();
        user.setName(name);
        userService.setUser(user);
        return "OK";
    }
}
