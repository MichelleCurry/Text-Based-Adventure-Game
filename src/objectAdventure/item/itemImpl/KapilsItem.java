package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Adem J. Conover,  COSC436
 */
public class KapilsItem implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public KapilsItem() {
        this.displayName = "Milkshake";
        this.description = "A milkshake that can be consumed for attack buff.";
    }

    /**
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
        return List.of("Milkshake"); // comment for later: no other names for the milkshake that the user can refer to it as?
    }

}
