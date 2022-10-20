package com.example.examen.repository;

import com.example.examen.Bean.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends <RolEntity,Integer> {
}
