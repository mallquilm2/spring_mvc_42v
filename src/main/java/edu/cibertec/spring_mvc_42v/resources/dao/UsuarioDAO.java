package edu.cibertec.spring_mvc_42v.resources.dao;

import edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDAO {

    private List<UsuarioDTO> listaUsuarios;

    @PostConstruct
    public void UsuarioDTO(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioDTO("jose", "12345", "Jose Perez"));
        listaUsuarios.add(new UsuarioDTO("luis", "12345", "Luis Medina"));
        listaUsuarios.add(new UsuarioDTO("carmen", "12345", "Carmen Rios"));
        listaUsuarios.add(new UsuarioDTO("maria", "12345", "Maria Pineda"));
    }

    public void insertarUsuario(UsuarioDTO usuario){
        listaUsuarios.add(usuario);
    }

    public List<UsuarioDTO> getListaUsuario(){
        return listaUsuarios;
    }

    public UsuarioDTO validarLogin(UsuarioDTO usuario){
        if(usuario.getUsuario().equalsIgnoreCase("user") && usuario.getClave().equals("12345")){
            usuario.setNombreCompleto("Nombre completo del usuario");
        }else
            usuario = null;
        return usuario;
    }
}
