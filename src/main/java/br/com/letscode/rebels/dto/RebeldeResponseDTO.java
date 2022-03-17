package br.com.letscode.rebels.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class RebeldeResponseDTO {
    private String nome;
    private int idade;
    private char genero;
    private double lat;
    private double lon;
    private String nomeBase;
    private List<ItemDTO> inventario;
    private boolean isTraidor = false;
}
