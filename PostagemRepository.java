package org.blog.blogpessoal.repository;

import java.util.List;

import org.blog.blogpessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> FindAllByTituloContainingIgnoreCase (String titulo); 
	// busca tudo que estiver dentro da variavel


}
	

