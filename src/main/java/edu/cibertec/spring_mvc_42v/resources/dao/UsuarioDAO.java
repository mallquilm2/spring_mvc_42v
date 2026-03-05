package edu.cibertec.spring_mvc_42v.resources.dao;

import edu.cibertec.spring_mvc_42v.resources.dao.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository <UsuarioEntity, String> {

    public UsuarioEntity findByUsuarioAndClave(String usuario, String clave);

}
