package cl.desafiolatam.apialumnos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.desafiolatam.apialumnos.modelo.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

	public Alumno findByRut(String rut);
	
//	@Query("FROM alumno WHERE nombre = ?1 and rut = ?2")
//	public List<Alumno> findByCualquierCosa(String nombre, String rut);
}
 