package com.example.prw3_p3.conserto;

import com.example.prw3_p3.mecanico.DadosMecanico;
import com.example.prw3_p3.veiculo.DadosVeiculo;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosConserto(

        @NotNull
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        LocalDate entrada,

        @NotNull
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
        LocalDate saida,

        @NotNull
        @Valid
        DadosMecanico mecanico,

        @NotNull
        @Valid
        DadosVeiculo veiculo) {
}
