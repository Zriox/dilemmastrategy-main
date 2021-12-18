package fr.uga.miage.m1.sharedstrategy;

import java.util.Random;
import fr.uga.miage.m1.sharedstrategy.*;

class ToujoursCooperer implements IStrategy { 
    public StrategyChoice execute(StrategyExecutionData Data) { 
        return StrategyChoice.COOPERATE;
    }
    
    public String getFullName() {
    	return "Toujours Coop�rer";
    }
    
    public String getUniqueId() {
        return "COOPERER";
    }
} 



