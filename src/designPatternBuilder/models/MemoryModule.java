package designPatternBuilder.models;

import designPatternBuilder.enums.DDRType;

public class MemoryModule {
	
	float frequency;
	Integer memory;
	DDRType ddrType;
	
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public Integer getMemory() {
		return memory;
	}
	public void setMemory(Integer memory) {
		this.memory = memory;
	}
	public DDRType getDdrType() {
		return ddrType;
	}
	public void setDdrType(DDRType ddrType) {
		this.ddrType = ddrType;
	}
	
	public MemoryModule(float frequency, Integer memory, DDRType ddrType) {
		super();
		this.frequency = frequency;
		this.memory = memory;
		this.ddrType = ddrType;
	}
	
	
	
	


}
