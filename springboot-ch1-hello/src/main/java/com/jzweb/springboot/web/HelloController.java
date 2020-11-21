package com.jzweb.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ryan
 * @version 1.0
 * @date 11/21/2020
 */
@Controller
@RequestMapping("/hello")
public class HelloController
{
    @RequestMapping("/list")
    public String hello(Model model){
        model.addAttribute("object","springboot");
        return "/demo/list";
    }
}
