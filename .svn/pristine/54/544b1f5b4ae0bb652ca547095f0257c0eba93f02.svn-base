package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;


import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Adem J. Conover,  COSC436
 */
public class strawHat_nw implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public strawHat_nw() {
        this.displayName = "Straw Hat";
        this.description = "A brimmed hat woven out of straw. It has a red band wrapped around the base and a string connecting either side by the inside of the brim...it seems important...";
    }

    /**
     * THIS IS JUST A SAMPLE.
     *
     * @return The item description.
     */
    @Override
    public String getItemFullDescription() {
        return this.description;
    }

    @Override
    public String getItemDisplayName() {
        return this.displayName;
    }

    /**
     * Item Can be picked up and moved.
     *
     * @return True
     */
    @Override
    public boolean isTransferable() {
        boolean isAnchored = false;
        return !isAnchored;
    }

    @Override
    public List<String> getItemAliases() {
        return List.of("Hat", "Mugiwara", "Straw Hat", "sh");
    }

}
