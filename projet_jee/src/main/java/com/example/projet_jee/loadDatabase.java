package com.example.projet_jee;

import com.example.projet_jee.domain.client;
import com.example.projet_jee.repositories.clientRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
class loadDatabase {

    private static final Logger log = LoggerFactory.getLogger(loadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(clientRepo repository) {

        return args -> {
            log.info("Preloading " + repository.save(new client("Ksouri","Lina","lina@gmail.com",
                    "soukra",23787323, LocalDate.of(1998, Month.JUNE,17))));
            log.info("Preloading " + repository.save(new client("Attia","Siwar", "siwar@gmail.com",
                    "ariana",50601409,LocalDate.of(1997, Month.NOVEMBER,22))));
        };
    }
}