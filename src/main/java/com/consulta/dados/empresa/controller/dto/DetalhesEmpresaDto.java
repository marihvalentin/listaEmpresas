package com.consulta.dados.empresa.controller.dto;

import com.consulta.dados.empresa.model.Empresa;
import org.springframework.data.domain.Page;

public class DetalhesEmpresaDto {

    private Long id;
    private String nome;
    private String email;
    private String empresa;
    private String cnpj;

    public DetalhesEmpresaDto(Empresa empresa) {
        this.id = empresa.getId();
        this.nome = empresa.getNome();
        this.email = empresa.getEmail();
        this.empresa = empresa.getEmpresa();
        this.cnpj = empresa.getCnpj();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public static Page<DetalhesEmpresaDto> converter(Page<Empresa> empresas) {
        return empresas.map(DetalhesEmpresaDto::new);
    }
}
