package io.github.ratismal.japanesequiz.windows;

import io.github.ratismal.japanesequiz.draw.RenderHelper;

/**
 * Created by Ratismal on 2015-09-15.
 */

public class InstanceSwitcher {

    private RenderHelper rh;
    private InstanceMainMenu mainMenu;
    private static int instance = 0;

    public InstanceSwitcher(RenderHelper rh) {
        this.rh = rh;
        this.mainMenu = new InstanceMainMenu(rh);
    }

    public void renderInstance() {
        switch(instance) {
            case 0:
                mainMenu.render();
                break;
            default:
                mainMenu.render();
                break;
        }
    }

    public int getInstance() { return instance; }

}
