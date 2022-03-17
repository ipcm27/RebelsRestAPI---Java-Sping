package br.com.letscode.rebels.service;

import br.com.letscode.rebels.dto.RebeldeResponseDTO;
import br.com.letscode.rebels.entity.RebeldeEntity;

import java.util.ArrayList;
import java.util.List;

import br.com.letscode.rebels.dto.*;

public class RebeldeService {

	public RebeldeService() {
		// TODO Auto-generated constructor stub
	}

	public List<RebeldeResponseDTO> getAllRebels() {

		List<RebeldeResponseDTO> allRebels = new ArrayList<RebeldeResponseDTO>();

		allRebels.add(RebeldeResponseDTO.builder()
				.nome("Rebelde1")
				.idade(42)
				.genero('M')
				.lat(21.334)
				.lon(63.846)
				.nomeBase("Echo")
				.build()
		);

		allRebels.add(RebeldeResponseDTO.builder()
				.nome("Rebelde2")
				.idade(38)
				.genero('F')
				.lat(24.473)
				.lon(54.972)
				.nomeBase("Echo 3-T-8")
				.build()
		);

		return allRebels;
	}
	
	 public RebeldeEntity adicionarRebelde(final RebeldeDTO rebeldeDto) {
		 RebeldeEntity rebelde = convert(rebeldeDto, Rebelde.class);
	 }

}
