package edu.cibertec.spring_mvc_42v.resources.dao;

import edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAO {

    public UsuarioDTO validarLogin(UsuarioDTO usuario){
        if(usuario.getUsuario().equalsIgnoreCase("user") && usuario.getClave().equals("12345")){
            usuario.setNombreCompleto("Nombre completo del usuario");
        }else
            usuario = null;
        return usuario;
    }
}
