package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Adem J. Conover,  COSC436
 */
public class ChocolateSpoon implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public ChocolateSpoon() {
        this.displayName = "A Chocolate-Covered Spoon";
        this.description = "This chocolate-covered spoon was stolen from a chocolate-covered baker.";
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
        return List.of("Spoon", "Chocolate Spoon", "Chocolate-Covered Spoon", "Chocolate covered spoon", "Baker's Spoon", "Bakers Spoon", "Baker Spoon");
    }

}
