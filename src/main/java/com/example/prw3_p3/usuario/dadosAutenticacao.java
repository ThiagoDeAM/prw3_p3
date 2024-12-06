package com.example.prw3_p3.usuario;

import jakarta.validation.constraints.NotBlank;

public record dadosAutenticacao(
        @NotBlank
        String login,
        @NotBlank
        String senha
) {
}
