package designPattern.abstractFactory.Factories;

import designPattern.abstractFactory.buttons.Button;
import designPattern.abstractFactory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
