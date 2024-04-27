package Creational.Factory;

import Creational.Factory.components.button.Button;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createUIFactory("Android");
        Button button = factory.createButton();
        button.getSize();
    }
}
