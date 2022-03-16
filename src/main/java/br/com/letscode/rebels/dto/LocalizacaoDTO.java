package br.com.letscode.rebels.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LocalizacaoDTO {
    private Double latitude;
    private Double longitude;
    private String nome;
}
