package cl.desafiolatam.apialumnos.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.desafiolatam.apialumnos.modelo.Materia;
import cl.desafiolatam.apialumnos.servicios.IMateriaService;


@RestController
@RequestMapping("/api/v1/materias")
public class MateriaController {

	@Autowired
	IMateriaService materiaServicio;
	
	@PostMapping
	public void save(@RequestBody Materia materia) {
		materiaServicio.save(materia);
	}
}
 