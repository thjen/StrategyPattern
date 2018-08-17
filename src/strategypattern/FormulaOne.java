package strategypattern;

import strategypattern.Vehicle;
import strategypattern.GoByDrivingAlgorithm;

public class FormulaOne extends Vehicle {
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
