package cl.desafiolatam.apialumnos.servicios;
import java.util.List;
import cl.desafiolatam.apialumnos.modelo.Alumno;


public interface IAlumnoService {
	
	public void save(Alumno alumno);
	public Alumno findByRut(String rut);
	public List<Alumno> findAll();

}
