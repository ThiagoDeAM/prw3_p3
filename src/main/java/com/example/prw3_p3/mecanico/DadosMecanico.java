package com.example.prw3_p3.mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosMecanico(
        @NotBlank
        String nome,
        Integer experiencia) {
}
