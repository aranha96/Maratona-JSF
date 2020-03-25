package br.com.maratonajsf.bean.estudante;

import br.com.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "Curso", "JSF"};
    private List<String> nomesLista = asList("Jaime", "Eduardo", "Padilla");
    private Set<String> nomesSet = new HashSet<>(asList("Java", "Cpp", "Python"));
    private Map<String, String> nomesMap = new HashMap<>();
    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Calculo", "Departamento de Matematica");
        nomesMap.put("PDI", "Departamento de Informática");
        nomesMap.put("Filosofia", "Departamento de Filosofia");
    }

    public void executar(){
        System.out.println("Fazendo busca no BD");
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public void executar(String param){
        System.out.println("Fazendo busca no BD com o parametro: " +param);
        System.out.println("Processando os dados");
        System.out.println("Exibindo os dados");
    }

    public String executarRetorno(String param){
        return "Curso online sobre: " +param;
    }

    public String irParaIndex2(){
        return "index2";
    }

    public void exibirNotas(){
        this.mostrarNotas = true;
    }

    public void esconderNotas(){
        this.mostrarNotas = false;
    }

    public void exibirLink(){
        this.mostrarLink = true;
    }

    public void esconderLink(){
        this.mostrarLink = false;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesLista() {
        return nomesLista;
    }

    public void setNomesLista(List<String> nomesLista) {
        this.nomesLista = nomesLista;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }
}
