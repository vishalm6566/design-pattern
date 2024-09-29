package designPattern.builders;

import designPattern.builders.cars.CarType;
import designPattern.builders.components.Engine;
import designPattern.builders.components.GPSNavigator;
import designPattern.builders.components.Transmission;
import designPattern.builders.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
