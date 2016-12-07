package IdleMonGame;

public class IdleMon {
	
	ConversionType CT;
	int catchCost;
	Double upkeepCost;
	Double conversionRate;
	Double conversionRatio;
	int level;
	Double upgradeCostRatio;
	int upgradeBenefitRatio;
	
	int getUpgradeCost(){
		
		Double costMultiplier = new Double(Math.pow(upgradeCostRatio, level));
		return (int)(catchCost * costMultiplier);
	}
	
	
}
