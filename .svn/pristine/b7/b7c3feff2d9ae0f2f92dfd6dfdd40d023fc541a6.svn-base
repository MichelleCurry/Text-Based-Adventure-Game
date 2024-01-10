package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * 
 *
 * @author Krutik Dhiren Patel,  COSC436
 */
public class DiningTable_kdp implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public DiningTable_kdp() {
        this.displayName = "Dining Table";
        this.description = "A dining table is located in the east corner of the kitchen. The table is occupied with a filled water bottle case, fruit basket, notebook, and a mysterious letter.";
    }

    /**
     * 
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
     * Item TABLE Cannot be picked up and moved.
     *
     * @return False
     */
    @Override
    public boolean isTransferable() {
        boolean isAnchored = true;
        return !isAnchored;
    }

    @Override
    public List<String> getItemAliases() {
        return List.of("Table", "Dining Table");
    }

}
