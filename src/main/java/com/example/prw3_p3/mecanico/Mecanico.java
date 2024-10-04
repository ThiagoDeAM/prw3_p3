package com.example.prw3_p3.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome;
    private int experiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome = dados.nome();
        this.experiencia = dados.experiencia();
    }

}
