package br.com.letscode.rebels.service;

import br.com.letscode.rebels.dto.RebeldeResponseDTO;
import br.com.letscode.rebels.repository.RebeldeRepository;
import br.com.letscode.rebels.util.ConverterUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RebeldeService {

	//private final RebeldeRepository repository;

	public List<RebeldeResponseDTO> getAllRebels() {

		List<RebeldeResponseDTO> allRebels = RebeldeRepository.getAll()
				.stream()
				.map(entity -> ConverterUtil.toDTO(entity))
				.collect(Collectors.toList());

		return allRebels;
	}

}
