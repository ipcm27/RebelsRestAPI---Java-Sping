package br.com.letscode.rebels.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RebeldeEntity {

    String nome;
    int idade;
    char genero;
    double lat;
    double lon;
    String nomeBase;
    @Builder.Default boolean isTraidor = false;

}
