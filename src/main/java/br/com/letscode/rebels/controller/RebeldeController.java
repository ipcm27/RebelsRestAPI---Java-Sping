package br.com.letscode.rebels.controller;

import br.com.letscode.rebels.dto.RebeldeResponseDTO;
import br.com.letscode.rebels.service.RebeldeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rebeldes")
public class RebeldeController {

	private final RebeldeService rebeldeService;

	public RebeldeController(RebeldeService rebeldeService) {
		this.rebeldeService = rebeldeService;
	}

	@GetMapping
	public ResponseEntity<List<RebeldeResponseDTO>> getAllRebels() {
		List<RebeldeResponseDTO> responseList = rebeldeService.getAllRebels();
		return ResponseEntity.ok(responseList);
	}

    //adicionar rebelde
//    @PostMapping
//    @ApiOperation(value = "Adicionar novo rebelde")
//    public ResponseEntity<Rebelde> adicionar(@RequestBody @Valid RebeldeDTO rebeldeDto) {
//        Rebelde novoRebelde = rebeldeService.adicionarRebelde(rebeldeDto);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novoRebelde.getId()).toUri();
//        return ResponseEntity.created(uri).body(novoRebelde);
//    }

    //atualizar localizacao
//    @PutMapping("localizacao/{idRebelde}")
//    @ApiOperation(value = "Atualizar a localização de um determinado rebelde")
//    public ResponseEntity<Rebelde> atualizarLocalizacaoRebelde(@PathVariable String idRebelde,
//                                                               @RequestBody LocalizacaoDTO localizacaoDto) {
//        return ResponseEntity.ok(rebeldeService.atualizarLocalizacaoRebelde(idRebelde, localizacaoDto));
//    }

    //reportar rebelde traidor
//    @PatchMapping("/reportar-traidor")
//    @ApiOperation(value = "Reportar um determinado rebelde de traidor")
//    public ResponseEntity<Void> reportarTraidor(@RequestParam(value = "traidor") String traidor) {
//        rebeldeService.reportarTraidor(traidor);
//        return ResponseEntity.noContent().build();
//    }


    //negociar itens > Iventario
//    @PostMapping("/negociar")
//    @ApiOperation(value = "Negociar itens do inventário")
//    public ResponseEntity<Void> negociar(@RequestBody NegociacaoItemDTO negociacaoItemDTO) {
//        rebeldeService.negociacao(negociacaoItemDTO);
//        return ResponseEntity.ok().build();
//    }

}
