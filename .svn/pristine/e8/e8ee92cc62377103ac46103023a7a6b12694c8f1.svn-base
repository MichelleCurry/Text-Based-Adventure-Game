package objectAdventure.room.roomImpl;

import objectAdventure.common.Observer;
import objectAdventure.item.itemImpl.bottle_mlc;
import objectAdventure.item.itemImpl.lantern_mlc;
import objectAdventure.room.Room;

/**
 * @author Michelle Curry, COSC436
 */
public class mcurry6Room extends Room implements Observer<String> {
    public mcurry6Room(final int roomId) {
        // The room ID must be set.
        super(roomId);

        super.setRoomDescription("""
                                You are in the bar lounge. There are doorways going East, South, and West.
                                The room is dark, but you can just make out the bar counter and doorways.
                                """);
        lantern_mlc lantern = new lantern_mlc();
        bottle_mlc bottle = new bottle_mlc();
        bottle.addObserver(this);
        lantern.addObserver(this);

        super.addItem(bottle);
        super.addItem(lantern);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRoomAuthor() {
        return "Michelle Curry";
    }

    @Override
    public void update(String updateValue) {
        super.setRoomDescription("""
            You are in the bar lounge. There are doorways going East, South, and West.
            There is a bar, above hangs a lit lantern, and a cabinet behind the bar 
            , theres mostly only empty bottles and cups left, however there is .
            Above the bar hangs a lantern.
            """+ "\nUpdated: "+updateValue);
    }

    
}
