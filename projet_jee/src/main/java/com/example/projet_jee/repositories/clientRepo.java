package com.example.projet_jee.repositories;

import com.example.projet_jee.domain.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface clientRepo extends JpaRepository<client,Integer> {

    Optional<client> findByCin(int cin);
    void deleteClientByCin(int cin1);
}
