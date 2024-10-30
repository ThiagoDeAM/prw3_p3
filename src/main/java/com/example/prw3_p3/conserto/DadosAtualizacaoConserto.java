package com.example.prw3_p3.conserto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosAtualizacaoConserto(
        @NotNull
        Long id,
        LocalDate saida,
        String nome,
        Integer experiencia

) {
}
