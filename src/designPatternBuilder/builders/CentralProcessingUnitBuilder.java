package designPatternBuilder.builders;

import designPatternBuilder.enums.Chipset;
import designPatternBuilder.interfaces.ICentralProcessingUnitBuilder;
import designPatternBuilder.models.CentralProcessingUnit;

public class CentralProcessingUnitBuilder implements ICentralProcessingUnitBuilder {
	
	public float frequency;
	public Chipset chipset; 
	public boolean hyperthreading ;
	public Integer coreCount;
	ComputerBuilder computerBuilder;
	
	public CentralProcessingUnit build() {
		return new CentralProcessingUnit(this.frequency, this.chipset, this.hyperthreading, this.coreCount);
	}
	
	
	public CentralProcessingUnitBuilder setFrequency(float frequency) {
		this.frequency= frequency;
		return this;
	}
	
	public CentralProcessingUnitBuilder setChipset(Chipset chipset) {
		this.chipset= chipset;
		return this;
	}
	
	public CentralProcessingUnitBuilder setHyperThreading(boolean hyperthreading) {
		this.hyperthreading= hyperthreading;
		return this;
	}
	
	public CentralProcessingUnitBuilder setCoreCount(Integer coreCount) {
		this.coreCount= coreCount;
		return this;
	}


	public CentralProcessingUnitBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public ComputerBuilder and() {
		
		return this.computerBuilder;
	}
	
	

}
