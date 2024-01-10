package objectAdventure.item.itemImpl;
// $Date: 2023-04-07 18:52:54 -0400 (Fri, 07 Apr 2023) $

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Stephanie Rivera, COSC436
 */
public class olivetree_sar implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public olivetree_sar() {
        this.displayName = "Olive Tree";
        this.description = "A potted olive three that is about 3 ft tall with a gnarled trunk and evergreen leaves";
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
