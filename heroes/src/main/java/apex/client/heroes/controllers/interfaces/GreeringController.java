package apex.client.heroes.controllers.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GreeringController {
    @RequestMapping("/greeting")
    String greeting();
}
