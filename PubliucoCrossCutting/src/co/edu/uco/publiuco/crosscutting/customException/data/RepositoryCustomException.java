package co.edu.uco.publiuco.crosscutting.customException.data;

import co.edu.uco.publiuco.crosscutting.customException.PubliUcoCustomException;
import co.edu.uco.publiuco.crosscutting.customException.enumeration.LayerException;
import static co.edu.uco.publiuco.crosscutting.helper.StringHelper.EMPTY;

public class RepositoryCustomException extends PubliUcoCustomException{
	
	private RepositoryCustomException(Exception rootException, String technicalMessage, String userMessage) {
		super(rootException, technicalMessage, userMessage, LayerException.REPOSITORY);
	}

	private static final long serialVersionUID = -7581138972968503560L;

	public static final PubliUcoCustomException create(final String userMessage, final String technicalMessage) {
		return new RepositoryCustomException(new Exception(), technicalMessage, userMessage);
	}

	public static final PubliUcoCustomException create(final String userMessage, final String technicalMessage,
			final Exception rootException) {
		return new RepositoryCustomException(rootException, technicalMessage, userMessage);
	}

	public static final PubliUcoCustomException createTechnicalException(final String technicalMessage) {
		return new RepositoryCustomException(new Exception(), technicalMessage,EMPTY);
	}
	
	public static final PubliUcoCustomException createTechnicalException(final String technicalMessage, final Exception rootException) {
		return new RepositoryCustomException(rootException, technicalMessage,EMPTY);
	}
	
	public static final PubliUcoCustomException createUserException(final String userMessage, final Exception rootException) {
		return new RepositoryCustomException(rootException, userMessage, userMessage);
	}

}
