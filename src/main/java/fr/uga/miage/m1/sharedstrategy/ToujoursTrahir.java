package fr.uga.miage.m1.sharedstrategy;


public class ToujoursTrahir implements IStrategy {
    public StrategyChoice execute(StrategyExecutionData Data) { 
        return StrategyChoice.DEFECT;
    }
    
    public String getFullName() {
    	return "Toujours Trahir";
    }
    
    public String getUniqueId() {
        return "TRAHIR";
    }
}