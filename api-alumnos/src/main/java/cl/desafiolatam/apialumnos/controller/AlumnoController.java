package cl.desafiolatam.apialumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.apialumnos.modelo.Alumno;
import cl.desafiolatam.apialumnos.servicios.IAlumnoService;


@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {
	@Autowired
	IAlumnoService alumnoServicio;
	
	@PostMapping
	public void save(@RequestBody Alumno alumno) {
		alumnoServicio.save(alumno);
	}
	
	@GetMapping("/{rut}")
	public Alumno findByRut(@PathVariable String rut) {
		return alumnoServicio.findByRut(rut);
	}
	
	@GetMapping
	public List<Alumno> findAll(){
		return alumnoServicio.findAll();
	}
}
