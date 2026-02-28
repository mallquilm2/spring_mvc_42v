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
        listaUsuarios.add(new UsuarioDTO(1,"jose", "12345", "Jose Perez", null));
        listaUsuarios.add(new UsuarioDTO(2,"luis", "12345", "Luis Medina", null));
        listaUsuarios.add(new UsuarioDTO(3, "carmen", "12345", "Carmen Rios", null));
        listaUsuarios.add(new UsuarioDTO(4, "maria", "12345", "Maria Pineda", null));
    }

    public void insertarUsuario(UsuarioDTO usuario){
        listaUsuarios.add(usuario);
    }

    public List<UsuarioDTO> getListaUsuario(){
        return listaUsuarios;
    }

    public void usuarioEliminar(int id){
        for (UsuarioDTO u: listaUsuarios) {
            if(u.getId()==id)
                listaUsuarios.remove(id);
        }
    }

    public UsuarioDTO validarLogin(UsuarioDTO usuario){
        if(usuario.getUsuario().equalsIgnoreCase("user") && usuario.getClave().equals("12345")){
            usuario.setNombreCompleto("Nombre completo del usuario");
        }else
            usuario = null;
        return usuario;
    }

    public UsuarioDTO getUsuario(String codigo){
        UsuarioDTO rpta = null;
        for(UsuarioDTO usuario:listaUsuarios){
            if(usuario.getUsuario().equalsIgnoreCase(codigo)){
                rpta = usuario;
                break;
            }
        }
        return rpta;
    }
}
