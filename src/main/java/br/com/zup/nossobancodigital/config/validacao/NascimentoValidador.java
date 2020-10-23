package br.com.zup.nossobancodigital.config.validacao;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NascimentoValidador implements ConstraintValidator<Nascimento, Date> {

	public void initialize(UnicoEmail constraint) {
	}

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}