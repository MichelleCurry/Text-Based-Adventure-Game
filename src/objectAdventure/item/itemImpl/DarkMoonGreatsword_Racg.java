package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * A sample item for demonstration purposes.
 *
 * @author Rogie Anthony Cahiles Goza,  COSC436
 */
public class DarkMoonGreatsword_Racg implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public DarkMoonGreatsword_Racg() {
        this.displayName = "Dark Moon Great Sword";
        this.description = "A Moon Greatsword, bestowed by a Carian queen upon her spouse to honor long-standing tradition. One of the legendary armaments. Ranni's sigil is a full moon, cold and leaden, and this sword is but a beam of its light.";
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
        return List.of("Sword", "Big Sword", "Big Blue Sword", "Wife Sword");
    }

}
