package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * @author Austin Cubbage, COSC 436
 */
public class toy_adc implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public toy_adc() {
        this.displayName = "Cat Toy";
        this.description = "A colorful, fish-shaped cat toy";
    }

    /**
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
        return List.of("Cat Toy", "Fish Toy");
    }

}

