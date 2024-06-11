package br.sc.senai.pokedex.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pokemon")
public class Pokemon {   

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @NotNull
    private int numero;
    
    @NotEmpty()
    @NotNull
    @Size(min = 5, max = 255)
    private String nome;

    @Size(min = 5, max = 255)
    private String descricao;

    @Size(min = 5, max = 255)
    private String imagem;

    @Size(min = 2, max = 255)
    private String tipo;

    @Size(min = 2, max = 255)
    private String categoria;

    @Size(min = 5, max = 255)
    private String area;

    @Positive()
    private Double altura;

    @Positive()
    private Double peso;

    @NotNull
    private Boolean capturado;

}