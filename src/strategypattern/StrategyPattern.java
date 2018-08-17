package strategypattern;

import strategypattern.FormulaOne;
import strategypattern.Helicopter;
import strategypattern.Jet;
import strategypattern.StreetRacer;
import strategypattern.GoByFlying;

public class StrategyPattern {

    public static void main(String[] args) {
        FormulaOne formula = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();
        StreetRacer streetRacer = new StreetRacer();
        
        formula.go();
        helicopter.go();
        jet.go();
        streetRacer.go();
        
        jet.setGoAlgorithm(new GoByFlying());
        jet.go();
    }
}
