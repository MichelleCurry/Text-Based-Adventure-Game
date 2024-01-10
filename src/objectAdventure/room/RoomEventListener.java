package objectAdventure.room;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.core.player.Player;

import java.util.logging.Logger;

/**
 * Rooms that implement RoomEventListener will be notified when a player enters or leaves the room.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public interface RoomEventListener {

    /**
     * Notification method for a player entering a room. (Invoked when a player enters a room.)
     *
     * @param player The player entering the room.
     */
    default void playerEnteringRoom(Player player) {
        Logger.getGlobal().info("Player %s entering room %d from %d"
                .formatted(player, player.getCurrentRoomId(), player.getPreviousRoomID()));
    }

    /**
     * Notification method for a player leaving a room. (Invoked when a player leaves a room.)
     *
     * @param player The player leaving the room.
     */
    default void playerLeavingRoom(Player player) {
        Logger.getGlobal().info("Player %s leaving room %d for %d"
                .formatted(
                        player,
                        player.getPreviousRoomID(),
                        player.getCurrentRoomId()));
    }
}