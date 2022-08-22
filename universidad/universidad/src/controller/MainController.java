package controller;

import view.Menu;
import view.MenuGUI;

public class MainController {

    public MainController() {
        UniversidadController uController = new UniversidadController();
        /*
         * Menu menu = new Menu(uController);
         * menu.crearMenu();
         */
        MenuGUI menuGui = new MenuGUI(uController);
        menuGui.construirMenu();
    }

}
