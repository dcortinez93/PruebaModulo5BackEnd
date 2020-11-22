package cl.desafiolatam.apialumnos.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Alumno {
	
	@Id
	private Long id;
	private String rut;
	private String nombre;
	private String direccion;
	

	@JsonManagedReference
	@OneToMany(mappedBy = "alumno", fetch = FetchType.EAGER) 
	private Set<Materia> materiaList;
	
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public Set<Materia> getMateriaList() { return materiaList; }
	  
	public void setMateriaList(Set<Materia> materiaList) { 
		this.materiaList = materiaList; 
		}
	 
	

}