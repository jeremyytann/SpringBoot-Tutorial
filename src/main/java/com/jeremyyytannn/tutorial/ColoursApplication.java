package com.jeremyyytannn.tutorial;

import com.jeremyyytannn.tutorial.services.ColourPrinter;
import com.jeremyyytannn.tutorial.services.impl.ColourPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoursApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ColoursApplication.class, args);
  }

  @Override
  public void run(final String... args) {
    final ColourPrinter colourPrinter = new ColourPrinterImpl();
    System.out.println(colourPrinter.print());
  }
}
