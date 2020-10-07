package com.example.application.Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Niveau implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String Nom;
public Niveau() {
	super();
}
public Niveau(String nom) {
	super();
	Nom = nom;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Id == null) ? 0 : Id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Niveau other = (Niveau) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}


}
