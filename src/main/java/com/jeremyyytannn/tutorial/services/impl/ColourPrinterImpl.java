package com.jeremyyytannn.tutorial.services.impl;

import com.jeremyyytannn.tutorial.services.BluePrinter;
import com.jeremyyytannn.tutorial.services.ColourPrinter;
import com.jeremyyytannn.tutorial.services.GreenPrinter;
import com.jeremyyytannn.tutorial.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
