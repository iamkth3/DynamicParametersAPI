package com.example1.service;

//YourService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.dao.YourDao;

@Service
public class YourService {

 @Autowired
 private YourDao yourDao;

 public String processDynamicParameters(String param1, String param2, String param3) {
     return yourDao.processData(param1, param2, param3);
 }
}

