package com.waigel.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@OpenAPIDefinition(
    info =
        @Info(
            title = "IBAN Validator API",
            version = "1.0.o",
            description =
                "With this API you can validate your IBAN and fetch additional information about the Bank and account behind it.",
            contact =
                @Contact(
                    url = "https://iban.waigel.com",
                    name = "Johannes Waigel",
                    email = "johannes@waigel.me")))
@SpringBootApplication
@EnableScheduling
public class IBANValidatorBackendApplication {

  public static void main(String[] args) throws IOException {

    SpringApplication.run(IBANValidatorBackendApplication.class, args);
  }
}
