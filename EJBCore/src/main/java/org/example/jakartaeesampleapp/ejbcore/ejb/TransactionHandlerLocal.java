package org.example.jakartaeesampleapp.ejbcore.ejb;

import jakarta.ejb.Local;


@Local
public interface TransactionHandlerLocal {

    public String setEJBQuestion(String question);


}
