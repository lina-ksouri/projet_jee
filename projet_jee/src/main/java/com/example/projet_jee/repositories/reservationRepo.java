package com.example.projet_jee.repositories;

 import com.example.projet_jee.domain.reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface reservationRepo extends JpaRepository<reservation,Integer> {
    public List<reservation> findByIdR(int idR);
}
