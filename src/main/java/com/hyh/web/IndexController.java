package com.hyh.web;

import com.hyh.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
