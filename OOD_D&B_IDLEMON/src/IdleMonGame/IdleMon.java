package IdleMonGame;

public class IdleMon {
	//Id for this type of idlemon (basic)
	String id;
	//What resources are converted
	ConversionType CT;
	//cost of cathcing this idlemon
	int catchCost;
	//cost of keeping this idlemon
	Double upkeepCost;
	//How many resources are converted each time
	Double conversionRate;
	//how many more resources are made compared to used
	Double conversionRatio;
	//how strong is the idlemon(used in calculating conversionRate)
	int level;
	//Cost ratio of upgrading the idlemon to the next level
	Double upgradeCostRatio;
	//conversion rate gained per upgrade
	int upgradeBenefit;
	
	int getUpgradeCost(){
		
		Double costMultiplier = new Double(Math.pow(upgradeCostRatio, level));
		return (int)(catchCost * costMultiplier);
	}
	void upgrade(World w){
		int resource = w.resources.get(CT.getType());
		int upgradeCost = getUpgradeCost();
		if(resource >= upgradeCost){
			w.resources.set(CT.getType(), resource - upgradeCost);
			conversionRate = conversionRate + upgradeBenefit;
		}else{
			System.out.println("Not enough resources to upgrade");
		}
	}
	
}
