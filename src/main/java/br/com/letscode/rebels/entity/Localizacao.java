package br.com.letscode.rebels.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Localizacao {
    private Double latitude;
    private Double longitude;
    private String nome;
}
