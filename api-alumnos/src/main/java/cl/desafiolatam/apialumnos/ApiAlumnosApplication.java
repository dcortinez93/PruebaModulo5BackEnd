package cl.desafiolatam.apialumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cl.desafiolatam.apialumnos.dao.AlumnoRepository;
import cl.desafiolatam.apialumnos.dao.MateriaRepository;

@SpringBootApplication
public class ApiAlumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAlumnosApplication.class, args);
		/*
		 * AnnotationConfigApplicationContext acac = new
		 * AnnotationConfigApplicationContext(AppConfig.class); AlumnoRepository
		 * alumnoDao = acac.getBean(AlumnoRepository.class); MateriaRepository
		 * materiaDao = acac.getBean(MateriaRepository.class);
		 * System.out.println(alumnoDao.findAll());
		 * System.out.println(alumnoDao.findAll().get(0).getMateriaList());
		 * System.out.println(materiaDao.findAll());
		 */
		
	}

}
