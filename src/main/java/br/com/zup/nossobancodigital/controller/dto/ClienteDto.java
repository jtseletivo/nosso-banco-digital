package br.com.zup.nossobancodigital.controller.dto;

import java.time.LocalDateTime;

import br.com.zup.nossobancodigital.modelo.Cliente;

public class ClienteDto {
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDateTime dataNascimento;
	private String cpf;	
	
	public ClienteDto() {
	}

	public ClienteDto(Cliente cliente) {
		this.nome = cliente.getNome();
		this.sobrenome = cliente.getSobrenome();
		this.email = cliente.getEmail();
		this.dataNascimento = cliente.getDataNascimento();
		this.cpf = cliente.getCpf();
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	
	
}
