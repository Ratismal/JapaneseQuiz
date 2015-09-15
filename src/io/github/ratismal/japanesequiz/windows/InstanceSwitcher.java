package io.github.ratismal.japanesequiz.windows;

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.handler.MouseHandler;
import io.github.ratismal.japanesequiz.windows.instances.InstanceMainMenu;
import io.github.ratismal.japanesequiz.windows.instances.InstanceOptionMenu;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class InstanceSwitcher {

    private RenderHelper rh;
    private InstanceMainMenu mainMenu;
    private InstanceOptionMenu optionMenu;
    private static int instance = 0;

    public InstanceSwitcher(RenderHelper rh) {
        this.rh = rh;
        this.mainMenu = new InstanceMainMenu(rh);
        this.optionMenu = new InstanceOptionMenu(rh);
    }

    public void renderInstance() {
        switch(instance) {
            case 0:
                mainMenu.render();
                break;
            case 1:
                optionMenu.render();
                break;
            default:
                mainMenu.render();
                break;
        }
    }

    public void mouseInput(MouseHandler mouse) {
        switch(instance) {
            case 0:
                mainMenu.mouseInput(mouse);
                break;
            case 1:
                optionMenu.mouseInput(mouse);
                break;
            default:
                mainMenu.mouseInput(mouse);
                break;
        }
    }

    public int getInstance() { return instance; }

    public void setInstance(int instance) { this.instance = instance; }

}
