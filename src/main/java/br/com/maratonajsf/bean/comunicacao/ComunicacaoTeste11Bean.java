package br.com.maratonajsf.bean.comunicacao;

import br.com.maratonajsf.model.Estudante;
import br.com.maratonajsf.util.ApplicationMapUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ComunicacaoTeste11Bean implements Serializable {
    private List<Estudante> estudanteList = Estudante.estudanteList();

    public String editar(Estudante estudante){

        ApplicationMapUtil.setValueInApplicationMap("estudante", estudante);
        return "comunicacao12?faces-redirect=true";
    }

    public List<Estudante> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante> estudanteList) {
        this.estudanteList = estudanteList;
    }
}
