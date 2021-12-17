package fr.uga.miage.m1.sharedstrategy;

import java.util.Random;
import fr.uga.miage.m1.sharedstrategy.*;


class Aleatoire implements IStrategy { 
	private Random rand = new Random();
	
	public StrategyChoice execute(StrategyExecutionData Data) { 
    	if (rand.nextInt(2) == 1) {
			return StrategyChoice.COOPERATE;
		}
		else {
			return StrategyChoice.DEFECT;
		}
    }
	
    public String getFullName() {
    	return "Aleatoire";
    }
    
    public String getUniqueId() {
        return "ALEATOIRE";
    }
}

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



