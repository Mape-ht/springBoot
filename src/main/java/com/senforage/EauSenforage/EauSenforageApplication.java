package com.senforage.EauSenforage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.senforage.EauSenforage.dao.IAbonne;
import com.senforage.EauSenforage.dao.IRole;
import com.senforage.EauSenforage.dao.IUser;
import com.senforage.EauSenforage.dao.IVillage;
import com.senforage.EauSenforage.entities.Abonne;
import com.senforage.EauSenforage.entities.Role;
import com.senforage.EauSenforage.entities.User;
import com.senforage.EauSenforage.entities.Village;

@SpringBootApplication
public class EauSenforageApplication {

	public static void main(String[] args) {
		
		//methode avec @bean plus rapide
		
		SpringApplication.run(EauSenforageApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(IVillage iVillage, IAbonne iAbonne,IUser iUser, IRole iRole) {
	
		return args -> {
		iVillage.save(new Village(1, "Tattaguine"));
		iAbonne.save(new Abonne(1, "Mape", "27 rue des Fleures", "774561212", iVillage.findById(1).orElse(null), iUser.findById(1).orElse(null)));
		iUser.save(new User(1, "Mape", "Map", "mape@gmail.com", "toujours", 1, iVillage.findById(1).orElse(null)));
		iRole.save(new Role(1, "admin"));
		};
	}
		//Autres methodes
//		ApplicationContext ctx = SpringApplication.run(EauSenforageApplication.class, args);
//		IUser iUser = ctx.getBean(IUser.class);
//		Village village = new Village();
//		User user = new User();
//		Role roles= new Role();
//		village.setId(1);
//		village.setNom("Tattaguine");
//		village.setUser(iUser.find);
//		roles.setNom("admin");
//		user.setId(1);
//		user.setNom("mape");
//		user.setPrenom("map");
//		user.setEmail("mape@gmail.com");
//		user.setPassword("toujours");
//		user.setEtat(1);
//		List<Role> role = new ArrayList<Role>();
//		role.add(roles);
//		user.setRoles(role);
//		
//		try {
//			
//			iUser.findAll();
//			iUser.save(user);
//			System.out.println("ok");
//			
//		}catch (Exception e){
//			e.printStackTrace();
//			
//		}
	

}
