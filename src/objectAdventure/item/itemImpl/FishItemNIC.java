/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectAdventure.item.itemImpl;

import objectAdventure.item.Item;

import java.util.List;

/**
 *
 * @author ncaru
 */
public class FishItemNIC implements Item{
    
    private final String description;
    private final String displayName;

    /**
     * Constructor
     */
    public FishItemNIC() {
        this.displayName = "Super Cool Fish";
        this.description = "A powerful fish meal to replenish full HP. Also talks!";
    }
 
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
        return List.of("Fish", "Fish Item", "Super Cool Fish", "Powerful Food", "Friend", "Company Item");
    }
    
}
