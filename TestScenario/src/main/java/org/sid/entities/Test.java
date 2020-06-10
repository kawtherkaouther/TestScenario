package org.sid.entities;

import java.util.Locale.Category;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="test")

@Getter
@Setter
@ToString
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTest")
	private int id;
	
	@Column(name="NomTest")
	private String Nom;
	
	@ManyToOne
	@JoinColumn(name="Projet_idProjet" , nullable=false)
	private Projet Projet;
	
	@OneToMany
	private Set<Type> type;
	
	@OneToMany
	private Set<Category> category;
	
	@OneToMany
	private Set<Scenario> scenario;
	
	
	
	

}
