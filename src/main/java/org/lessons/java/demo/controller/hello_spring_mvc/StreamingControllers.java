package org.lessons.java.demo.controller.hello_spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class StreamingControllers {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/movies")
    public String movies(@RequestParam(name = "movieName") String movieName, Model model) {
        model.addAttribute("movieName", movieName);

        return "movies";
    }

    @GetMapping("/series")
    public String series(@RequestParam(name = "serieName") String serieName, Model model) {
        model.addAttribute("serieName", serieName);

        return "series";
    }
}
