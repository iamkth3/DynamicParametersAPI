package com.example1.dao;

//YourDao.java

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example1.entity.YourEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class YourDao {

 @PersistenceContext
 private EntityManager entityManager;

 public String processData(String param1, String param2, String param3) {
     YourEntity entity = new YourEntity();
     entity.setParam1(param1);
     entity.setParam2(param2);
     entity.setParam3(param3);

     entityManager.persist(entity);

     // For demonstration purposes, just returning a message
     return "Data saved successfully";
 }
}

