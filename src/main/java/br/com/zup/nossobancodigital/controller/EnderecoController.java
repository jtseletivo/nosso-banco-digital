package br.com.zup.nossobancodigital.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.zup.nossobancodigital.controller.dto.ClienteDto;
import br.com.zup.nossobancodigital.controller.dto.EnderecoDto;
import br.com.zup.nossobancodigital.controller.form.EnderecoForm;
import br.com.zup.nossobancodigital.modelo.Endereco;
import br.com.zup.nossobancodigital.repository.ClienteRepository;
import br.com.zup.nossobancodigital.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@PostMapping
	public ResponseEntity<EnderecoDto> cadastrar(@RequestBody @Valid EnderecoForm form, UriComponentsBuilder uriBuilder) {
		/*Endereco endereco = form.converter(clienteRepository);
		enderecoRepository.save(endereco);
		URI location = uriBuilder.path("clientes/{cpf}/enderecos").buildAndExpand(endereco.getCpf()).toUri();
		return ResponseEntity.created(location).body(new ClienteDto(endereco));*/
		return null;
	}
}
