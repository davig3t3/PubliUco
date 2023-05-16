package co.edu.uco.publiuco.repository.daofactory;

import java.sql.Connection;

import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.entity.DepartamentoEntity;
import co.edu.uco.publiuco.entity.PaisEntity;

	
public class SqlServerDAOFactory extends DAOFactory{
	
	private Connection connection;

	SqlServerDAOFactory() {
		openConnection();
	}

	@Override
	protected void openConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CiudadEntity getCiudadEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartamentoEntity getDepartamentoEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaisEntity getPaisEntity() {
		// TODO Auto-generated method stub
		return null;
	}

}
