package com.example.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.Bean.Matiere;
import com.example.application.Bean.Utilisateur;

public interface MatiereRepository extends JpaRepository<Matiere, Long>{

}
