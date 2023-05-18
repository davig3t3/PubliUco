package co.edu.uco.publiuco.service.mapper;

import org.modelmapper.ModelMapper;

import co.edu.uco.publiuco.dto.CiudadDTO;
import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.service.domain.CiudadDomain;

public class CiudadMapper {
	
	private final ModelMapper modelmapper = new ModelMapper();
	
	public CiudadDTO dtoMapping (CiudadDomain ciudaddomain) {
		return modelmapper.map(ciudaddomain,CiudadDTO.class);
	}
	
	public CiudadDomain domainMapping (CiudadDTO ciudaddto) {
		return modelmapper.map(ciudaddto, CiudadDomain.class);
	}
	
	public CiudadEntity entityMapping (CiudadDomain ciudaddomain) {
		return modelmapper.map(ciudaddomain, CiudadEntity.class);
	}
	

}
