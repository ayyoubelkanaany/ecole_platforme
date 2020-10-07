package com.example.application.Ws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.Bean.Utilisateur;
import com.example.application.Service.Impl.UtilisateurServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UtilisateurRestService {
	@Autowired
 private UtilisateurServiceImpl utilisateurServiceImpl;
    @RequestMapping(value = "/Utilisateur",method = RequestMethod.POST)
	public void save(@RequestBody Utilisateur utilisateur) {
		utilisateurServiceImpl.save(utilisateur);
	}
    @RequestMapping(value = "/Utilisateur",method = RequestMethod.PUT)
	public Boolean Update(@RequestBody Utilisateur utilisateur) {
		return utilisateurServiceImpl.Update(utilisateur);
	}
    @RequestMapping(value = "/Utilisateur",method = RequestMethod.GET)
	public List<Utilisateur> getAll() {
		return utilisateurServiceImpl.getAll();
	}
    @RequestMapping(value = "/Utilisateur/{Id}",method = RequestMethod.GET)
	public Optional<Utilisateur> getUtilisateur(@PathVariable Long Id) {
		return utilisateurServiceImpl.getUtilisateur(Id);
	}
	
}
