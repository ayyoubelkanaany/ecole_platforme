package com.example.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.Bean.CategorieCours;
import com.example.application.Bean.Utilisateur;

public interface CategorieCoursRepository extends JpaRepository<CategorieCours, Long>{

}
