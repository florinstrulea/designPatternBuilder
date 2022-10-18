package designPatternBuilder.interfaces;

import designPatternBuilder.builders.ComputerBuilder;
import designPatternBuilder.enums.Color;

public interface IMouseBuilder {

	public IMouseBuilder setRgb(boolean rgb); 
	
	public IMouseBuilder setWired(boolean wired);
	
	public IMouseBuilder setWireLength(float wireLength);
	
	public IMouseBuilder setColor(Color color);
	
	public ComputerBuilder and();
}
