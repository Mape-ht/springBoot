package com.senforage.EauSenforage.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Village implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom; 
	@ManyToOne
	@JoinColumn(name="abonne_ID")
	private Abonne abonne ;
	@OneToMany(mappedBy="village",fetch=FetchType.LAZY)
	private List<User> users = new ArrayList<>();
	public Village() {
		//super();
	}
	public Village(int id, String nom, Abonne abonne, List<User> user) {
		//super();
		this.id = id;
		this.nom = nom;
		this.abonne = abonne;
		this.users = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Abonne getAbonne() {
		return abonne;
	}
	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}
	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> user) {
		this.users = user;
	}
	@Override
	public String toString() {
		return "Village [id=" + id + ", nom=" + nom + ", abonne=" + abonne + ", user=" + users + "]";
	}
	
	
	
	}
