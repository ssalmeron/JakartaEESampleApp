package org.example.jakartaeesampleapp.ejbcore.ejb;


import jakarta.ejb.Stateless;

@Stateless(mappedName = "ejb/ejbcore/TransactionHandler")
public class TransactionHandler implements TransactionHandlerLocal {
    @Override
    public String setEJBQuestion(String question) {
        return "Return EJB COre Question is: " + question;
    }
}
