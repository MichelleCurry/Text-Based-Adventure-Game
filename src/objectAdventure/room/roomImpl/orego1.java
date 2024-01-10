package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.room.Room;

public class orego1 extends Room {

     /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public orego1(final int roomId) {
        // The room ID must be set.
       // ???!!!! roomId = 7;
        super(roomId);

        super.setRoomDescription("This is the library");
        super.addItem(new DemoItem());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Olivia Rego";
    }

    
}
