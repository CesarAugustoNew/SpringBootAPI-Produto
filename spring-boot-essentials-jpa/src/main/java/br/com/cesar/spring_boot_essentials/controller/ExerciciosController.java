package br.com.cesar.spring_boot_essentials.controller;

import br.com.cesar.spring_boot_essentials.database.model.ExerciciosEntity;
import br.com.cesar.spring_boot_essentials.dto.ExerciciosDto;
import br.com.cesar.spring_boot_essentials.service.ExerciciosServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exercicios")
@RequiredArgsConstructor
public class ExerciciosController {

    private final ExerciciosServices exerciciosServices;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExerciciosEntity> findAll(){
        return exerciciosServices.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercicios(@RequestBody ExerciciosDto exerciciosDto){
        exerciciosServices.save(exerciciosDto);
    }

}
