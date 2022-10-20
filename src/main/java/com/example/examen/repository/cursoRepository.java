package com.example.examen.repository;

import com.example.examen.Bean.cursosBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cursoRepository extends CrudRepository <cursosBean,Integer>{
}
