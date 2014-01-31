/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.base.game;

import com.base.engine.Sprite;
import org.lwjgl.input.Mouse;

/**
 *
 * @author gavinstark
 */
public class Game {
    static Sprite s;
    
    static {
        s = new Sprite(0,0,16,24);
    }
    
    public static void update() {
        s.update(Mouse.getX(), Mouse.getY(), false);
    }
    
    public static void render() {
        s.render();
    }
}
