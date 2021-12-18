package fr.uga.miage.m1.sharedstrategy;

import java.util.Random;
import fr.uga.miage.m1.sharedstrategy.*;

public class ToujoursCooperer implements IStrategy {
    public StrategyChoice execute(StrategyExecutionData Data) { 
        return StrategyChoice.COOPERATE;
    }
    
    public String getFullName() {
    	return "Toujours Coopérer";
    }
    
    public String getUniqueId() {
        return "COOPERER";
    }
} 



