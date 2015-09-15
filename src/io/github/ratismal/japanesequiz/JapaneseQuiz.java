package io.github.ratismal.japanesequiz;

/**
 * Created by Ratismal on 2015-09-14.
 */

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.windows.InstanceMainMenu;
import io.github.ratismal.japanesequiz.windows.InstanceSwitcher;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.lwjgl.opengl.GL11.*;

/**
 * If this application shows texture blank and responsive window
 * and doesn't throw any errors, you know you have installed lwjgl
 * correctly.
 * @author Oskar Veerhoek
 */
public class JapaneseQuiz {

    public static void main(String[] argv) {
        RenderHelper rh = new RenderHelper();
        InstanceSwitcher is = new InstanceSwitcher(rh);

        MainWindow mainWindow = new MainWindow(rh, is);
        mainWindow.start();
    }

}

