package com.example.prw3_p3.conserto;

import com.example.prw3_p3.mecanico.Mecanico;
import com.example.prw3_p3.veiculo.Veiculo;

import java.time.LocalDate;

public record DadosListagemConserto(
        LocalDate entrada,
        LocalDate saida,
        String nome,
        String marca,
        String modelo
) {
    public DadosListagemConserto(Conserto conserto) {
        this(
                conserto.getEntrada(),
                conserto.getSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo()
        );
    }
}
