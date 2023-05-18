package co.edu.uco.publiuco.service.usecase.ciudad.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.service.domain.CiudadDomain;
import co.edu.uco.publiuco.service.usecase.ciudad.ListarCiudades;

@Service
public class ListarCiudadesUseCaseImpl implements ListarCiudades{

	@Override
	public List<CiudadDomain> execute(Optional<CiudadDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
