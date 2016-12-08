package IdleMonGame;

public class ConversionType_Blue implements ConversionType{
	//Converts Flame to Water
	//give a conversion object to an idlemon so it can convert resources
	@Override
	public String getColor() {
		return "Blue";
	}
	public int getType(){
		return 2;
	}
	@Override
	public void convertResources(Double conversionRate, Double conversionRatio, World w) {
		if(w.resources.get(2) >= conversionRate){
			Double toConvert = conversionRate * conversionRatio;
			w.resources.set(2, (int) (w.resources.get(2) - conversionRate));
			w.resources.set(1, (int) (w.resources.get(1) + toConvert));
		}
	}

}
