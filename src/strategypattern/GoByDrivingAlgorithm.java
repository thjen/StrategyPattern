package strategypattern;

import strategypattern.GoAlgorithm;

public class GoByDrivingAlgorithm implements GoAlgorithm {

    @Override
    public void go() {
        System.out.println("Now i'm driving");
    }
}
