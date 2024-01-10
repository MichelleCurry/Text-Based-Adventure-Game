package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.toy_adc;
import objectAdventure.room.Room;

/**
 * 
 * @author Austin Cubbage, COSC436
 */
public class acubba1Room extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public acubba1Room(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("You are in a room with a black and white cat. He is staring at you expectantly." + 
        " There is one doorway in the West direction. On the floor is a multi-colored cat toy in the shape of a fish.");
        super.addItem(new toy_adc());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Austin Cubbage";
    }
    
}
