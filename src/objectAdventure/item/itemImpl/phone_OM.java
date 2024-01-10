package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Adam J. Conover, COSC436/COSC716
 */
public class phone_OM implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public phone_OM() {
        this.displayName = "Phone";
        this.description = "Iphone 14 Pro Max.";
    }

    /**
     * THIS IS NOT A SAMPLE.
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
        return List.of("Phone", "Phone Item", "Ringing Item", "Mysterious thing");
    }

}