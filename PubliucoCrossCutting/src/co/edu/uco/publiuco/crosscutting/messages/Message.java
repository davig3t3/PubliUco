package co.edu.uco.publiuco.crosscutting.messages;

import co.edu.uco.publiuco.crosscutting.helper.ObjectHelper;
import co.edu.uco.publiuco.crosscutting.helper.StringHelper;
import co.edu.uco.publiuco.crosscutting.messages.enumeration.MessageLevel;

public final class Message {
	
	private MessageLevel level;
	private String content;
	
	public Message() {
		setLevel(MessageLevel.FATAL);
		setContent(StringHelper.EMPTY);
	}
	
	public Message(MessageLevel level, String content) {
		super();
		setLevel(level);
		setContent(content);
	}
	
	public static Message createFatalMessage(final String content) {
		return new Message(MessageLevel.FATAL,content);
	}
	
	public static Message createErrorMessage(final String content) {
		return new Message(MessageLevel.ERROR,content);
	}
	
	public static Message createWarningMessage(final String content) {
		return new Message(MessageLevel.WARNING,content);
	}
	
	public static Message createInfoMessage(final String content) {
		return new Message(MessageLevel.INFO,content);
	}
	
	public static Message createSuccesMessage(final String content) {
		return new Message(MessageLevel.SUCCESS,content);
	}

	public MessageLevel getLevel() {
		return level;
	}

	public void setLevel(MessageLevel level) {
		this.level = ObjectHelper.getDefaultIfNull(level, MessageLevel.FATAL);
	}
	
	public String getContent() {
		return content;
	}

	public final void setContent(String content) {
		this.content = StringHelper.applyTrim(content);
	}

}
