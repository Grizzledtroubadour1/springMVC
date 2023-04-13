package com.fqbq;

import com.fqbq.annotation.Controller;
import com.fqbq.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
    @RequestMapping
    public  void index(){
        System.out.println("index -> index");
    }
}
