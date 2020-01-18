package com.zhanarys.seguridad;

import com.zhanarys.seguridad.model.Account;
import com.zhanarys.seguridad.model.Card;
import com.zhanarys.seguridad.repository.CardRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

@SpringBootApplication
public class SeguridadApplication {


    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(SeguridadApplication.class, args);

        CardRepository cardRepository = context.getBean(CardRepository.class);
        Card card = new Card();
        Account account = new Account();
        card.setCardNumber(" 777 777 777 777");
        account.setAccountNumber("544664 2165 13465");

        card.setAccountSet(Collections.singleton(account));
        cardRepository.save(card);


    }

}
