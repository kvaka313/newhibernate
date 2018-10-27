package com.infopulse.main;

import com.infopulse.dao.ClientDao;
import com.infopulse.entity.Client;
import com.infopulse.factory.Factory;

public class Main {
    public static void main(String[] args){
      Client c = new Client();
      c.setName("Vasya");
      c.setSurename("Pupkin");
      ClientDao clientDao = Factory.getInstance().getClientDao();
      clientDao.insertClient(c);
    }
}
