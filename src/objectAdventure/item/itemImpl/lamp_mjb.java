package objectAdventure.item.itemImpl;

import objectAdventure.item.InteractionResult;
import objectAdventure.item.Item;
import objectAdventure.item.ItemInteractionEvent;

import java.util.List;

public class lamp_mjb implements Item {

    private String description;
    private String displayName;

    /**
     * Constructor
     */
    public lamp_mjb() {
        this.description = "This is Maliya\'s lamp. This lamp has a pink light bulb. It's cool!";
        this.displayName = "MJB lamp";
    }
    @Override
    public String getItemFullDescription() {
        return this.description;
    }

    @Override
    public String getItemDisplayName() {
        return this.displayName;
    }

    @Override
    public boolean isTransferable() {
        boolean isAnchored = true;
        return isAnchored;
    }

    @Override
    public List<String> getItemAliases() {
        return List.of("Lamp", "Lamp Item");
    }
}
