package org.sid.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="category")

@Getter
@Setter
@ToString
public class Categorie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCategory")
	private int id;
	
	
	private String Nom;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="Test")
	private Set<Test> test;

}
