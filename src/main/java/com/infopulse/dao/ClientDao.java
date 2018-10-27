package com.infopulse.dao;

import com.infopulse.entity.Client;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class ClientDao {

    private SessionFactory sessionFactory;

    public ClientDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void insertClient(Client c){
        EntityManager entityManager =sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(c);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
