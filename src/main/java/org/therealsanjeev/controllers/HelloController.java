package org.therealsanjeev.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/test")
    public static String Hello(){

        return "Hi Sanjeev!";
    }
@RequestMapping("/test1")
    public static int [] age(){

        return new int[]{1,2,3};
    }
}
