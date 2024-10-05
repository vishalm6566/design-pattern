package designPattern.abstractFactory.Factories;

import designPattern.abstractFactory.buttons.Button;
import designPattern.abstractFactory.buttons.MacOSButton;
import designPattern.abstractFactory.checkboxes.Checkbox;
import designPattern.abstractFactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
