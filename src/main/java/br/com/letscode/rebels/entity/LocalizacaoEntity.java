package br.com.letscode.rebels.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data

public class LocalizacaoEntity {
	
	@Id
	private String id;
	private String latitude;
    private String longitude;
}
