package br.com.letscode.rebels.entity;

import br.com.letscode.rebels.dto.InventarioDTO;
import br.com.letscode.rebels.enums.Genero;
import br.com.letscode.rebels.dto.LocalizacaoDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
public class RebeldeEntity {

    private String nome;
    private Long id;
    private Integer idade;
    private Genero genero;
    @Setter
    private Integer acusacoes = 0;
    @Setter
    private InventarioDTO inventario;
    @Setter
    private LocalizacaoDTO localizacao;
    @Setter
    private LocalizacaoDTO localizacaoAtualizada;

    public boolean traidor(){
        if(acusacoes == 3){
            return true;
        } return false;
    }



}