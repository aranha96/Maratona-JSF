package br.com.maratonajsf.bean.upload;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;

@Named
@ViewScoped
public class UploadTesteBean implements Serializable {
    private Part file;

    public void upload(){
        try(InputStream is = file.getInputStream()){
            String fileName = file.getSubmittedFileName();
            System.out.println(fileName);
            System.out.println(file.getName());
            System.out.println(file.getSize());
            System.out.println(file.getContentType());
            System.out.println(file.getHeaderNames());
            System.out.println(file.getHeader("Content-Disposition"));
            System.out.println(file.getHeader("Content-Type"));
            Files.copy(is,
                    new File("C:\\Users\\jaime\\IdeaProjects\\maratona-jsf",
                            fileName).toPath());
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                    "Arquivo enviado com Sucesso",
                    "");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }
}
