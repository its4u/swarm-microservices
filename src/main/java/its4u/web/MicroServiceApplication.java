package lu.its4u.web;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("hello")
public class MicroServiceApplication extends Application {

    public MicroServiceApplication() {
        System.out.println("MicroServiceApplication.MicroServiceApplication");
    }
}