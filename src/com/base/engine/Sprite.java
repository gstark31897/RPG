/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author gavinstark
 */
public class Sprite {
    float x;
    float y;
    float sx;
    float sy;
    
    public Sprite(float x, float y, float sx, float sy) {
        this.x = x;
        this.y = y;
        this.sx = sx;
        this.sy = sy;
    }
    
    public void update(float x, float y, boolean velocity) {
        if(velocity) {
            this.x += x;
            this.y += y;
        }else{
            this.x = x;
            this.y = y;
        }
    }
    
    public void render() {
        glPushMatrix();
        glBegin(GL_QUADS);
        
        glVertex3f(x,y,0);
        glVertex3f(x,y+sy,0);
        glVertex3f(x+sx,y+sy,0);
        glVertex3f(x+sx,y,0);
        
        glEnd();
        glPopMatrix();
    }
}
