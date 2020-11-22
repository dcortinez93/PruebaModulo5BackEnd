package cl.desafiolatam.apialumnos.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.desafiolatam.apialumnos.dao.MateriaRepository;
import cl.desafiolatam.apialumnos.modelo.Materia;


@Service
public class MateriaService implements IMateriaService{

	@Autowired
	MateriaRepository materiaDao;
	
	@Override
	public void save(Materia materia) {
		// TODO Auto-generated method stub
		materiaDao.save(materia);
	}
}
