package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.item.itemImpl.DiningTable_kdp;
import objectAdventure.room.Room;

/**
 * @author Krutik Dhiren Patel, COSC436
 */
public class kpatel43 extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public kpatel43(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("This is the kitchen of the game.\nIn the kitchen, there is a huge dining table located in the east corner, and on the wall near the light switch, there is a picture frame.");
        super.addItem(new DiningTable_kdp());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Krutik Dhiren Patel";
    }


}
