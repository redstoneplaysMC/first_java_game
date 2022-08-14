package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;
public class displayManager {

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 1280;
    private static final int FPSCAP = 120;
    private static final String TITLE = "Silly Java Game";
    public static void createDisplay(){

        ContextAttribs attribs = new ContextAttribs(3,2);
        attribs.withForwardCompatible(true);
        attribs.withProfileCore(true);

        try {
            Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
            Display.create(new PixelFormat(), attribs);
            Display.setTitle(TITLE);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        GL11.glViewport(0, 0, WIDTH, HEIGHT);

    }

    public static void updateDisplay(){
        Display.sync(FPSCAP);
        Display.update();
    }

    public static void closeDisplay(){
        Display.destroy();
    }

}
