package co.edu.uco.publiuco.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.publiuco.dto.CiudadDTO;
import co.edu.uco.publiuco.service.domain.CiudadDomain;

@Mapper
public interface CiudadMapperr {

	CiudadMapper INSTANCE = Mappers.getMapper(CiudadMapper.class);
	
	CiudadDomain toDomain(CiudadDTO dto);
	
}
