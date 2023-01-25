package org.blog.blogpessoal.controller;

import java.util.List;

import org.blog.blogpessoal.model.Postagem;
import org.blog.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // para definir que é uma classe controller
@RequestMapping ("/postagem")
@CrossOrigin(" * ") // define que ira aceitar requisicoes de qualquer origem
public class PostagemController {
	
	@Autowired // define que o proprio spring instancie os objetos  	
	private PostagemRepository repositi;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repositi.findAll());
	}

}
