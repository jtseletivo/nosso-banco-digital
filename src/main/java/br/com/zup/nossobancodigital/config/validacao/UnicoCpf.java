package br.com.zup.nossobancodigital.config.validacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UnicoCpfValidador.class)
public @interface UnicoCpf {
    String message() default "{br.com.zup.nossobancodigital.UnicoCpf}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
