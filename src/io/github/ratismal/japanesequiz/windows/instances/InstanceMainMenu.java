package io.github.ratismal.japanesequiz.windows.instances;

import io.github.ratismal.japanesequiz.MainWindow;
import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.handler.MouseHandler;
import io.github.ratismal.japanesequiz.windows.IWindowInstance;
import io.github.ratismal.japanesequiz.windows.InstanceSwitcher;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class InstanceMainMenu implements IWindowInstance {

    private RenderHelper rh;


    public InstanceMainMenu(RenderHelper rh) {
        this.rh = rh;
    }

    public void render() {


        rh.renderQuad("gui/logo/logo", Display.getWidth()/2 - 256, Display.getHeight()/3 - 128 );
        rh.renderQuad("gui/button/button_long", Display.getWidth()/2 - 256, Display.getHeight()/3*2 - 64, "Start", Color.black);
        rh.renderQuad("gui/button/button_half", Display.getWidth()/2 - 256, Display.getHeight()/3*2 + 72, "Options", Color.black);
        rh.renderQuad("gui/button/button_half", Display.getWidth()/2 + 3, Display.getHeight()/3*2 + 72, "Quit", Color.black);


    }

    public void mouseInput(MouseHandler mouse) {
        //System.out.println("Checking if mouse is in range - X=" + mouse.getX() + " Y=" + mouse.getY());
        if (mouse.isInRange(Display.getWidth()/2 - 256, Display.getWidth()/2 + 256,
                Display.getHeight()/3*2 - 64, Display.getHeight()/3*2 + 64)) {

        }
        else if (mouse.isInRange(Display.getWidth()/2 - 256, Display.getWidth()/2 - 4,
                Display.getHeight()/3*2 + 72, Display.getHeight()/3*2 + 200)) {
            InstanceSwitcher.setInstance(1);
        }
        else if (mouse.isInRange(Display.getWidth()/2 + 3, Display.getWidth()/2 + 256,
                Display.getHeight()/3*2 + 72, Display.getHeight()/3*2 + 200)) {
            Display.destroy();
            System.exit(0);
        }

    }

}
