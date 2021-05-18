package com.example.projet_jee.repositories;

import com.example.projet_jee.domain.chambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface chambreRepo extends JpaRepository<chambre,Integer> {
    Optional<chambre> findByIdC(int idC);
    void deletechambreByIdC(int idC1);
}
