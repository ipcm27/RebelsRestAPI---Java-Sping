package br.com.letscode.rebels.service;

import br.com.letscode.rebels.dto.ItemDTO;
import br.com.letscode.rebels.entity.ItemEntity;

public class ItemService {
    //TODO retornar uma lista de itens
    public ItemEntity cadastrar (ItemEntity item) {
        ItemDTO.itensInventario.add(item);
        return item;
    }

    public ItemEntity negociarItens (ItemEntity item) {
        ItemDTO.itensInventario.add(item);
        return item;
    }
}
