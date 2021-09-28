package online.zhlcamus.starter;

import online.zhlcamus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author camus
 */
@Controller
public class MainController {
    @Autowired
    private HelloService helloService;
    @GetMapping(value = "/")
    public @ResponseBody String index() {
        return helloService.hello();
    }
}
