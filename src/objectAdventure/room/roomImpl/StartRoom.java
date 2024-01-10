package objectAdventure.room.roomImpl;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.room.Room;

/**
 * The StartRoom is the first room the player will see when they start the game.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class StartRoom extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public StartRoom(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("This is room 15.");
        super.addItem(new DemoItem());
    }

    /**
     * Factory methods are used to create new objects using static methods, and this is sometimes a better approach than
     * using a constructor directly. It allows the constructor to complete the essential initialization of the object,
     * and then the factory method can perform additional initialization on a fully instantiated object.
     *
     * @param roomId The ID of the room.
     * @return A new room.
     */
    public static Room createRoom(final int roomId) {
        Room theRoom = new StartRoom(roomId);

        // Additional initialization can be performed here that could potentially be overridden by subclasses or if
        // 'this' needs to be passed to another method.

        return theRoom;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Melvin Noguera Monroy";
    }



}