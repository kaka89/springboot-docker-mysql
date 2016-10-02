package com.umasuo.springboot.docker.mysql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umasuo.springboot.docker.mysql.model.TestTable;
import com.umasuo.springboot.docker.mysql.repositories.TestRepository;

/**
 * 
 * @author bruceliu
 * @date 2016-10-02
 */
@RestController
public class TestController {

  @Autowired
  TestRepository repoitory;


  @RequestMapping("/")
  public String test(long id) {
    TestTable values = repoitory.findOne(id);
    return "name: " + values.getName() + ", value: " + values.getValue();
  }

}
