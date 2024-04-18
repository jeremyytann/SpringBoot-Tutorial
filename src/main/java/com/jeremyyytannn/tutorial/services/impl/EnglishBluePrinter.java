package com.jeremyyytannn.tutorial.services.impl;

import org.springframework.stereotype.Component;

import com.jeremyyytannn.tutorial.services.BluePrinter;

@Component
public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "blue";
  }
}
