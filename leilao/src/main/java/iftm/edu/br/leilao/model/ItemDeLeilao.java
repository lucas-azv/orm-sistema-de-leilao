package iftm.edu.br.leilao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class ItemDeLeilao {
    
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private Double valorMinimo;
    private boolean leilaoAberto;
}
