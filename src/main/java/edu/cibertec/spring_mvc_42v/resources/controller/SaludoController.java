package edu.cibertec.spring_mvc_42v.resources.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaludoController {

    @RequestMapping("saludo.do")
    public String saludar(){
        return "saludo.jsp";
    }

}
