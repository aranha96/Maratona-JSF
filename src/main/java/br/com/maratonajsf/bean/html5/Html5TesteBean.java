package br.com.maratonajsf.bean.html5;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Named
@ViewScoped
public class Html5TesteBean implements Serializable {
    private String email;
    private String url;
    private int numero;
    private Map<String,String> attributes = new HashMap<>();

    public void salvar(){
        System.out.println(email);
        System.out.println(url);
        System.out.println(numero);
    }

    public void init(){
        attributes.put("type","email");
        attributes.put("placeholder","Digite o seu E-mail");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
