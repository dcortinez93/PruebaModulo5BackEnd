package cl.desafiolatam.apialumnos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.apialumnos.dao.AlumnoRepository;
import cl.desafiolatam.apialumnos.modelo.Alumno;


@Service
public class AlumnoService implements IAlumnoService{
	
	@Autowired
	AlumnoRepository alumnoDao;

	@Override
	public void save(Alumno alumno) {
		// TODO Auto-generated method stub 
		alumnoDao.save(alumno);
	}

	@Override
	public Alumno findByRut(String rut) {
		// TODO Auto-generated method stub
		return alumnoDao.findByRut(rut);
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		return alumnoDao.findAll();
	}

}
