package org.example.jakartaeesampleapp.webapp.core;


import jakarta.ejb.Local;

@Local
public interface UserEJBLocal {
    public String setLocalQuestion(String question);
}
