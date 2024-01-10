package objectAdventure;
// $Date: 2023-04-25 13:59:27 -0400 (Tue, 25 Apr 2023) $

import objectAdventure.core.command.CommandProcessor;
import objectAdventure.core.command.GameController;
import objectAdventure.core.command.UserInput;
import objectAdventure.core.player.PlayerImpl;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * NOTE: The main Entry point to the program...
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
class Main {
    // Default logging level.
    private static Level LOG_LEVEL = Level.WARNING;

    // Set up logging as early as possible.
    static {
        System.setErr(System.out); // Redirect all error messages to the console.
        Logger.getGlobal().setLevel(LOG_LEVEL); // Set the default logging level.
    }

    /**
     * Main Method for game.
     *
     * @param args Not Used
     */
    public static void main(String[] args) {
        // Create the player and the game controller.
        var player = new PlayerImpl("Player");
        var controller = new GameController(player);

        // Create the command processor and start the user input loop.
        var commandProcessor = new CommandProcessor(controller);
        UserInput.userInputLoop(commandProcessor, new Scanner(System.in));
    }
}
