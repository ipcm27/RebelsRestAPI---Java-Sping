package br.com.letscode.rebels.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class InventarioController<NegociacaoItemDTO> {
        @PostMapping("/negociar")
    public ResponseEntity<Void> negociar(@RequestBody NegociacaoItemDTO negociacaoItemDTO) {
        rebeldeService.negociacao(negociacaoItemDTO);
        return ResponseEntity.ok().build();
    }

}
