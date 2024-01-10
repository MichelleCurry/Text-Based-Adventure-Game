package objectAdventure.room;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

import static java.text.MessageFormat.format;

/**
 * A general exception for a room not existing.  This should not be thrown in normal operations.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class NoSuchRoomException extends RuntimeException {

    /*
     * TODO: Find and "earlier bailout" solution.
     * Fix multiple successive throws in the CommandProcessor and GameController. While this is
     * not necessarily a problem, it is not ideal. In most cases, if the execution is caught,
     * execution will continue, but the exception will just be thrown (and handled) again.
     */


    /**
     * @param roomId the ID of the offending room.
     */
    public NoSuchRoomException(Integer roomId) {
        super(format("The Room id={0} does not exist.", roomId));
        //System.out.println("Building exception on rooom: " + roomId);
    }

}
