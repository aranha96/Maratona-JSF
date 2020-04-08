package br.com.maratonajsf.bean.comunicacao;

import br.com.maratonajsf.model.Estudante;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {
    private String buttonName = "nome do botao do bean";
    private Estudante estudante = new Estudante();

    public void execute(ActionEvent event){
      String nome = (String) event.getComponent().getAttributes().get("Nome");
      String aula = (String) event.getComponent().getAttributes().get("Aula");
      Estudante estudante = (Estudante) event.getComponent().getAttributes().get("Estudante");
      String test = (String) event.getComponent().getAttributes().get("test");
      System.out.println(nome);
      System.out.println(aula);
      System.out.println(estudante.getNome());
      System.out.println(test);
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}
