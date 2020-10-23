package br.com.zup.nossobancodigital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.nossobancodigital.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	List<Cliente> findByEmail(String email);
	List<Cliente> findByCpf(String cpf);
}
