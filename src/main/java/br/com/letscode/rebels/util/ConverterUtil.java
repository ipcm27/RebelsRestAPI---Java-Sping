package br.com.letscode.rebels.util;

import br.com.letscode.rebels.dto.LocalizacaoDTO;
import br.com.letscode.rebels.dto.RebeldeResponseDTO;

import br.com.letscode.rebels.dto.*;
import br.com.letscode.rebels.entity.*;
import lombok.Builder;


import br.com.letscode.rebels.entity.Localizacao;



public class ConverterUtil {

    public static RebeldeResponseDTO toDTO(RebeldeEntity entity) {
        RebeldeResponseDTO dto = RebeldeResponseDTO.builder()
                .nome(entity.getNome())
                .idade(entity.getIdade())
                .genero(entity.getGenero())
                .lat(entity.getLat())
                .lon(entity.getLon())
                .nomeBase(entity.getNomeBase())
                .build();
        return dto;
    }

    public static RebeldeEntity toEntity(RebeldeResponseDTO dto) {
        RebeldeEntity entity = RebeldeEntity.builder()
                .nome(dto.getNome())
                .idade(dto.getIdade())
                .genero(dto.getGenero())
                .lat(dto.getLat())
                .lon(dto.getLon())
                .nomeBase(dto.getNomeBase())
                .build();
        return entity;
    }
    
    public static LocalizacaoDTO toDTO(Localizacao entity) {
        LocalizacaoDTO dto = LocalizacaoDTO.builder()
                .latitude(entity.getLatitude())
                .longitude(entity.getLongitude())
                .nome(entity.getNome())
                .build();
        return dto;
    }

    public static Localizacao toDTO(LocalizacaoDTO dto) {
        Localizacao entity = Localizacao.builder()
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .nome(dto.getNome())
                .build();
        return entity;
    }
}
