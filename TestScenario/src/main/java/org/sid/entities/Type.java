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
@Table(name="type")

@Getter
@Setter
@ToString
public class Type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idType")
	private int id;
	
	private String Nom;
	
	@OneToMany(cascade=CascadeType.ALL , mappedBy="Test")
	private Set<Test> test;
}
