package com.senforage.EauSenforage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.senforage.EauSenforage.entities.Village;

@Repository
public interface IVillage extends JpaRepository<Village, Integer> {

	@Query("SELECT v FROM Village v WHERE v.nom=:nom")
	public Village getVillageByNom(@Param(value="nom") String nom);

	
}
