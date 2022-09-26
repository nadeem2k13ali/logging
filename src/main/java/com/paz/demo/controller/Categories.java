package com.paz.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Lenovo on 2/8/2021.
 */
@RestController
@RequestMapping("category")
public class Categories {
  Logger logger = LoggerFactory.getLogger(Categories.class);

  @GetMapping
  public String getCategory(){
    logger.info("-------------------");
    for(int i=0;i<=10000;i++)
    logger.info("list of category "+i);
    return "List of category";
  }

}
