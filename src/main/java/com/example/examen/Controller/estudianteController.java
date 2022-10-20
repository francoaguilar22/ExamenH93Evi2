package com.example.examen.Controller;


import com.example.examen.Bean.estudianteBean;
import com.example.examen.repository.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class estudianteController {


    @Autowired
    private estudianteRepository estuRepo;


    @GetMapping("/obtener")
    public List<estudianteBean> obtenerEstudiante (){
        List<estudianteBean> listaEstudiante = new ArrayList<>();
        listaEstudiante = (List<estudianteBean>) estuRepo.findAll();
        return listaEstudiante;
    }

    @PostMapping("/insertar")
    public void insertarEstudiante(@RequestBody estudianteBean estuBean){
        estuRepo.save(estuBean);
    }

    @PutMapping("/modificar")
    public void modificarAlumno (@RequestBody estudianteBean estuBean) {
        estuRepo.save(estuBean);
    }

    @DeleteMapping("/eliminar")
    public void eliminar (@RequestBody estudianteBean estuBean){
        estuRepo.deleteById(estuBean.getIdestudiante());
    }

}
