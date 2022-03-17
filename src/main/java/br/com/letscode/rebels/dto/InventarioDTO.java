package br.com.letscode.rebels.dto;

import br.com.letscode.rebels.entity.ItemEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class InventarioDTO {
    @Getter
    @Setter
    private List<ItemEntity> itens ;

    public InventarioDTO(List<ItemEntity> itens) {
        this.itens = itens;
        ItemEntity arma = new ItemEntity("Arma", 4, 1 );
        ItemEntity municao = new ItemEntity("Munição", 3, 1);
        ItemEntity comida = new ItemEntity("Comida", 1, 1);
        ItemEntity agua = new ItemEntity("Água", 2, 1);

        itens.add(arma);
        itens.add(municao);
        itens.add(comida);
        itens.add(agua);
    }
}
