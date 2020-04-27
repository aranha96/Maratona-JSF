package br.com.maratonajsf.bean.beanvalidation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.*;
import java.io.Serializable;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable {
    @Size(max = 10, message = "O nome precisa ter entre 3 e 10 caracteres")
    @NotNull(message = "Nome Obrigatório")
    private String nome;
    @Pattern(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$",
            message = "Digite um email valido")
    private String email;
    @DecimalMax(value = "30.55", message = "Precisa ser menor que 30.55")
    @DecimalMin(value = "2.35", message = "Precisa ser mairo que 2.35")
    private double decimal;
    @Digits(integer = 3, fraction = 2,
            message = "No máximo duas casas decimais, número entre 0 e 999")
    private double numero;

    public void salvar(){
        System.out.println(nome);
        System.out.println(email);
        System.out.println(numero);
        System.out.println(decimal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
}
