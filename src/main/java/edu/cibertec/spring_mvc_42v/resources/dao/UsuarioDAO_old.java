package edu.cibertec.spring_mvc_42v.resources.dao;

import edu.cibertec.spring_mvc_42v.resources.entity.UsuarioEntity;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioDAO_old {

    private List<UsuarioEntity> listaUsuarios;

    @PostConstruct
    public void UsuarioDTO(){
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new UsuarioEntity(1,"jose", "12345", "Jose Perez", null));
        listaUsuarios.add(new UsuarioEntity(2,"luis", "12345", "Luis Medina", null));
        listaUsuarios.add(new UsuarioEntity(3, "carmen", "12345", "Carmen Rios", null));
        listaUsuarios.add(new UsuarioEntity(4, "maria", "12345", "Maria Pineda", null));
    }

    public void insertarUsuario(UsuarioEntity usuario){
        listaUsuarios.add(usuario);
    }

    public List<UsuarioEntity> getListaUsuario(){
        return listaUsuarios;
    }

    public void usuarioEliminar(int id){
        for (UsuarioEntity u: listaUsuarios) {
            if(u.getId()==id)
                listaUsuarios.remove(id);
        }
    }

    public UsuarioEntity validarLogin(UsuarioEntity usuario){
        if(usuario.getUsuario().equalsIgnoreCase("user") && usuario.getClave().equals("12345")){
            usuario.setNombreCompleto("Nombre completo del usuario");
        }else
            usuario = null;
        return usuario;
    }

    public UsuarioEntity getUsuario(String codigo){
        UsuarioEntity rpta = null;
        for(UsuarioEntity usuario:listaUsuarios){
            if(usuario.getUsuario().equalsIgnoreCase(codigo)){
                rpta = usuario;
                break;
            }
        }
        return rpta;
    }
}
