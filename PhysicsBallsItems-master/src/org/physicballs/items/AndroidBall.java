/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

import java.io.Serializable;

/**
 * Clase propocionada por Pau Valls para poder enviar una pelota de Android a Servidor
 * 
 * @author pauva
 */
public class AndroidBall implements Serializable{
   float x, y , speedx,speedy,radius,mass;
   String type;

    public AndroidBall(float x, float y, float speedx, float speedy, float radius, float mass, String type) {
        this.x = x;
        this.y = y;
        this.speedx = speedx;
        this.speedy = speedy;
        this.radius = radius;
        this.mass = mass;
        this.type = type;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeedx() {
        return speedx;
    }

    public void setSpeedx(float speedx) {
        this.speedx = speedx;
    }

    public float getSpeedy() {
        return speedy;
    }

    public void setSpeedy(float speedy) {
        this.speedy = speedy;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}