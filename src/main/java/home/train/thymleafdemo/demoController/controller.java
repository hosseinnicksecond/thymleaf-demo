package home.train.thymleafdemo.demoController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class controller {

    @GetMapping("/")
    public String sayHello(Model model){

        model.addAttribute("time", new java.util.Date());
        return "hello";
    }
}
