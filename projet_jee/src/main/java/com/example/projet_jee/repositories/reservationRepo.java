package com.example.projet_jee.repositories;

 import com.example.projet_jee.domain.reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
 import java.util.Optional;
@Repository
public interface reservationRepo extends JpaRepository<reservation,Integer> {
    Optional <reservation> findByIdr(int idr);
    //void deletereservationByIdr(int idr);
}
