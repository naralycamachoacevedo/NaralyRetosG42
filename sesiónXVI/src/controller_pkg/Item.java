/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_pkg;

/**
 *
 * @author naral
 */
public class Item {
    private int id;
    private final String description;

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
     public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return getDescription();
    }


}
