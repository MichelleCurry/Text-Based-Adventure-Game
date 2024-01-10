package objectAdventure.room.roomImpl;
// $Date: 2023-04-13 10:58:37 -0400 (Thu, 13 Apr 2023) $

import objectAdventure.item.itemImpl.phone_zb;
import objectAdventure.room.Room;

/**
 * The StartRoom is the first room the player will see when they start the game.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class Zbonfo1 extends Room {

    /**
     * Constructor for the room, it must be constructed with an ID!!!
     */
    public Zbonfo1(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("""
                You enter a small, dimly lit stone room.
                A wooden table stands in the center with a smartphone on top.
                The walls are adorned with strange symbols you don't recognize, but they don't seem important.
                """);
        super.addItem(new phone_zb());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Zaki A. Bonfoh";
    }


}
