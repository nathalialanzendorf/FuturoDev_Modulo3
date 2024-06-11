package br.sc.senai.pokedex.dto;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonV1Dto {

    private UUID id;
    private int numero;
    private String nome;
    private String descricao;
    private String imagem;
    private String tipo;
    private String categoria;
    private String area;
    private Double altura;
    private Double peso;
    private Boolean capturado;
}