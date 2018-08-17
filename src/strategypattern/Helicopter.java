package strategypattern;

import strategypattern.Vehicle;
import strategypattern.GoByFlying;

public class Helicopter extends Vehicle {
    public Helicopter() {
        setGoAlgorithm(new GoByFlying());
    }
}
