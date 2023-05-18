package co.edu.uco.publiuco.service.usecase.departamento.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.service.domain.DepartamentoDomain;
import co.edu.uco.publiuco.service.usecase.departamento.ListarDepartamentos;

@Service
public class ListarDepartamentosUseCaseImpl implements ListarDepartamentos{

	@Override
	public List<DepartamentoDomain> execute(Optional<DepartamentoDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
