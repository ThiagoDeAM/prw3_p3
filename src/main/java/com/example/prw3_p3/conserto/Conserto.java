package com.example.prw3_p3.conserto;

import com.example.prw3_p3.mecanico.DadosMecanico;
import com.example.prw3_p3.mecanico.Mecanico;
import com.example.prw3_p3.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Conserto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate entrada;
    private LocalDate saida;

    @Embedded
    private Mecanico mecanico;

    @Embedded
    private Veiculo veiculo;
    private Boolean ativo;

    public Conserto(DadosConserto dados) {
        this.ativo = true;
        this.entrada = dados.entrada();
        this.saida = dados.saida();
        this.mecanico = new Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados){
        if(dados.saida() != null)
            this.saida = dados.saida();
        if(dados.nome() != null || dados.experiencia() != null){
            DadosMecanico dadosMecanico = new DadosMecanico(dados.nome(), dados.experiencia());
            this.mecanico.atualizarInformacoes(dadosMecanico);
        }
    }
    public void excluir(){
        this.ativo = false;
    }
}
