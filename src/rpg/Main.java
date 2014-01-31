/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpg;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

/**
 *
 * @author gavinstark
 */
public class Main {
    public static void main(String[] args) throws LWJGLException {
        initHardware();
        initGL();
        run();
        cleanUp();
    }
    
    static void initHardware() throws LWJGLException {
        Display.setDisplayMode(new DisplayMode(800,600));
        Display.create();
    }
    
    static void initGL() {
        glMatrixMode(GL_PROJECTION);
        glOrtho(0,Display.getWidth(),0,Display.getHeight(),-1,1);
        glMatrixMode(GL_MODELVIEW);
        glClearColor(0,0,0,0);
    }
    
    static void run() {
        while(!Display.isCloseRequested()) {
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glLoadIdentity();
            
            
            
            Display.update();
            Display.sync(60);
        }
    }
    
    static void cleanUp() {
        Display.destroy();
    }
}
