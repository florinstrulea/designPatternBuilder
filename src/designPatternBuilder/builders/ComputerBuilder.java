package designPatternBuilder.builders;

import java.util.ArrayList;
import java.util.List;

import designPatternBuilder.interfaces.ICentralProcessingUnitBuilder;
import designPatternBuilder.interfaces.IMemoryModuleBuilder;
import designPatternBuilder.interfaces.IMouseBuilder;
import designPatternBuilder.models.Computer;
import designPatternBuilder.models.MemoryModule;

public class ComputerBuilder {
	
	public MouseBuilder mouseBuilder;
	public CentralProcessingUnitBuilder centralProcessingUnitBuilder;
	public List<MemoryModuleBuilder> memoryModuleBuilders;
	
	public ComputerBuilder() {
		this.mouseBuilder= new MouseBuilder(this);
		this.centralProcessingUnitBuilder= new CentralProcessingUnitBuilder(this);
		this.memoryModuleBuilders= new ArrayList<MemoryModuleBuilder>();
	} 
	
	public Computer build() {
		List<MemoryModule> memoryModules= new ArrayList<>();
		for(MemoryModuleBuilder elem: memoryModuleBuilders ) {
			memoryModules.add(elem.build());
		}
		return new Computer(mouseBuilder.build(), centralProcessingUnitBuilder.build(), memoryModules);
	}

	public IMouseBuilder setMouse() {
		
		return mouseBuilder;
	}

	public ICentralProcessingUnitBuilder setCentralProcessingUnit() {
		
		return centralProcessingUnitBuilder;
	}

	public IMemoryModuleBuilder addMemoryModule() {
		MemoryModuleBuilder memoryModuleBuilder= new MemoryModuleBuilder(this);
		this.memoryModuleBuilders.add(memoryModuleBuilder);
		return memoryModuleBuilder;
	}

	
	
	
	
	

}
