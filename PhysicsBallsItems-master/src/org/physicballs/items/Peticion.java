/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Liam-Portatil
 */
public class Peticion implements Serializable{
    private String accion;
    private ArrayList<Object> data;

    public Peticion(String accion) {
        this.accion = accion;
        data = new ArrayList<Object>();
    }

 
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }
    
    public Object getObject(int index){
        return data.get(index);
    }
    
    public void pushData(Object o){
        data.add(o);
    }
    
    public Object popData(){
        Object o = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return o;
    }
   
}
