package br.com.zup.nossobancodigital.config.validacao;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.zup.nossobancodigital.repository.ClienteRepository;

public class UnicoEmailValidador implements ConstraintValidator<UnicoEmail, String>{

	private ClienteRepository clienteRepository;	
	
	public UnicoEmailValidador(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

    public void initialize(UnicoEmail constraint) {
    }
    
	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		return clienteRepository.findByEmail(email).isEmpty();
	}

}
