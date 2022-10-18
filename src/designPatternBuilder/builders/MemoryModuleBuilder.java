package designPatternBuilder.builders;

import designPatternBuilder.enums.DDRType;
import designPatternBuilder.interfaces.IMemoryModuleBuilder;
import designPatternBuilder.models.MemoryModule;

public class MemoryModuleBuilder implements IMemoryModuleBuilder {
	
	float frequency;
	Integer memory;
	DDRType ddrType;
	ComputerBuilder computerBuilder;
	
	public MemoryModule build() {
		return new MemoryModule(frequency, memory, ddrType);
	}
	
	public MemoryModuleBuilder setFrequency(float frequency) {
		this.frequency= frequency;
		return this;
	}
	
	public MemoryModuleBuilder setMemory(Integer memory) {
		this.memory= memory;
		return this;
	}
	
	public MemoryModuleBuilder setDdrType(DDRType ddrType) {
		this.ddrType= ddrType;
		return this;
	}

	public MemoryModuleBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public MemoryModuleBuilder() {
		
	}
	
	
	public ComputerBuilder and() {
		return this.computerBuilder;
	}
	
	
	
	
}
