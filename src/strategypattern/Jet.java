package strategypattern;

import strategypattern.Vehicle;
import strategypattern.GoByFlyingFast;

public class Jet extends Vehicle {
    public Jet() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}
