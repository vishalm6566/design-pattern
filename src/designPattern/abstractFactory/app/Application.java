package designPattern.abstractFactory.app;

import designPattern.abstractFactory.Factories.GUIFactory;
import designPattern.abstractFactory.buttons.Button;
import designPattern.abstractFactory.checkboxes.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
