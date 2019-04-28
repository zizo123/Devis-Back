package com.devis;

//import javax.annotation.Resource;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cache.annotation.EnableCaching;
//import com.devis.metier.impl.StorageMetierImpl;

//@EnableCaching
@SpringBootApplication
public class DevisApplication {
	
	/*@Resource
	StorageMetierImpl storageService;*/

	public static void main(String[] args) {
		SpringApplication.run(DevisApplication.class, args);
	}
	
	/*@Override
	public void run(String... args) throws Exception {
		//storageService.deleteAll();
		storageService.init();
	}*/
}
