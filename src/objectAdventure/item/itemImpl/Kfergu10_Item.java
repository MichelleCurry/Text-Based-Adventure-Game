package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 * @author Kali Ferguson,  COSC436
 */
public class Kfergu10_Item implements Item {

    private final String descString;

    /**
     * Constructor
     */
    public Kfergu10_Item() {
        this.descString = "A water bottle";
    }

    /**
     * 
     *
     * @return The item description.
     */
    @Override
    public String getItemFullDescription() {
        return this.descString;
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
        return List.of("Water", "Water Bottle", "Bottle");
    }
    public String  getItemDisplayName(){
        return "water";

    }

}
