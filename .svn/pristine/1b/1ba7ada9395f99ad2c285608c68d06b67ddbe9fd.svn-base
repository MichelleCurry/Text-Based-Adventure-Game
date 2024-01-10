package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Adem J. Conover,  COSC436
 */
public class DemoItem_ajc implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public DemoItem_ajc() {
        this.displayName = "Demonstration Item 2 ";
        this.description = "An item for demonstration purposes 2.";
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
        return List.of("Demo", "Demo Item", "Demonstration Item", "Mysterious thing");
    }

}
