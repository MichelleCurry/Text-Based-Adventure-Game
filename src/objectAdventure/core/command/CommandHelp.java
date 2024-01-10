package objectAdventure.core.command;
// $Date: 2023-04-10 15:33:44 -0400 (Mon, 10 Apr 2023) $

import objectAdventure.core.DescriptionType;
import objectAdventure.item.ItemInteractionEvent;

import java.util.Arrays;
import java.util.stream.Collectors;

import static objectAdventure.core.DescriptionType.*;

class CommandHelp {
    private final static DescriptionType DESCRIPTION_TYPE = LONG;

    /* The help text for the game. */
    final static String COMMAND_HELP = """
            Movement:
                NORTH | SOUTH | EAST | WEST
                
            Item Relocation (Drop or Get/Take):
                DROP ( <item name> | ALL )
                ( GET | TAKE ) (<item name> | ALL)
                
            Other Item Interactions
                ( %s ) <item name>
                
            Display Aspects of the Environment (for debugging)
                SHOW ( ALL | INVENTORY | ITEMS | ROOM | LEGEND )
                
            Change the logging level (for debugging). Code Usage: Logger.getGlobal().info("Message")
                LOG ( ALL | severe | warning | info | config | fine | finer | finest | OFF )
                
            Single Letter Commands:
                N | S | E | W    # (Movement)
                I                # ("Inventory": Show Player Inventory)
                L {item}         # ("Look": Show Room Description & Room Items)
                T [room id]      # ("Teleport": Jump to RoomID)
                ?                # (This List)""".formatted(getItemInteractionHelp(DESCRIPTION_TYPE));


    private static String getItemInteractionHelp(DescriptionType descriptionType) {
        // Get all enum values from ItemInteractionEvent
        return Arrays.stream(ItemInteractionEvent.values())
                .map(switch (descriptionType) {
                    case SHORT -> ItemInteractionEvent::getName;
                    case LONG -> ItemInteractionEvent::getAliases;
                })
                .filter(name -> !name.equals("TAKE"))  // In relocation help.
                .filter(name -> !name.equals("DROP"))  // In relocation help.
                .collect(Collectors.joining(" | "));
    }
}
