package designPatternBuilder.interfaces;

import designPatternBuilder.builders.ComputerBuilder;
import designPatternBuilder.enums.DDRType;

public interface IMemoryModuleBuilder {
	
	public IMemoryModuleBuilder setFrequency(float frequency); 
	
	public IMemoryModuleBuilder setMemory(Integer memory); 
	
	public IMemoryModuleBuilder setDdrType(DDRType ddrType); 
		
	public ComputerBuilder and();
}
