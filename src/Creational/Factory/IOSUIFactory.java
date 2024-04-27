package Creational.Factory;

import Creational.Factory.components.button.Button;
import Creational.Factory.components.button.IOSButton;
import Creational.Factory.components.dropdown.DropDown;
import Creational.Factory.components.dropdown.IOSDropDown;
import Creational.Factory.components.menu.IOSMenu;
import Creational.Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
