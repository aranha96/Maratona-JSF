package br.com.maratonajsf.bean.comunicacao;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable {
    private String nome;
    private String sobrenome;
    private Date data;

    public void init(){
        System.out.println("criou comunicacao 3");
        System.out.println(nome);
        System.out.println(sobrenome);
    }

    public String save(){
        System.out.println("Salvando");
        return "resultado?faces-redirect=true&amp;includeViewParams=true";
    }

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
