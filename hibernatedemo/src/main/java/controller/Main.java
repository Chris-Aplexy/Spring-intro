package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        System.out.println("print hello world");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("edu.mum.cs.domain");
        factory.createEntityManager();

    }
}
