package com.jzweb.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @version 1.0
 * @date 11/22/2020
 */
@RestController
@RequestMapping("/demo")
public class DemoController
{
    @RequestMapping("/list")
    public Map<String, String> demo(){
        Map<String,String> map = new HashMap<>();
        map.put("message"," springboot ");
        return map;
    }
}
