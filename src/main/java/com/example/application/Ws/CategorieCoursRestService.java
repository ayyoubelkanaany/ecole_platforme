package com.example.application.Ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.Bean.CategorieCours;
import com.example.application.Service.Impl.CategorieServiceImpl;

@RestController
public class CategorieCoursRestService {
	@Autowired
private CategorieServiceImpl categorieServiceImpl;
    @RequestMapping(value = "/CategorieCours",method = RequestMethod.POST)
	public void save(@RequestBody CategorieCours categorieCours) {
		categorieServiceImpl.save(categorieCours);
	}
    @RequestMapping(value = "/CategorieCours",method = RequestMethod.GET)
	public List<CategorieCours> listCategorieCours() {
		return categorieServiceImpl.listCategorieCours();
	}
    @RequestMapping(value = "/CategorieCours/{Id}",method = RequestMethod.DELETE)
	public void DeleteCategorie(@PathVariable Long Id) {
		categorieServiceImpl.DeleteCategorie(Id);
	}
	
}
