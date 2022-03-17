package br.com.letscode.rebels.dto;

import br.com.letscode.rebels.entity.ItemEntity;
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
    private List<ItemEntity> inventario; // TODO: Usar DTO em vez de entity
    private boolean isTraidor = false;
}
