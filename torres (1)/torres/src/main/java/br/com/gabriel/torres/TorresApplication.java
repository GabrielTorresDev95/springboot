package br.com.gabriel.torres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(value = "br.com.gabriel.torres.model.Repository.ProdutoRepository")

public class TorresApplication {

	public static void main(String[] args) {
		SpringApplication.run(TorresApplication.class, args);
	}

}
