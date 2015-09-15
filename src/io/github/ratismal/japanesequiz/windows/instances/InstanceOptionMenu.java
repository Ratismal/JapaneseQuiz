package io.github.ratismal.japanesequiz.windows.instances;

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.handler.MouseHandler;
import io.github.ratismal.japanesequiz.windows.IWindowInstance;
import io.github.ratismal.japanesequiz.windows.InstanceSwitcher;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class InstanceOptionMenu implements IWindowInstance {

    private RenderHelper rh;

    public InstanceOptionMenu(RenderHelper rh) {
        this.rh = rh;
    }

    public void render() {
        rh.renderQuad("gui/logo/options", Display.getWidth()/2 - 256, Display.getHeight()/3 - 128 );

        rh.renderQuad("gui/button/button_long", Display.getWidth()/2 - 256, Display.getHeight()/6*5 - 64, "Back", Color.black);

    }

    public void mouseInput(MouseHandler mouse) {

        if (mouse.isInRange(Display.getWidth()/2 - 256, Display.getWidth()/2 + 256,
                Display.getHeight()/6*5 - 64, Display.getHeight()/6*5 + 64)) {
            InstanceSwitcher.setInstance(0);
        }

    }

}
