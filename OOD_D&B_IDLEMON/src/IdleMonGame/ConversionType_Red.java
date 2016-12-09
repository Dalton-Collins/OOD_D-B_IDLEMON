package IdleMonGame;

public class ConversionType_Red implements ConversionType{
	//Converts Grass to Flames
	//give a conversion object to an idlemon so it can convert resources
		@Override
		public String getColor() {
			return "Red";
		}
		public int getType(){
			return 0;
		}
		@Override
		public void convertResources(Double conversionRate, Double conversionRatio, World w) {
			if(w.resources.get(0) >= conversionRate){
				Double toConvert = conversionRate * conversionRatio;
				w.resources.set(0, (int) (w.resources.get(0) - conversionRate));
				w.resources.set(2, (int) (w.resources.get(2) + toConvert));
			}
		}
}
