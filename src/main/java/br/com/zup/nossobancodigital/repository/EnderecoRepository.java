package br.com.zup.nossobancodigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.nossobancodigital.modelo.Cliente;

public interface EnderecoRepository  extends JpaRepository<Cliente, String>{

}
