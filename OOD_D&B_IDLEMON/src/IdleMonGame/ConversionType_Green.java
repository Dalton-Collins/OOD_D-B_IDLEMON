package IdleMonGame;

public class ConversionType_Green implements ConversionType{
	//Converts Water to Grass
	//give a conversion object to an idlemon so it can convert resources
		@Override
		public String getColor() {
			return "Green";
		}
		public int getType(){
			return 1;
		}
		@Override
		public void convertResources(Double conversionRate, Double conversionRatio, World w) {
			if(w.resources.get(1) >= conversionRate){
				Double toConvert = conversionRate * conversionRatio;
				w.resources.set(1, (int) (w.resources.get(1) - conversionRate));
				w.resources.set(0, (int) (w.resources.get(0) + toConvert));
			}
		}
}
