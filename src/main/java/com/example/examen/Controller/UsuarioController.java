package com.example.examen.Controller;


import com.example.examen.Bean.RolEntity;
import com.example.examen.Bean.UsuarioRolEntity;
import com.example.examen.Bean.UsuariosEntity;
import com.example.examen.Service.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServices userService;

    @GetMapping (value = "/{username}")
    public UsuariosEntity obtenerUsuario (@PathVariable("username") String username){
        UsuariosEntity userlocal = new UsuariosEntity();
        userlocal = userService.obtenerUsuarioService(username);
        return userlocal;
    }


    @PostMapping("/registrarUsuario")
    public UsuariosEntity agregarUsuario (@RequestBody UsuariosEntity userJsonEntity) throws Exception{

         Set<UsuarioRolEntity> userRolController =  new HashSet<>();

         RolEntity rol = new RolEntity();
         rol.setIdrol(1);
         rol.setNombrol("Cliente");

         UsuarioRolEntity userrol = new UsuarioRolEntity();
         userrol.setUsuariorol(userJsonEntity);
         userrol.setRolusario(rol);

        userRolController.add(userrol);

        return userService.guardarUsuarioService(userJsonEntity,userRolController);
    }
}
