package com.example.prw3_p3.conserto;

import com.example.prw3_p3.mecanico.DadosMecanico;
import com.example.prw3_p3.veiculo.DadosVeiculo;

import java.time.LocalDate;

public record DadosConserto(LocalDate entrada, LocalDate saida, DadosMecanico mecanico, DadosVeiculo veiculo) {
}
