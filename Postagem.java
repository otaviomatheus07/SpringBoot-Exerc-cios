package org.blog.blogpessoal.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // faz virar uma tabela no banco de dados
@Table(name="tb_postagem")// cria o nome da tabela do banco de dados
public class Postagem {
	
	
	@Id // funciona como o primary key
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Funciona como o auto_increment 
	private Long id;
	@NotNull // Funciona para não deixar o campo em branco
	@Size(min = 5, max = 100) // define a quantidade de caracteres
	public String titulo;
	@NotNull // Funciona para não deixar o campo em branco
	@Size(min = 10, max = 500) // define a quantidade de caracteres
	public String texto;
	
	public LocalDate data;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}

// Interface repository
/*
 * package org.blog.blogpessoal.repository;

import java.util.List;

import org.blog.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> FindAllByTituloContainingIgnoreCase (String titulo); 
	// busca tudo que estiver dentro da variavel


}
	


 */





// classe PostagemController

/*
 * package org.blog.blogpessoal.controller;

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
*/
