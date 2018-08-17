package strategypattern;

import strategypattern.Vehicle;
import strategypattern.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle {
    public StreetRacer() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
