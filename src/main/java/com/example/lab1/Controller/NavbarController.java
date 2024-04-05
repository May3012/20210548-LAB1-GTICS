package com.example.lab1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NavbarController {
    @RequestMapping(value="/principal",method= RequestMethod.GET)
    public String paginaHome(){
            return "principal";
        }
}