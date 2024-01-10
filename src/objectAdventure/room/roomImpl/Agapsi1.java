package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.item.itemImpl.Dog_AG;
import objectAdventure.room.Room;

/**
 * @author Alysse Gapsis, COSC436
 */
public class Agapsi1 extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public Agapsi1(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("This is Room 9.");
        super.addItem(new DemoItem());
        super.addItem(new Dog_AG());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Alysse Gapsis";
    }


}