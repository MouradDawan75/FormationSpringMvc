package fr.dawan.demoapirest;

import fr.dawan.demoapirest.tools.Contact;
import fr.dawan.demoapirest.tools.ContactDto;
import fr.dawan.demoapirest.tools.ModelMapperDemo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoapirestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoapirestApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>> test ModelMapper<<<<<<<<<<<<");

		Contact c = new Contact();
		c.setFirstName("DUPONT");
		c.setLastName("Jean");
		ContactDto dto = ModelMapperDemo.dtoFormEntity(c);

		System.out.println(dto);

	}
}
