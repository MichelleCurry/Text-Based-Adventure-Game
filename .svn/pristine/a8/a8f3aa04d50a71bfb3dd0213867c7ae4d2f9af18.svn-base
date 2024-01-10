package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

public class Desk_Nzaya implements Item {
    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public Desk_Nzaya() {
        this.displayName = "Desk";
        this.description = "Nzaya item ";
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
        return List.of("Desk", "Desk Item", "Desk Item", "Contains lamp, charger and snack");
    }
}
