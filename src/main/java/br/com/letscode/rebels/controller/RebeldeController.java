package br.com.letscode.rebels.controller;

import br.com.letscode.rebels.dto.RebeldeResponseDTO;
import br.com.letscode.rebels.service.RebeldeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/rebeldes")
@RequiredArgsConstructor
public class RebeldeController {

	@Autowired
	private final RebeldeService rebeldeService;

	@GetMapping
	public ResponseEntity<List<RebeldeResponseDTO>> getAllRebels() {
		List<RebeldeResponseDTO> responseList = rebeldeService.getAllRebels();
		return ResponseEntity.ok(responseList);
	}

    @PostMapping
    public ResponseEntity<RebeldeResponseDTO> adicionarRebelde(@RequestBody RebeldeResponseDTO rebeldeDto) {
        RebeldeResponseDTO novoRebelde = rebeldeService.adicionarRebelde(rebeldeDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(novoRebelde);
    }

    @PatchMapping("/reportar-traidor")
    @ApiOperation(value = "Reportar um determinado rebelde de traidor")
    public ResponseEntity<Void> reportarTraidor(@RequestParam(value = "traidor") String traidor) {
        rebeldeService.reportarTraidor(traidor);
        return ResponseEntity.noContent().build();
    }


}
