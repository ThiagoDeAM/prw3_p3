package com.example.prw3_p3.veiculo;

import jakarta.validation.constraints.*;

public record DadosVeiculo(
        @NotBlank
        String marca,
        @NotBlank
        String modelo,
        String cor,
        @NotNull
        @Min(value = 1886)
        @Max(value = 9999)
        int ano) {
}
