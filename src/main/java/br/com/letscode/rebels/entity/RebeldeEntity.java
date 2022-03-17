package br.com.letscode.rebels.entity;

import br.com.letscode.rebels.dto.LocalizacaoDTO;
import br.com.letscode.rebels.dto.RebeldeResponseDTO;
import br.com.letscode.rebels.dto.RebeldeResponseDTO.RebeldeResponseDTOBuilder;
import br.com.letscode.rebels.enums.Genero;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RebeldeEntity {
  
	private String nome;
    private int idade;
    private char genero;
    private double lat;
    private double lon;
    private String nomeBase;
    private List<ItemEntity> inventario;
    private boolean isTraidor = false;
	
}



