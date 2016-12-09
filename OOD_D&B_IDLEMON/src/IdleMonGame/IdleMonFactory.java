package IdleMonGame;

import java.util.Map;

//used for producing idlemon
//keeps track of how many there are
public class IdleMonFactory {
	
	int capturesPerSpecies;
	int allowedCaptures;
	int totalCaptured;
	//map of types to how many are captured of each
	Map<String, Integer> capturedTypes;
	
	ConversionTypeFactory CTF;
	
	public IdleMonFactory(int CPS, int AC){
		capturesPerSpecies = CPS;
		allowedCaptures = AC;
		CTF = new ConversionTypeFactory();
	}
	
	public IdleMon getIdleMon(String IdleMonType, Integer colorType){
		//check to see if we can capture another idleMon
		String id = IdleMonType + colorType.toString();
		if(capturedTypes.containsKey(id)){
			if(capturedTypes.get(id) >= capturesPerSpecies){
				return null;
			}
		}
		if(totalCaptured >= allowedCaptures){
			return null;
		}
		if(IdleMonType == "Basic"){
			IdleMon im =  new IdleMon_Basic(CTF.getConversionType(colorType));
			//add this idlemon to capturedTypes map
			if(capturedTypes.containsKey(id)){
				capturedTypes.replace(id, capturedTypes.get(id)+1);
			}else{
				capturedTypes.put(id, 1);
			}
			totalCaptured +=1;
			return im;
		}
		
		return null;
	}
}
