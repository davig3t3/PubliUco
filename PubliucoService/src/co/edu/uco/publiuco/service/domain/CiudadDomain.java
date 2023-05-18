package co.edu.uco.publiuco.service.domain;

import java.util.UUID;

public class CiudadDomain {

	private UUID codigo;
	private DepartamentoDomain departamento;
	private String nombre;
	
	public CiudadDomain(UUID codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
	
	public UUID getCodigo() {
		return codigo;
	}
	public DepartamentoDomain getDepartamento() {
		return departamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	private void setDepartamento(DepartamentoDomain departamento) {
		this.departamento = departamento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
