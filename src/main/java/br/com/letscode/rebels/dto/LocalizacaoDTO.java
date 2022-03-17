package br.com.letscode.rebels.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "LOCALIZACAO")
public class LocalizacaoDTO {

    @Id
    @SequenceGenerator(name = "localizacaoSequenceGenerator", sequenceName = "LOCALIZACAO_SQ", initialValue = 100)
    @GeneratedValue(generator = "localizacaoSequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", insertable = true, updatable = false, nullable = true)
    private Long id;

    @NotNull(message = "Toda localizacao deve possuir uma latidade")
    @Column(name = "LATITUDE", nullable = false)
    private double latitute;

    @NotNull(message = "Toda localizacao deve possuir uma longitude")
    @Column(name = "LONGITUDE", nullable = false)
    private double longitude;

    @NotEmpty(message = "O nome do local não pode estar vazio")
    @Size(min = 1, max = 200, message = "O tamanho máximo do nome é de 200 caracteres")
    @Column(name = "NOME", nullable = false, length = 200)
    private String nome;

    @NotEmpty(message = "O nome do galaxia não pode estar vazio")
    @Size(min = 1, max = 200, message = "O tamanho máximo do nome é de 200 caracteres")
    @Column(name = "GALAXIA", nullable = false, length = 200)
    private String galaxia;

    @NotEmpty(message = "O nome da base não pode estar vazio")
    @Size(min = 1, max = 200, message = "O tamanho máximo do nome é de 200 caracteres")
    @Column(name = "BASE", nullable = false, length = 200)
    private String base;

}