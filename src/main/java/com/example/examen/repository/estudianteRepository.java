package com.example.examen.repository;


import com.example.examen.Bean.estudianteBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface estudianteRepository extends CrudRepository<estudianteBean, Integer> {

}
