package com.example.eccos.web.rest;


import com.example.eccos.domain.Colaborador;
import com.example.eccos.service.service.ColaboradorService;
import jdk.net.SocketFlow;
import org.elasticsearch.action.support.replication.ReplicationTask;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hibernate.id.IdentifierGenerator.ENTITY_NAME;

@RestController
@RequestMapping("/api")
public final class ColaboradorResource {


    private static final String ENTITY_NAME = "colaborador";
    private ColaboradorService colaboradorService;


    @PostMapping("/colaborador")
    public ResponseEntity<Colaborador>criarColaborador(Colaborador colaborador){

        //Teste de create
      colaborador = new Colaborador("Pedro Henrique","Desenvolvedor Java","BASIS","Crio sistemas legados");

        Colaborador resultado = colaboradorService.save(colaborador);
        return ResponseEntity.ok(resultado);

    }
}
