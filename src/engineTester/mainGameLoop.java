package engineTester;

import org.lwjgl.opengl.Display;
import renderEngine.Loader;
import renderEngine.Renderer;
import renderEngine.displayManager;
import renderEngine.rawModel;

public class mainGameLoop {

    public static void main(String[] args) {
        displayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();

        float[] vertices = {
                -0.5f, 0.5f, 0f,
                -0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                0.5f, -0.5f, 0f,
                0.5f, 0.5f, 0f,
                -0.5f, 0.5f, 0f
        };

        rawModel model = loader.loadToVAO(vertices);

        while (!Display.isCloseRequested()){
            //game logic
            //rendering
            renderer.prepare();
            renderer.render(model);
            displayManager.updateDisplay();
        }

        loader.cleanUp();

        displayManager.closeDisplay();
    }
}


