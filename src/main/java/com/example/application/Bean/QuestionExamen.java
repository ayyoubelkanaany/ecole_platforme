package com.example.application.Bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class QuestionExamen implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
private String question;
@OneToOne
@JoinColumn(name = "Id_Examen")
private Examen Examen;
public QuestionExamen() {
	super();
}
public QuestionExamen(String question, com.example.application.Bean.Examen examen) {
	super();
	this.question = question;
	Examen = examen;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Examen getExamen() {
	return Examen;
}
public void setExamen(Examen examen) {
	Examen = examen;
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
	QuestionExamen other = (QuestionExamen) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}

}
