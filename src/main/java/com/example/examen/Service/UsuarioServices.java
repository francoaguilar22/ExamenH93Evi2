package com.example.examen.Service;

import com.example.examen.Bean.UsuarioRolEntity;
import com.example.examen.Bean.UsuariosEntity;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface UsuarioServices {

    public UsuariosEntity guardarUsuarioService (UsuariosEntity usuariosEntity, Set<UsuarioRolEntity> usuarioRolEntity) throws Exception;

    public UsuariosEntity obtenerUsuarioService (String );

    public void eliminarUsuarioService (int idusurios);

}
