package cl.desafiolatam.apialumnos.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Materia {

	@Id
	private Long id;
	private String nombre;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private Alumno alumno;
	 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Alumno getAlumno() { 
		return alumno; 
	}
	  
	public void setAlumno(Alumno alumno) { 
		this.alumno = alumno; 
	}
	 
	
	
	
}

