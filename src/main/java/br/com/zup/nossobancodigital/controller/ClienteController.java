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
import br.com.zup.nossobancodigital.controller.form.ClienteForm;
import br.com.zup.nossobancodigital.modelo.Cliente;
import br.com.zup.nossobancodigital.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public ResponseEntity<ClienteDto> cadastrar(@RequestBody @Valid ClienteForm form, UriComponentsBuilder uriBuilder) {
		Cliente cliente = form.converter();
		clienteRepository.save(cliente);
		URI location = uriBuilder.path("clientes/{cpf}/enderecos").buildAndExpand(cliente.getCpf()).toUri();
		return ResponseEntity.created(location).body(new ClienteDto(cliente));
		
	}
}
