package net.javaguides.GovtVaccinneHD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GovtVaccineHdApplication {
	@CrossOrigin(origins="http://localhost:4200")
	public static void main(String[] args) {
		SpringApplication.run(GovtVaccineHdApplication.class, args);
	}

}
