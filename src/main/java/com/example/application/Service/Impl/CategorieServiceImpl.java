package com.example.application.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.Bean.CategorieCours;
import com.example.application.Dao.CategorieCoursRepository;
import com.example.application.Service.facad.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
 private CategorieCoursRepository categorieCoursRepository;

	@Override
	public void save(CategorieCours categorieCours) {
		this.categorieCoursRepository.save(categorieCours);
		
	}

	@Override
	public List<CategorieCours> listCategorieCours() {
		if(this.categorieCoursRepository.findAll().isEmpty())
			return null;
		else
		return this.categorieCoursRepository.findAll();
	}

	@Override
	public void DeleteCategorie(Long Id) {
		 this.categorieCoursRepository.deleteById(Id);;
	}
	
}
