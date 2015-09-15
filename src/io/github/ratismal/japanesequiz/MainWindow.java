package io.github.ratismal.japanesequiz;

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.windows.InstanceSwitcher;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glEnable;

import java.awt.*;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class MainWindow {

    private RenderHelper rh;
    private InstanceSwitcher instanceSwitcher;

    public MainWindow(RenderHelper renderHelper, InstanceSwitcher instanceSwitcher) {

        this.rh = renderHelper;
        this.instanceSwitcher = instanceSwitcher;

    }

    public void start() {

        initGL(1280, 720);
        rh.initFont("Courier New", Font.BOLD, 48);
        while (true) {
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

            instanceSwitcher.renderInstance();

            Display.update();
            Display.sync(100);

            if (Display.isCloseRequested()) {
                Display.destroy();
                System.exit(0);
            }
        }
    }

    public void initGL(int width, int height) {
        /*
        try {
            Display.setDisplayMode(new DisplayMode(x, y));
            Display.setResizable(true);
            Display.setTitle("Japanese Quiz");
            Display.create();
        } catch (LWJGLException e) {
            System.err.println("Display wasn't initialized correctly.");
            System.exit(1);
        }

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity(); // Resets any previous projection matrices
        glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
        glEnable(GL_TEXTURE_2D);
*/

        try {
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.create();
            Display.setVSyncEnabled(true);
            Display.setResizable(true);
            Display.setTitle("Japanese Quiz");
        } catch (LWJGLException e) {
            e.printStackTrace();
            System.exit(0);
        }

        glEnable(GL11.GL_TEXTURE_2D);

        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        // enable alpha blending
        glEnable(GL11.GL_BLEND);
        glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        glViewport(0, 0, width, height);
        glMatrixMode(GL11.GL_MODELVIEW);

        glMatrixMode(GL11.GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, width, height, 0, 1, -1);
        glMatrixMode(GL11.GL_MODELVIEW);
    }




}
