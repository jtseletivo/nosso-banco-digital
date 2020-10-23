package br.com.zup.nossobancodigital.controller.form;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;

import br.com.zup.nossobancodigital.config.validacao.UnicoCpf;
import br.com.zup.nossobancodigital.config.validacao.UnicoEmail;
import br.com.zup.nossobancodigital.modelo.Cliente;

public class ClienteForm {
	
	@NotEmpty
	private String nome;
	@NotEmpty
	private String sobrenome;
	@NotEmpty @Email @UnicoEmail
	private String email;
	@Past
	private LocalDateTime dataNascimento;
	@CPF @UnicoCpf
	private String cpf;

	
	/*public boolean ehIdadeMaiorQue18() {
		//return LocalDateTime.now().minusYears(dataNascimento.getYear())<18;
	}*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente converter() {
		return new Cliente(this.nome, this.sobrenome, this.email, this.dataNascimento, this.cpf);
	}
	
	
}
