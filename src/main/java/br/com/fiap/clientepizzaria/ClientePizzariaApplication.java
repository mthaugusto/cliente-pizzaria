package br.com.fiap.clientepizzaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
>>>>>>> b251e5c (Initial commit)
@SpringBootApplication
public class ClientePizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientePizzariaApplication.class, args);
	}

<<<<<<< HEAD
=======
	@GetMapping(value = "/")
	public String index() {
		String hello = """
				Bom dia! 2TDSPG
								
				Sejam bem vindos à Benezinho Pizzaria
				""";
		return hello;
	}
>>>>>>> b251e5c (Initial commit)
}
