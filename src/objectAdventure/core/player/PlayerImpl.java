package objectAdventure.core.player;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.item.Item;
import objectAdventure.item.ItemPossessor;

import java.util.*;

/**
 * The Player class is the base class for all players in the game. Players may
 * have a name and a list of items.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class PlayerImpl implements ItemPossessor, Player {

    // The Name of the player
    private final String playerName;

    // The List of Items the player is carrying.
    private final List<Item> inventory;

    // The ID of the room the player is in.
    private int currentRoomID;

    @Override public int getPreviousRoomID() {
        return previousRoomID;
    }

    private int previousRoomID;

    /**
     * Constructor for default player.
     *
     * @param playerName the name of the player
     */
    public PlayerImpl(String playerName) {
        this.playerName = playerName;
        this.inventory = new LinkedList<>();
        this.currentRoomID = 0;
        this.previousRoomID = 0;
    }

    /**
     * Gets the current room ID of the player.
     *
     * @return The currentRoom ID
     */
    @Override public int getCurrentRoomId() {
        return currentRoomID;
    }

    /**
     * Set the current room ID of the player.
     *
     * @param newRoomID the currentRoomID to set
     */
    public void setCurrentRoomId(int newRoomID) {
        this.previousRoomID = this.currentRoomID;
        this.currentRoomID = newRoomID;
    }


    /**
     * Add an item to the player's inventory.
     *
     * @param item item to add to inventory
     */
    @Override
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Remove an item from the player's inventory.
     *
     * @param item item to remove from inventory.
     */
    @Override
    public Optional<Item> removeItem(Item item) {
        if (item.isTransferable()) {
            inventory.remove(item);
            return Optional.of(item);
        }
        return Optional.empty();
    }

    /**
     * Get the list of items the player is carrying.
     *
     * @return the list of items.
     */
    @Override
    public List<Item> getItemList() {
        return this.inventory;
    }

    /**
     * Get the player's name.
     *
     * @return the playerName
     */
    @Override public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" + "currentRoom=" + currentRoomID + "}";
    }

}
