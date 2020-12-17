package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

/*
DAO -> DATA ACCESS OBJECT
O DAO É UMA CLASSE/INTERFACE QUE É RESPONSÁVEL PELO CRUD Creat Read Update Delete

DAO é uma camada (classe/interface) para manipulação de dados, especificado no Design Patter




*/
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> { //<objeto representado na tabela, tipo de dado da chave primária>

	/*
	save() -> gravarupdate
	findById() -> pesquisar pela chave primaria
	findAll() -> pesquisar todos
	deleteById()
	deleteAll
	*/
	
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
}
