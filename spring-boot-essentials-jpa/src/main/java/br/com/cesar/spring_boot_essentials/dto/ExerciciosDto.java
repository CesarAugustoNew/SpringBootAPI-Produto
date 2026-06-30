package br.com.cesar.spring_boot_essentials.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ExerciciosDto {
    private String nome;
    private String grupoMuscular;

}
