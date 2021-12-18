package fr.uga.miage.m1.sharedstrategy;

import java.util.Random;
import fr.uga.miage.m1.sharedstrategy.*;

class ToujoursTrahir implements IStrategy { 
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