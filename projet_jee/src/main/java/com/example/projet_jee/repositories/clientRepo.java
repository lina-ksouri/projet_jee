package com.example.projet_jee.repositories;

import com.example.projet_jee.domain.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface clientRepo extends JpaRepository<client,Integer> {
    public client findByCin(int cin);

}
