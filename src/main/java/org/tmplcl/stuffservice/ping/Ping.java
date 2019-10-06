package org.tmplcl.stuffservice.ping;

import java.time.LocalDateTime;

public class Ping {

	public final LocalDateTime timestamp = LocalDateTime.now();
    public final String message = "Ping successful";

}
