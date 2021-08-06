package org.example.jakartaeesampleapp.webapp.core;

import jakarta.ejb.Stateless;



@Stateless(mappedName = "ejb/WebApp/UserEJB",description = "User EJB")
public class UserEJB implements UserEJBLocal{
    @Override
    public String setLocalQuestion(String question) {
        return "The question is: " + question;
    }
}
