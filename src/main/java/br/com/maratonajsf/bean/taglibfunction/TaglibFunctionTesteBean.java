package br.com.maratonajsf.bean.taglibfunction;

import org.apache.commons.lang3.text.WordUtils;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ViewScoped
public class TaglibFunctionTesteBean implements Serializable {
    private List<String> names = asList("bruce wayne", "clark kent", "barry allen");

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
