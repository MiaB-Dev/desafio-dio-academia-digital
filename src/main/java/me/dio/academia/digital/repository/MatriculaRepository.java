package me.dio.academia.digital.repository;

import java.util.List;



import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

    List<Matricula> findByAlunoBairro(String bairro);

    // Matricula save(Matricula matricula);

    // List<Matricula> findAll();

    // List<Matricula> findAlunosMatriculadosBairro(String bairro);

    // //Optional<Aluno> findByIdAluno(Long id);

    // Optional<Matricula> findByIdMatricula(Long id);

    
}
