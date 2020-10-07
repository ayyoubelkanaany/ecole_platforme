package com.example.application.Service.facad;

import java.util.List;

import com.example.application.Bean.CategorieCours;

public interface CategorieService {
 public void save(CategorieCours categorieCours);
 public List<CategorieCours> listCategorieCours();
 public void DeleteCategorie(Long Id);
}
