package designPatternBuilder.interfaces;

import designPatternBuilder.builders.ComputerBuilder;
import designPatternBuilder.enums.Chipset;

public interface ICentralProcessingUnitBuilder {
	
	public ICentralProcessingUnitBuilder setFrequency(float frequency); 
	
	public ICentralProcessingUnitBuilder setChipset(Chipset chipset);
	
	public ICentralProcessingUnitBuilder setHyperThreading(boolean hyperthreading);
	
	public ICentralProcessingUnitBuilder setCoreCount(Integer coreCount); 

	public ComputerBuilder and();

}
