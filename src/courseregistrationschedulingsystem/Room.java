/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationschedulingsystem;

import java.io.Serializable;

/**
 *
 * @author Subham Guha(sjg5441)
 */
public class Room implements Serializable {
    private final String roomId;
    
    public Room(String r)
    {
        this.roomId = r;
    }
    
    public Room(Integer roomId)
    {
        this(roomId.toString());
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }
    
    public String toString()
    {
        return "Room " + roomId;
    }
  
}