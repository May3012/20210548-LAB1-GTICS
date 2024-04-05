package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NavbarController {
    @RequestMapping(value="/principal",method= RequestMethod.GET)
    public String paginaPrincipal(){
        return "principal";
    }
}