package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

public class Telescope_rfitzp5 implements Item {

    private final String description;
    private final String displayName;


    /**
     * Constructor
     */
    public Telescope_rfitzp5(){
        this.description = "A long range telescope with a slightly rusted exterior.";
        this.displayName = "Telescope";
    }

    /**
     * @return The full description of the item
     */
    @Override
    public String getItemFullDescription() {
        return this.description;
    }

    /**
     * The short display name of the item for display in lists, etc.
     *
     * @return A short display name.
     */
    @Override
    public String getItemDisplayName() {
        return this.displayName;
    }

    /**
     * The item CAN be picked up and moved
     *
     * @return True
     */
    @Override
    public boolean isTransferable() { return true; }

    /**
     * Short Names lists for use in picking up and removing items.
     *
     * @return A list containing the aliases (short names) for an item.
     */
    @Override
    public List<String> getItemAliases() {
        return List.of("telescope", "scope", "spyglass");
    }

}
