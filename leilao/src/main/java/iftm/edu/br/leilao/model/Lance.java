package iftm.edu.br.leilao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Lance {
    
    @Id @GeneratedValue
    private Long id;
    private Double valor;
    private boolean leilaoAberto;

}
