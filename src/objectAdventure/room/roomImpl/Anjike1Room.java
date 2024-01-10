package objectAdventure.room.roomImpl;

import objectAdventure.item.Item;
import objectAdventure.item.itemImpl.Book;
import objectAdventure.room.Room;

public class Anjike1Room extends Room {

    /**
     * Constructor for the abstract room.
     *
     * @param roomId The ID of the room.
     */
    public Anjike1Room(int roomId) {
        super(roomId);
        Book _bookl = new Book();
        super.addItem(_bookl);
        super.setRoomDescription("This a room with 5 walls, a ceiling as small as a box and a floor as sharp as a knive. If you have been here before congrats to you boss");
    }

}
