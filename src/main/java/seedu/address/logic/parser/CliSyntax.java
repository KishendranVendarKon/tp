package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("-n");
    public static final Prefix PREFIX_PHONE = new Prefix("-p");
    public static final Prefix PREFIX_EMAIL = new Prefix("-e");
    public static final Prefix PREFIX_ADDRESS = new Prefix("-a");
    public static final Prefix PREFIX_TAG = new Prefix("-t");

    public static final Prefix LONG_PREFIX_NAME = new Prefix("--name");
    public static final Prefix LONG_PREFIX_PHONE = new Prefix("--phone");
    public static final Prefix LONG_PREFIX_EMAIL = new Prefix("--email");
    public static final Prefix LONG_PREFIX_ADDRESS = new Prefix("--address");
    public static final Prefix LONG_PREFIX_TAG = new Prefix("--tag");

}
