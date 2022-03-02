package com.consulta.dados.empresa.controller;

import com.consulta.dados.empresa.controller.dto.DetalhesEmpresaDto;
import com.consulta.dados.empresa.model.Empresa;
import com.consulta.dados.empresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/listaEmpresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/showAll")
    public List<Empresa> listarEmpresas() {

        return empresaRepository.findAll();
    }

    @GetMapping("/showById/{id}")
    public ResponseEntity<DetalhesEmpresaDto> detalhesEmpresa(@PathVariable Long id) {
        Optional<Empresa> empresa = empresaRepository.findById(id);
        if(empresa.isPresent()) {
            return ResponseEntity.ok(new DetalhesEmpresaDto(empresa.get()));

        }
        return ResponseEntity.notFound().build();
    }
}
