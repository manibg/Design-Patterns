package Creational.Factory;

import Creational.Factory.components.button.AndroidButton;
import Creational.Factory.components.button.Button;
import Creational.Factory.components.dropdown.AndroidDropDown;
import Creational.Factory.components.dropdown.DropDown;
import Creational.Factory.components.menu.AndroidMenu;
import Creational.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
