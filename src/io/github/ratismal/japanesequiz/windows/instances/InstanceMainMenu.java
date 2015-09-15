package io.github.ratismal.japanesequiz.windows.instances;

import io.github.ratismal.japanesequiz.MainWindow;
import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.handler.MouseHandler;
import io.github.ratismal.japanesequiz.windows.IWindowInstance;
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



    }

}