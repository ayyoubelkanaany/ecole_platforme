package com.example.application.Bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class ReponseCours implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private Date DatePoste;
private String Reponse;
@OneToOne
@JoinColumn(name = "Id_QuestionCours")
private QuestionCours QuestionCours;
public ReponseCours() {
	super();
}
public ReponseCours(Date datePoste, String reponse, com.example.application.Bean.QuestionCours questionCours) {
	super();
	DatePoste = datePoste;
	Reponse = reponse;
	QuestionCours = questionCours;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public Date getDatePoste() {
	return DatePoste;
}
public void setDatePoste(Date datePoste) {
	DatePoste = datePoste;
}
public String getReponse() {
	return Reponse;
}
public void setReponse(String reponse) {
	Reponse = reponse;
}
public QuestionCours getQuestionCours() {
	return QuestionCours;
}
public void setQuestionCours(QuestionCours questionCours) {
	QuestionCours = questionCours;
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
	ReponseCours other = (ReponseCours) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
