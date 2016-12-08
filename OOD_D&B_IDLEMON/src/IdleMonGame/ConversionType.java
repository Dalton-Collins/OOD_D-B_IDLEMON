package IdleMonGame;

public interface ConversionType {
	//This changes the color and conversions
	//of the idlemon
	String getColor();
	int getType();
	void convertResources(Double conversionRate, Double conversionRatio, World w);
}
