package designPatternBuilder.builders;

import designPatternBuilder.enums.Color;
import designPatternBuilder.interfaces.IMouseBuilder;
import designPatternBuilder.models.Mouse;

public class MouseBuilder implements IMouseBuilder {
	
	public boolean rgb=true ;
	public boolean wired= false ;
	public float wireLength =2f;
	public Color color=Color.Black;
	public ComputerBuilder computerBuilder;
	
	
	public Mouse build() {
		return new Mouse(this.rgb, this.wired, this.wireLength, this.color);
	}


	public IMouseBuilder setRgb(boolean rgb) {
		this.rgb= rgb;
		return this;
	}
	
	public IMouseBuilder setWired(boolean wired) {
		this.wired= wired;
		return this;
	}
	
	
	public IMouseBuilder setWireLength(float wireLength) {
		this.wireLength= wireLength;
		return this;
	}
	
	public IMouseBuilder setColor(Color color) {
		this.color= color;
		return this;
	}


	public MouseBuilder(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public ComputerBuilder and() {
		return this.computerBuilder;
	}
	
	
	


}
