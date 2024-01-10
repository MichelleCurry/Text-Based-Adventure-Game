package objectAdventure.core.command;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

/**
 * Simple exception for Unknown Commands.
 * <p>
 * This may be abusing exceptions a bit, as the player is often going to enter invalid
 * commands (rather than it being a true "exceptional case"). However, given that there is
 * no way to predict what a user might enter, an exception allows for easier handling of
 * an invalid command regardless of where in the parsing chain the problem is discovered.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class UnknownCommandException extends Exception {
    /**
     * Thrown if the player inputs an unknown command.
     *
     * @param inputLine The line entered by the player.
     */
    public UnknownCommandException(String inputLine) {
        super(inputLine);
    }
}
