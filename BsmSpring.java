package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld2")


public class BsmSpring {
	String mentalidade [] = {"Comunicação", "Pesistência", "Mentalidade de Crescimento"," Responsabilidade Pessoal","Orientação ao Futuro",
			"Orientação ao Detalhe","Proatividade","Trabalho em Equipe"}, saida="";
	@GetMapping
	public String metedo() {
		for(String metodo: mentalidade) {
			saida += metodo+"<br>";
	}
		return saida;
	}
}

// EXE Objetivos da semana//
/*package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld3")
public class Objetivos {
	
	@GetMapping
	public String objetivo() {
		return " Objetivos de aprendizagem desta semana."
				+ " <br><br>Persistência <br>Mentalidade de Crescimento <br>Trabalho em Equipe <br>"
				+ " Orientação ao Futuro";
	}

}
// EXE1 Hello World //
 * 
 * package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // informa que é um controller
@RequestMapping("/helloworld") // informa o endereço da web


public class helloController {
	@GetMapping // pega a informação e exibe
	public String hello() {
		return "Hello World !!! ";
		
	
	}
	
}
 * 
*/