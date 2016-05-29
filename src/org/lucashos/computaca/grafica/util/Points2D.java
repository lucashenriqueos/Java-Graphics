package org.lucashos.computaca.grafica.util;

public class Points2D {
	public float X, Y, W;

	public Points2D() {
		
	}
	
	public Points2D(float f, float g) {
		X = f;
		Y = g;
		W = 1;
	}
	
	public Points2D(float f, float g, float w) {
		X = f;
		Y = g;
		W = w;
	}


	@Override
	public String toString() {
		return "X: " + X + " Y: " + Y + ", W: " + W;
	}
}
