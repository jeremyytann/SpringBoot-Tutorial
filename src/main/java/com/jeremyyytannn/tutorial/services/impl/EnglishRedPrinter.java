package com.jeremyyytannn.tutorial.services.impl;

import org.springframework.stereotype.Component;

import com.jeremyyytannn.tutorial.services.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
