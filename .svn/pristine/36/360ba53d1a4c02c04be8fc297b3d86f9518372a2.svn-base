package objectAdventure.item.itemImpl;
import objectAdventure.item.Item;
import java.util.List;

public class Book_ocr implements Item {
    
    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public Book_ocr() {
        this.displayName = "Paperback book";
        this.description = "A paperback chapter book for children about a mouse on an adventure";
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
        return List.of("Novel", "paperback", "chapter book");
    }

}
