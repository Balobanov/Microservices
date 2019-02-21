package apex.client.heroes.controllers;

import apex.client.heroes.controllers.interfaces.GreeringController;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting implements GreeringController {

    @Lazy
    private final EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port}")
    private String port;

    @Autowired
    public Greeting(@Qualifier("eurekaClient") EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @Override
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaClient == null ? "" : eurekaClient.getApplication(appName).getName() + port);
    }
}
