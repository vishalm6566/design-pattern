package designPattern.abstractFactory.Factories;


import designPattern.abstractFactory.buttons.Button;
import designPattern.abstractFactory.buttons.WindowsButton;
import designPattern.abstractFactory.checkboxes.Checkbox;
import designPattern.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
