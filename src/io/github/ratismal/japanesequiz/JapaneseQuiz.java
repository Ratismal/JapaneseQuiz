package io.github.ratismal.japanesequiz;

/**
 * Created by Ratismal on 2015-09-14.
 */

import io.github.ratismal.japanesequiz.draw.RenderHelper;
import io.github.ratismal.japanesequiz.windows.InstanceSwitcher;

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

