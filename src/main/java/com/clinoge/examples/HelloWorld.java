package com.clinoge.examples;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

@RequestScoped
class HelloWorld implements Serializable {
    private String name;

    public String getName() {
        return "MUHC";
    }
    public void setName() {
    }
    public void hide(ActionEvent actionEvent) {
        RequestContext rc = RequestContext.getCurrentInstance();
        rc.execute("$('#first').hide();");
    }
}
