package designPatternBuilder;

import java.util.ArrayList;
import java.util.List;

import designPatternBuilder.builders.ComputerBuilder;
import designPatternBuilder.builders.MemoryModuleBuilder;
import designPatternBuilder.enums.Chipset;
import designPatternBuilder.enums.Color;
import designPatternBuilder.enums.DDRType;
import designPatternBuilder.models.CentralProcessingUnit;
import designPatternBuilder.models.Computer;
import designPatternBuilder.models.MemoryModule;
import designPatternBuilder.models.Mouse;

public class App {
	
	public static void main(String[] args) {
		
		Mouse mouse= new Mouse(true, 2.5f, Color.Red);
		CentralProcessingUnit cpu= new CentralProcessingUnit(3.2f, Chipset.Intel, true, 8);
		MemoryModule memory1= new MemoryModule(4, 3200, DDRType.DDR4);
		MemoryModule memory2 = new MemoryModule(8, 3600, DDRType.DDR4);
		List<MemoryModule> memoryList= new ArrayList<>();
		memoryList.add(memory1);
		memoryList.add(memory2);
		
		Computer computer= new Computer(mouse, cpu,memoryList);
		
		
		ComputerBuilder computer1 = new ComputerBuilder();
		MemoryModuleBuilder memoryModuleBuilder= new MemoryModuleBuilder(computer1);
		MemoryModuleBuilder memoryModuleBuilder1= new MemoryModuleBuilder(computer1);
		
		computer1
			.setMouse()
					.setColor(Color.Red)
					.setWired(true)
					.setWireLength(2.5f);
					//.build();
							
		computer1
			.setCentralProcessingUnit()
				.setChipset(Chipset.Intel)	
				.setFrequency(3200)
				.setCoreCount(8);
				//.build();
		
		memoryModuleBuilder
					.setDdrType(DDRType.DDR4)
					.setMemory(4)
					.setFrequency(3200)
					.build();
		
		memoryModuleBuilder1
					.setDdrType(DDRType.DDR4)
					.setMemory(8)
					.setFrequency(3600)
					.build();
		
		//computer1.addMemoryModule(memoryModuleBuilder);
		//computer1.addMemoryModule(memoryModuleBuilder1);
		
		ComputerBuilder computer2 = new ComputerBuilder();
		
		//MemoryModuleBuilder memoryModuleBuilder2= new MemoryModuleBuilder(computer2);
		//MemoryModuleBuilder memoryModuleBuilder3= new MemoryModuleBuilder(computer2);
		
		computer2
			.setMouse()
				.setColor(Color.Red)
				.setWired(true)
				.setWireLength(2.5f)
				.and()
			.setCentralProcessingUnit()
				.setChipset(Chipset.Intel)	
				.setFrequency(3200)
				.setCoreCount(8)
				.and()
			.addMemoryModule()
				.setDdrType(DDRType.DDR4)
				.setMemory(4)
				.setFrequency(3200)
				.and()
			.addMemoryModule()
				.setDdrType(DDRType.DDR4)
				.setMemory(8)
				.setFrequency(3600)
				.and()
			.build();
					
	}

}
