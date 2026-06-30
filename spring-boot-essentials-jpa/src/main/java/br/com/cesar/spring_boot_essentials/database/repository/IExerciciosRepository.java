package br.com.cesar.spring_boot_essentials.database.repository;

import br.com.cesar.spring_boot_essentials.database.model.ExerciciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExerciciosRepository extends JpaRepository<ExerciciosEntity, Integer> {
}
