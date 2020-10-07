package com.example.application.Ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.Bean.Niveau;
import com.example.application.Service.Impl.NiveauServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NiveauRestServce {
 @Autowired
 private NiveauServiceImpl niveauServiceImpl;
@RequestMapping(value = "/Niveau",method = RequestMethod.POST)
public void saveNiveau(@RequestBody Niveau niveau) {
	niveauServiceImpl.saveNiveau(niveau);
}
@RequestMapping(value = "/Niveau",method = RequestMethod.DELETE)
public void deleteNiveau(@PathVariable Long Id) {
	niveauServiceImpl.deleteNiveau(Id);
}
@RequestMapping(value = "/Niveau",method = RequestMethod.GET)
public List<Niveau> getAllNiveau() {
	return niveauServiceImpl.getAllNiveau();
}
 
}
