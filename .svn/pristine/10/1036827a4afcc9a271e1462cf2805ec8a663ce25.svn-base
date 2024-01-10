package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.room.Room;

/**
 * @author Kapil Regmi, COSC436
 */
public class KapilsRoom extends Room {

    private String kapilRoomDescEnterFrom22 = 
        "You have entered the dining hall."
        + "The room is eerily silent, except for the faint, ominous music that emanates from the jukebox in the corner."
        + "The tables are empty and the air feels heavy with an unexplained dread."
        + "In one of the nearby tables, there is an Oreo milkshake sitting there, still cold despite the deserted room."
        + "To the west, you notice a narrow, dark path leading off into the unknown.";

    private String kapilRoomDescEnterFrom30 = 
    "You have entered the dining hall."
    + "The room is eerily silent, except for the faint, ominous music that emanates from the jukebox in the corner."
    + "The tables are empty and the air feels heavy with an unexplained dread."
    + "In one of the nearby tables, there is an Oreo milkshake sitting there, still cold despite the deserted room."
    + "To the east, there is a long hallway with flickering lights.";

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public KapilsRoom(int ID) {
        // The room ID must be set.
        super(ID);

        // if i'm giving direction of the path avaliable, shouldn't it change based on how the user entered the room?
        super.setRoomDescription(kapilRoomDescEnterFrom22);
        super.addItem(new DemoItem());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Kapil Regmi";
    }
}
