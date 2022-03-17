package br.com.letscode.rebels.entity;

import br.com.letscode.rebels.dto.RebeldeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.com.letscode.rebels.dto.LocalizacaoDTO;

public class LocalizacaoEntity {

    @PutMapping("localizacao/{idRebelde}")
    public ResponseEntity<RebeldeEntity> atualizarLocalizacaoRebelde
            (@PathVariable String idRebelde, @RequestBody
                    LocalizacaoDTO localizacaoDto) {
        return atualizarLocalizacaoRebelde(idRebelde, localizacaoDto);
    }
}
