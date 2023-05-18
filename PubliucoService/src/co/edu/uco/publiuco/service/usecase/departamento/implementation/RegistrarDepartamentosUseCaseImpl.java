package co.edu.uco.publiuco.service.usecase.departamento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.entity.DepartamentoEntity;
import co.edu.uco.publiuco.repository.DepartamentoRepository;
import co.edu.uco.publiuco.service.domain.DepartamentoDomain;
import co.edu.uco.publiuco.service.usecase.departamento.RegistrarDepartamento;

@Service
public class RegistrarDepartamentosUseCaseImpl implements RegistrarDepartamento{

	@Autowired
	private DepartamentoRepository repository;
	
	@Override
	public void execute(DepartamentoDomain domain) {
		// Crear las reglas de negocio
		// Specification Pattern o un Validator Pattern
		
		// Aqui se debe crear el ensamblador 
		DepartamentoEntity entity = null;
		repository.save(entity);
	}

}
