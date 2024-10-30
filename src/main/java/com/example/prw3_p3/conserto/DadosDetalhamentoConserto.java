package com.example.prw3_p3.conserto;

import java.time.LocalDate;

public record DadosDetalhamentoConserto(Long id,
                                        LocalDate entrada,
                                        LocalDate saida,
                                        String nome,
                                        String marca,
                                        String modelo
) {
    public DadosDetalhamentoConserto(Conserto conserto) {
        this(
                conserto.getId(),
                conserto.getEntrada(),
                conserto.getSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo()
        );
    }
}