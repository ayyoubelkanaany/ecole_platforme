package com.example.application.Bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Examen implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private int Duree;
private Date DateOvertur;
@OneToOne
@JoinColumn(name = "Id_Matiere")
private Matiere Matiere;
public Examen() {
	super();
}
public Examen(int duree, Date dateOvertur, com.example.application.Bean.Matiere matiere) {
	super();
	Duree = duree;
	DateOvertur = dateOvertur;
	Matiere = matiere;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public int getDuree() {
	return Duree;
}
public void setDuree(int duree) {
	Duree = duree;
}
public Date getDateOvertur() {
	return DateOvertur;
}
public void setDateOvertur(Date dateOvertur) {
	DateOvertur = dateOvertur;
}
public Matiere getMatiere() {
	return Matiere;
}
public void setMatiere(Matiere matiere) {
	Matiere = matiere;
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
	Examen other = (Examen) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
