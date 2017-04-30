/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

import java.io.Serializable;

/**
 *
 * @author Liam-Portatil
 */
public class Status implements Serializable{
    
    public String description;
    public int ID;

    public Status(int ID, String description) {
        this.description = description;
        this.ID = ID;
    }

    public Status() {
    }
    
}
