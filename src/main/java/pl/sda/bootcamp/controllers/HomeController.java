package pl.sda.bootcamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping
    public String home() {
        return "redirect:kurs/lista";
    }

    @GetMapping("strona-glowna")
    public String homePage() {
        return "forward:kurs/lista";
    }
}
