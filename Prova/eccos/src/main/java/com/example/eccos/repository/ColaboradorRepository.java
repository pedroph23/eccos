package com.example.eccos.repository;

import com.example.eccos.domain.Colaborador;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
/**
     * Spring Data JPA repository for the Colaborador entity.
     */
    @SuppressWarnings("unused")
    @Repository
    public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {




    Page<Colaborador> findAll(Pageable pageable);


}


