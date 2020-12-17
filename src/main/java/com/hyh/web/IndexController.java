package com.hyh.web;

import com.hyh.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        int i = 9/0;
        String blog = null;
        if(blog == null){
            throw new NotFoundException("博客不存在");
        }
        return "index";
    }
}
