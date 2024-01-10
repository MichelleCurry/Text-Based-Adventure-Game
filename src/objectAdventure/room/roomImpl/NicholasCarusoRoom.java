/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectAdventure.room.roomImpl;

import objectAdventure.item.itemImpl.DemoItem;
import objectAdventure.room.Room;

/**
 *
 * @author ncaru
 */
public class NicholasCarusoRoom extends Room{
 
    public NicholasCarusoRoom(final int roomID){
        super(roomID);
        super.setRoomDescription("This is the Nicholas Caruso room of the game.");
        super.addItem(new DemoItem());
    }
    
    
     @Override
    public String getRoomAuthor() {
        return "Nicholas I. Caruso";
    }
    
}
