package edu.cibertec.spring_mvc_42v.resources.service;

import edu.cibertec.spring_mvc_42v.resources.dao.UsuarioDAO;
import edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    public UsuarioDTO validarLogin(UsuarioDTO usuario){
        return usuarioDAO.validarLogin(usuario);
    }

    public void insertarUsuario(UsuarioDTO usuario){
        usuarioDAO.insertarUsuario(usuario);
    }

    public List<UsuarioDTO> getListaUsuario(){
        return usuarioDAO.getListaUsuario();
    }

}
