package top.uaian.event;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

	private static final long serialVersionUID = 5366526231219883438L;
	private String message;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public MyApplicationEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
