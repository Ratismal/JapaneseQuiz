package io.github.ratismal.japanesequiz.windows;

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.handler.MouseHandler;

/**
 * Created by Ratismal on 2015-09-15.
 */

public interface IWindowInstance {

    public void render();

    public void mouseInput(MouseHandler mouse);

}
