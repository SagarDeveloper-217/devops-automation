package devops_integration_pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsApplication {
	@GetMapping("/message")
	public String home() {
		return "devops integration Success";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}
