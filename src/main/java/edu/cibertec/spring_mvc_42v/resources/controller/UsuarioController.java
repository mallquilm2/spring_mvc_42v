package edu.cibertec.spring_mvc_42v.resources.controller;

import edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO;
import edu.cibertec.spring_mvc_42v.resources.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("loginMostrar")
    public String loginMostrar(){
        return "login";
    }

    @RequestMapping("loginAccion")
    public ModelAndView loginAccion(HttpServletRequest request){
        ModelAndView mv = null;

        UsuarioDTO usuarioValida = new UsuarioDTO();
        usuarioValida.setUsuario(request.getParameter("txtUsuario"));
        usuarioValida.setClave(request.getParameter("txtClave"));

        UsuarioDTO ue = usuarioService.validarLogin(usuarioValida);
        if(ue == null){
            mv = new ModelAndView("login","msgError", "Usuario y clave no existen. Vuelva a intentar");
        }else{
            mv = new ModelAndView("saludo", "mensaje", "Bienvenido "+ue.getNombreCompleto());
        }
        return mv;
    }

}
