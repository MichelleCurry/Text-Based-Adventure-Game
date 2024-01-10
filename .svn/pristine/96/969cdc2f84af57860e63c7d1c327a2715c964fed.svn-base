package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

public class Key implements Item {

    private final String displayName;
    private final String description;

    public Key() {
        this.displayName = "Key";
        this.description = "A shiny golden key.";
    }

    @Override
    public String getItemDisplayName() {
        return this.displayName;
    }

    @Override
    public String getItemFullDescription() {
        return this.description;
    }

    @Override
    public boolean isTransferable() {
        return true;
    }

    @Override
    public List<String> getItemAliases() {
        return List.of("Golden Key");
    }
}