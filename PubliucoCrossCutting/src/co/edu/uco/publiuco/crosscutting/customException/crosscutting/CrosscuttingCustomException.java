package co.edu.uco.publiuco.crosscutting.customException.crosscutting;

import co.edu.uco.publiuco.crosscutting.customException.PubliUcoCustomException;
import co.edu.uco.publiuco.crosscutting.customException.enumeration.LayerException;
import static co.edu.uco.publiuco.crosscutting.helper.StringHelper.EMPTY;

public class CrosscuttingCustomException extends PubliUcoCustomException{
	
	private static final long serialVersionUID = 1L;

	protected CrosscuttingCustomException(Exception rootException, String technicalMessage, String userMessage) {
		super(rootException, technicalMessage, userMessage, LayerException.CROSSCUTING);
	}
	
	public static final PubliUcoCustomException createTechnicalException(final String technicalMessage,final Exception rootException) {
		return new CrosscuttingCustomException(rootException, technicalMessage, EMPTY);
	}
	
	public static final PubliUcoCustomException createTechnicalException(final String technicalMessage) {
		return new CrosscuttingCustomException(new Exception(), technicalMessage, EMPTY);
	}
	
	public static final PubliUcoCustomException createUserException(final String userMessage, final Exception rootException) {
		return new CrosscuttingCustomException(rootException, userMessage, userMessage);
	}
	
	public static final PubliUcoCustomException create(final String userMessage, final String technicalMessage,
			final Exception rootException) {
		return new CrosscuttingCustomException(rootException, technicalMessage, userMessage);
	}
	
	public static CrosscuttingCustomException create(String userMessage, String technicalMessage) {
		return new CrosscuttingCustomException(new Exception(), userMessage, technicalMessage);
	}

}
