package com.fqbq.Controller;

import com.fqbq.annotation.Controller;
import com.fqbq.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping
    public  String index(){
        System.out.println("test->index");
        return "";
    }
    @RequestMapping("index1")
    public  String index1(){
        System.out.println("test->index1");
        return "";
    }
}
