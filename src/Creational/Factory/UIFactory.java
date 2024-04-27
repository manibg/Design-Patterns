package Creational.Factory;

import Creational.Factory.components.button.Button;
import Creational.Factory.components.dropdown.DropDown;
import Creational.Factory.components.menu.Menu;

public interface UIFactory {

    public Button createButton();
    public Menu createMenu();
    public DropDown createDropDown();
}
