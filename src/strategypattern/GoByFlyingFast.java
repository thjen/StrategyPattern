package strategypattern;

import strategypattern.GoAlgorithm;

public class GoByFlyingFast implements GoAlgorithm {

    @Override
    public void go() {
        System.out.println("Now i'm flying fast");
    }
}
