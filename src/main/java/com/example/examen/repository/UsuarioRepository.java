package com.example.examen.repository;

import com.example.examen.Bean.UsuariosEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuariosEntity,Integer> {

    public UsuariosEntity findByUsername (String );

}
