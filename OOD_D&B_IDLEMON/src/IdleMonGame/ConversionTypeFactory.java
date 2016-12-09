package IdleMonGame;

public class ConversionTypeFactory {
	public ConversionType getConversionType(Integer type){
		if(type == 0){
			return new ConversionType_Green();
		} else if(type == 1){
			return new ConversionType_Blue();
		} else if(type == 2){
			return new ConversionType_Red();
		} else{
			return null;
		}
	}
}
