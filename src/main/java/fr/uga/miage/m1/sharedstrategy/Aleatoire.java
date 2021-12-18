package fr.uga.miage.m1.sharedstrategy;

import java.util.Random;


public class Aleatoire implements IStrategy {
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