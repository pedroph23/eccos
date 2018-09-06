package com.example.eccos.service.impl;


import com.example.eccos.domain.Colaborador;
import com.example.eccos.repository.ColaboradorRepository;
import com.example.eccos.service.service.ColaboradorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.Optional;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    private final Logger log = LoggerFactory.getLogger(ColaboradorServiceImpl.class);

    private  Colaborador colaborador;

    ///private final ColaboradorSearchRepository ColaboradorSearchRepository;

    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorServiceImpl(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }



    /**
     * Save a Colaborador.
     *
     * @param colaborador the entity to save
     * @return the persisted entity
     */
    @Override
    public Colaborador save(Colaborador colaborador) {
        log.debug("Request to save Colaborador : {}", colaborador);
        Colaborador result = colaboradorRepository.save(colaborador);
       // ColaboradorSearchRepository.save(result);
        return result;
    }

    /**
     * Get all the Colaboradors.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<Colaborador> findAll(Pageable pageable) {
        log.debug("Request to get all Colaboradors");
        return colaboradorRepository.findAll(pageable);
    }

    /**
     * Get one Colaborador by id.
     *
     * @param id the id of the entity
     * @return the entity
     */

    //Estava public Colaborador findOne..
    @Override
    @Transactional(readOnly = true)
    public Optional<Colaborador> findOne(Long id) {
        log.debug("Request to get Colaborador : {}", id);
        return colaboradorRepository.findById(id);
    }

    /**
     * Delete the Colaborador by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Colaborador : {}", id);
        colaboradorRepository.deleteById(id);
       // ColaboradorSearchRepository.delete(id);
    }

    @Override
    public Page<Colaborador> search(String query, Pageable pageable) {
        return null;
    }

    /**
     * Search for the Colaborador corresponding to the query.
     *
     * @param query the query of the search
     * @param pageable the pagination information
     * @return the list of entities
     */
//    @Override
//    @Transactional(readOnly = true)
//    public Page<Colaborador> search(String query, Pageable pageable) {
//        log.debug("Request to search for a page of Colaboradors for query {}", query);
//       return colaboradorRepository.findOne(queryStringQuery(query),pageable);
//
//    }
}
