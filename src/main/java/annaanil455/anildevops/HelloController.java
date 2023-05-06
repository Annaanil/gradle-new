package annaanil455.anildevops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
   
    @RequestMapping("/")
    public String index() {
        return "ANIL DEVOPS PROJECT, WELL COME TO MY WORLD !";
    }

}
