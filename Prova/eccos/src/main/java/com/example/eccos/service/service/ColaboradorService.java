package com.example.eccos.service.service;

import com.example.eccos.domain.Colaborador;
import org.springframework.data.domain.Page;
import java.awt.print.Pageable;
import java.util.Optional;

/**
 * Service Interface for managing Colaborador.
 */

public interface ColaboradorService {

        /**
         * Save a Colaborador.
         *
         * @param colaborador the entity to save
         * @return the persisted entity
         */
        Colaborador save(Colaborador colaborador);

    /**
         * Get all the Colaboradors.
         *
         * @param pageable the pagination information
         * @return the list of entities
         */
        Page<Colaborador> findAll(Pageable pageable);

        /**
         * Get the "id" Colaborador.
         *
         * @param id the id of the entity
         * @return the entity
         */
        Optional<Colaborador> findOne(Long id);

        /**
         * Delete the "id" Colaborador.
         *
         * @param id the id of the entity
         */
        void delete(Long id);

        /**
         * Search for the Colaborador corresponding to the query.
         *
         * @param query    the query of the search
         * @param pageable the pagination information
         * @return the list of entities
         */
        Page<Colaborador> search(String query, Pageable pageable);


    }
