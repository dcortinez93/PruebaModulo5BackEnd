package cl.desafiolatam.apialumnos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.desafiolatam.apialumnos.modelo.Materia;


public interface MateriaRepository extends JpaRepository<Materia, Long>{

}
