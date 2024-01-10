package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Alysse, COSC436
 */
public class Dog_AG implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public Dog_AG() {
        this.displayName = "Lucky";
        this.description = "A french hunting breed. White with brown spots.";
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
        return List.of("Dog", "Puppy", "Fluffy", "Lucky");
    }

}
