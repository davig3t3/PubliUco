package co.edu.uco.publiuco.repository.daofactory;

import co.edu.uco.publiuco.crosscutting.customException.PubliUcoCustomException;
import co.edu.uco.publiuco.crosscutting.customException.data.RepositoryCustomException;
import co.edu.uco.publiuco.crosscutting.messages.Messages;
import co.edu.uco.publiuco.entity.CiudadEntity;
import co.edu.uco.publiuco.entity.DepartamentoEntity;
import co.edu.uco.publiuco.entity.PaisEntity;
import co.edu.uco.publiuco.repository.enumeration.DAOFactoryType;

public abstract class DAOFactory {

	public static final DAOFactory getDAOFactory(final DAOFactoryType factory) {

		DAOFactory daoFactory;

		switch (factory) {
		case SQL_SERVER:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (PubliUcoCustomException excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.SqlConnectionHelper.TECHNICAL_CONNECTION_IS_NULL, excetion);
			}
			break;
		case CASSANDRA:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (PubliUcoCustomException excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_CASSANDRA_NOT_IMPLEMENTED, excetion);
			}
			break;
		case MARIADB:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_MARIADB_NOT_IMPLEMENTED, excetion);
			}
			break;
		case MONGODB:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_MONGDB_NOT_IMPLEMENTED, excetion);
			}
			break;
		case MYSQL:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_MYSQL_NOT_IMPLEMENTED, excetion);
			}
			break;
		case ORACLE:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_ORACLE_NOT_IMPLEMENTED, excetion);
			}
			break;
		case POSTGRESQL:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_POSTGRESQL_NOT_IMPLEMENTED, excetion);
			}
			break;
		default:
			try {
				daoFactory = new SqlServerDAOFactory();
			} catch (Exception excetion) {
				throw RepositoryCustomException
						.createTechnicalException(Messages.DAOFactory.TECHNICAL_UNEXPECTED_DAOFACTORY, excetion);
			}
			break;
		}
		return daoFactory;
	}

	protected abstract void openConnection();

	public abstract void initTransaction();

	public abstract void confirmTransaction();

	public abstract void cancelTransaction();

	public abstract void closeConnection();

	public abstract CiudadEntity getCiudadEntity();

	public abstract DepartamentoEntity getDepartamentoEntity();

	public abstract PaisEntity getPaisEntity();
}
