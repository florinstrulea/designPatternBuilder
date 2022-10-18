package designPatternBuilder.models;

import java.util.List;

public class Computer {

	Mouse mouse;
	CentralProcessingUnit cpu;
	List<MemoryModule> memoryModules;
	
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public CentralProcessingUnit getCpu() {
		return cpu;
	}
	public void setCpu(CentralProcessingUnit cpu) {
		this.cpu = cpu;
	}
	public List<MemoryModule> getMemoryModules() {
		return memoryModules;
	}
	public void setMemoryModules(List<MemoryModule> memoryModules) {
		this.memoryModules = memoryModules;
	}
	public Computer(Mouse mouse, CentralProcessingUnit cpu, List<MemoryModule> memoryModules) {
		super();
		this.mouse = mouse;
		this.cpu = cpu;
		this.memoryModules = memoryModules;
	}
	
	
	

}
