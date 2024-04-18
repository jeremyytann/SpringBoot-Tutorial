package com.jeremyyytannn.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jeremyyytannn.tutorial.services.BluePrinter;
import com.jeremyyytannn.tutorial.services.ColourPrinter;
import com.jeremyyytannn.tutorial.services.GreenPrinter;
import com.jeremyyytannn.tutorial.services.RedPrinter;
import com.jeremyyytannn.tutorial.services.impl.ColourPrinterImpl;
import com.jeremyyytannn.tutorial.services.impl.EnglishBluePrinter;
import com.jeremyyytannn.tutorial.services.impl.EnglishGreenPrinter;
import com.jeremyyytannn.tutorial.services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {
  @Bean
  public BluePrinter bluePrinter() {
    return new EnglishBluePrinter();
  }

  @Bean
  public RedPrinter redPrinter() {
    return new EnglishRedPrinter();
  }

  @Bean
  public GreenPrinter greenPrinter() {
    return new EnglishGreenPrinter();
  }

  @Bean
  public ColourPrinter colourPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
  }
}
