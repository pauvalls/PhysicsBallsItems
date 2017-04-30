/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.physicballs.items;

import java.io.Serializable;

/**
 *
 * @author pauva
 */
public class AndroidBall implements Serializable{
   
   
float x ;
float y;
float speed;
float accel;
float radius;
float mass;
float angle;
String type;

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

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getAccel() {
        return accel;
    }

    public void setAccel(float accel) {
        this.accel = accel;
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

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    /**
     * Main constructor
     *
     * @param x
     * @param y
     * @param speed
     * @param radius
     */
    public AndroidBall(float x, float y, float speed, float accel, float radius, float mass, float angle, String type) {
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.accel=accel;
        this.radius=radius;
        this.mass=mass;
        this.angle=angle;
        this.type= type;
        
    }
    
}

