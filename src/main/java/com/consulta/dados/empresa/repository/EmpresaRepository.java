package com.consulta.dados.empresa.repository;

import com.consulta.dados.empresa.model.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Page<Empresa> findById (Long id, Pageable paginacao);
}
