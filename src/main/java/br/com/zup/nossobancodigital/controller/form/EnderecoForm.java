package br.com.zup.nossobancodigital.controller.form;

import br.com.zup.nossobancodigital.modelo.Cliente;
import br.com.zup.nossobancodigital.modelo.Endereco;
import br.com.zup.nossobancodigital.repository.ClienteRepository;

public class EnderecoForm {

	private String cep;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;	
	private String cpf;
	
	public String getCep() {
		return cep;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCpf() {
		return cpf;
	}
	
	public Endereco converter(ClienteRepository clienteRepository) {
		Cliente cliente = clienteRepository.getOne(cpf);
		return new Endereco(cep, rua, bairro, complemento, cidade, estado, cliente);
	}
	
	
}
