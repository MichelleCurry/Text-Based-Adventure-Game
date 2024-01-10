package objectAdventure.item.itemImpl;
// $Date: 2023-04-13 10:58:37 -0400 (Thu, 13 Apr 2023) $

import objectAdventure.item.Item;

import java.util.List;

/**
 * @author Zaki A. Bonfoh, COSC436
 */
public class phone_zb implements Item {

    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public phone_zb() {
        this.displayName = "Phone";
        this.description = """
                The phone is locked. It could be important, but you don't know the password.
                """;
    }

    /**
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
        return List.of("Phone", "Smartphone");
    }

}
