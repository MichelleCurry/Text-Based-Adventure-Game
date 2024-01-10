package objectAdventure.room;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.item.Item;
import objectAdventure.item.ItemPossessor;

import java.util.*;

import static java.util.Collections.unmodifiableList;

/**
 * The Room class is the base class for all rooms in the game.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public abstract class Room implements ItemPossessor {
    // The ID of the Room
    private final Integer roomId;

    // The List of Items in the room
    private final List<Item> itemList;

    // The Description of the Room.
    private String description;

    /**
     * Constructor for the abstract room.
     *
     * @param roomId The ID of the room.
     */
    protected Room(int roomId) {
        this.roomId = roomId;
        this.itemList = new LinkedList<>();
    }


    /**
     * Get the description of a room.
     *
     * @return the Room Description
     */
    public String getRoomDescription() {
        return description;
    }

    /**
     * @param description the description of the room.
     */
    protected void setRoomDescription(final String description) {
        this.description = description;
    }

    /**
     * Get the ID of the room.
     *
     * @return The RoomID
     */
    public Integer getRoomId() {
        return this.roomId;
    }

    /**
     * Adds an item to the room.
     *
     * @param item The item to add to the room.
     */
    @Override
    public void addItem(final Item item) {
        this.itemList.add(item);
    }

    /**
     * Removes an item from the room.
     *
     * @return The items in the room.
     */
    @Override
    public Optional<Item> removeItem(final Item item) {
        if (item.isTransferable()) {
            this.itemList.remove(item);
            return Optional.of(item);
        }
        return Optional.empty();
    }

    /**
     * Returns a copy of the item List.
     *
     * @return The items in the room.
     */
    @Override
    public List<Item> getItemList() {
        return unmodifiableList(itemList);
    }

    /**
     * Gets the room author information.
     *
     * @return The Author of the room
     */
    public String getRoomAuthor() {
        return "The author wishes to remain anonymous.";
    }

}
