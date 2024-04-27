package Creational.Factory;

public class UIFactoryFactory {

    static UIFactory getUIFactoryByPlatform(String platform) {
        if (platform.equals("Android")) {
            return new AndroidUIFactory();
        } else if (platform.equals("IOS")) {
            return new IOSUIFactory();
        }
        return null;
    }
}
