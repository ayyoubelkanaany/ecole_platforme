package com.example.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.Bean.Examen;
import com.example.application.Bean.Utilisateur;

public interface ExamenRepository extends JpaRepository<Examen, Long>{

}
