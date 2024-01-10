package objectAdventure.core.player;
// $Date: 2023-04-10 15:33:44 -0400 (Mon, 10 Apr 2023) $

import objectAdventure.item.Item;

import java.util.List;
import java.util.Optional;

public interface Player {
    /**
     * Gets the current room ID of the player.
     *
     * @return The currentRoom ID
     */
    int getPreviousRoomID();

    /**
     * Gets the current room ID of the player.
     *
     * @return The currentRoom ID
     */
    int getCurrentRoomId();

    /**
     * Gets the destination room ID of the player.
     *
     * @return The destinationRoom ID
     */
    default int getDestinationRoomId() {
        return this.getCurrentRoomId();
    }

    /**
     * Add an item to the player's inventory.
     *
     * @param item item to add to inventory
     */
    void addItem(Item item);

    /**
     * Remove an item from the player's inventory.
     *
     * @param item item to remove from inventory, Optional is empty if item is not in inventory.
     */
    Optional<Item> removeItem(Item item);

    /**
     * Get the player's inventory.
     *
     * @return The player's inventory.
     */
    List<Item> getItemList();

    /**
     * Get the player's name.
     *
     * @return The player's name.
     */
    String getPlayerName();
}
