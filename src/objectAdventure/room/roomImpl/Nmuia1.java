package objectAdventure.room.roomImpl;

import objectAdventure.room.Room;


public class Nmuia1 extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public Nmuia1(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("Desk contains lamp.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Desk";
    }

}

