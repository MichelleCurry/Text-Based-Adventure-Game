package objectAdventure.item;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

/**
 * A record class for returning the result of an interaction.
 * TODO: Relocate this class to a more appropriate package. (It's not "Item" specific.)
 *
 * @param bSuccess Whether the interaction was successful.
 * @param message A message to display to the user.
 * @author Adam J. Conover, COSC436/COSC716
 */
public record InteractionResult(boolean bSuccess, String message) {
    // Success with a message.
    public static InteractionResult success(String message) {
        return new InteractionResult(true, message);
    }

    // Success with no message.
    public static InteractionResult success() {
        return new InteractionResult(true, "");
    }

    // Failure with a message.
    public static InteractionResult failure(String message) {
        return new InteractionResult(false, message);
    }
}
