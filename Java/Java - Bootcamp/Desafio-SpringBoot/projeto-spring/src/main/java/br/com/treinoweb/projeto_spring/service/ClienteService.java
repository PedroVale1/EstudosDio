package br.com.treinoweb.projeto_spring.service;

import br.com.treinoweb.projeto_spring.model.Cliente;


public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}