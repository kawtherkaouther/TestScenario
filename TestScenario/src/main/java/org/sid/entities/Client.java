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
@Table(name="client")

@Getter
@Setter
@ToString
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idClient")
	private int id;
	
	@Column(name="NomClient")
	private String Nom;
	
	@Column(name="telClient")
	private String tel;
	
	
	private String Pays;
	
	
	private String RNE;
	
    @OneToMany(cascade=CascadeType.ALL , mappedBy="Client")
	
	private Set<Projet> projet;
	

}
