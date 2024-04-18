package com.jeremyyytannn.tutorial.services.impl;

import org.springframework.stereotype.Component;

import com.jeremyyytannn.tutorial.services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "green";
  }
}
