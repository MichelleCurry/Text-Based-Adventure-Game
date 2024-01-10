package objectAdventure;

import objectAdventure.core.RoomList;
import objectAdventure.room.roomImpl.*;


/**
 * Note that this REALLY doesn't belong here in terms of "good design" (it should in the Room package
 * or perhaps with the Core package), but it's placed here to make it easier to edit as everyone
 * adds their Room Implementations and makes them available to the shell.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class RoomInstances {
    private RoomInstances() {
        // Utility classes cannot (should not) be instantiated.
    }

    /**
     * Initialization method for all rooms in the game. Technically, dynamic loading would be
     * better, but this is much easier to understand. (Dynamic class loading introduces many
     * additional considerations.)
     * <p>
     * While two "instantiation" techniques are shown below, either can be used for now. (The normal
     * constructor is probably most are familiar with most, but we'll look at the difference.)
     */
    public static void initRooms(RoomList rooms) {
        // aconover
        rooms.addRoom(new StartRoom(0));
        // *****************************************************************************

        // aadelek1

        // aadelu2
        rooms.addRoom(new aadelu2Room(16));

        // aalney2

        // acubba1
        rooms.addRoom(new acubba1Room(28));

        // agapsi1
        rooms.addRoom(new Agapsi1(9));

        // anjike1
        rooms.addRoom(new Anjike1Room(22));

        // aperez20
        //rooms.addRoom(new Aperez(26));

        // eclay2
        //rooms.addRoom(new EClay2(1));

        // etamir1

        // jkline11
        rooms.addRoom(new jkline11Room(13));

        // joguns1

        // kfergu10
        rooms.addRoom(new Kfergu10(1));

        // kowino2

        // kpatel43
        rooms.addRoom(new kpatel43(6));

        // kregmi1
        rooms.addRoom(new KapilsRoom(29));

        // mbaxte6
        rooms.addRoom(new Mbaxte6(17));

        // mcurry6
        rooms.addRoom(new mcurry6Room(14));

        // mnogue2
        // rooms.addRoom(new Mnogue2(15));

        // nkcarus3
        rooms.addRoom(new NicholasCarusoRoom(18));

        // nduran3

        // nmuia1
        rooms.addRoom(new Nmuia1(2));

        // nwilke4
        rooms.addRoom(new Nwilke4_room(8));

        // oidowu3

        // omalom1
        rooms.addRoom(new omalom1(12));

        // orego1
        rooms.addRoom(new orego1(7));

        // pmung1

        // rfitzp5
        rooms.addRoom(new AstronomyTower_rfitzp5(5));

        // rgoza1
        rooms.addRoom(new Rgoza(4));

        // srivera1
        rooms.addRoom(new srivera1(30));

        // zbonfo1
        rooms.addRoom(new Zbonfo1(5));

    }
}
