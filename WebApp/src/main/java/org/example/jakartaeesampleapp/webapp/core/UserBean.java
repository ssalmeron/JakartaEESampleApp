package org.example.jakartaeesampleapp.webapp.core;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.jakartaeesampleapp.ejbcore.ejb.TransactionHandlerLocal;


@Getter
@Setter
@NoArgsConstructor
@RequestScoped
@Named("userBean")
public class UserBean {
    @NotEmpty
    private String name;

    @EJB
    TransactionHandlerLocal handlerLocal;

    @EJB
    UserEJBLocal ejb;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    @PostConstruct
    private void init() {
        name="Constructor Name";
        lastName="Constructor Last Name";
        email="somemail@yopmail.com";
    }

    public String getLocalQuestion(){
        return ejb.setLocalQuestion("Pregunta");
    }

    public String getLocalEJBQuestion(){
        return handlerLocal.setEJBQuestion("Pregunta EJB Core");
    }



}
