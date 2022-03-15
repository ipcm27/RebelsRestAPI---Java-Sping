package StarWarsRestAPIJavaSpring.letscode.controller;


public class RebeldeController {

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
