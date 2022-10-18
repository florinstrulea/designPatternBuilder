package designPatternBuilder.models;

import designPatternBuilder.enums.Color;

public class Mouse {

	boolean rgb;
	boolean wired;
	float wireLength;
	Color color;
	
	public boolean isRgb() {
		return rgb;
	}
	public boolean isWired() {
		return wired;
	}
	public float getWireLength() {
		return wireLength;
	}
	public Color getColor() {
		return color;
	}
	
	public Mouse(boolean rgb, boolean wired, float wireLength, Color color) {
		super();
		this.rgb = rgb;
		this.wired = wired;
		this.wireLength = wireLength;
		this.color = color;
	}
	public Mouse(boolean wired, float wireLength, Color color) {
		super();
		this.wired = wired;
		this.wireLength = wireLength;
		this.color = color;
	}
	
	
	
	
	
	
}
