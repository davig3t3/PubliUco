package co.edu.uco.publiuco.service.usecase.pais.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import co.edu.uco.publiuco.service.domain.PaisDomain;
import co.edu.uco.publiuco.service.usecase.pais.ListarPaises;

@Service
public class ListarPaisesUseCaseImpl implements ListarPaises{

	@Override
	public List<PaisDomain> execute(Optional<PaisDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
