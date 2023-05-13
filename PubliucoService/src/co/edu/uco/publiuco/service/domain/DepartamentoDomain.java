package co.edu.uco.publiuco.service.domain;

import java.util.UUID;

public class DepartamentoDomain {
	
	private UUID codigo;
	private PaisDomain pais;
	private String nombre;
	public UUID getCodigo() {
		return codigo;
	}
	public PaisDomain getPais() {
		return pais;
	}
	public String getNombre() {
		return nombre;
	}
	private void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	private void setPais(PaisDomain pais) {
		this.pais = pais;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
