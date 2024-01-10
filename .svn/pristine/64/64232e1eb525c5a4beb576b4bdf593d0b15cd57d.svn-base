package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.item.itemImpl.DemoItem_ajc;
import objectAdventure.room.Room;


public class Aconover extends Room {
    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public Aconover(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("This is the main room of the game.");
        super.addItem(new DemoItem());
        super.addItem(new DemoItem_ajc());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Adam J. Conover";
    }

}
