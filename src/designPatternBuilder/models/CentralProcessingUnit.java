package designPatternBuilder.models;

import designPatternBuilder.enums.Chipset;

public class CentralProcessingUnit {

	float frequency;
	Chipset chipset; 
	boolean hyperthreading ;
	Integer coreCount;
	
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public Chipset getChipset() {
		return chipset;
	}
	public void setChipset(Chipset chipset) {
		this.chipset = chipset;
	}
	public boolean isHyperthreading() {
		return hyperthreading;
	}
	public void setHyperThreading(boolean hyperthreading) {
		this.hyperthreading = hyperthreading;
	}
	public Integer getCoreCount() {
		return coreCount;
	}
	public void setCoreCount(Integer coreCount) {
		this.coreCount = coreCount;
	}
	
	public CentralProcessingUnit(float frequency, Chipset chipset, boolean hyperthreading, Integer coreCount) {
		super();
		this.frequency = frequency;
		this.chipset = chipset;
		this.hyperthreading = hyperthreading;
		this.coreCount = coreCount;
	}
	public CentralProcessingUnit(float frequency, Chipset chipset, Integer coreCount) {
		super();
		this.frequency = frequency;
		this.chipset = chipset;
		this.coreCount = coreCount;
	}
	
	
	
	
	
	

}
