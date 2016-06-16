package org.lucashos.computaca.grafica.util;

public class Points3D {
	public float X, Y, Z, W;        

	public Points3D() {
		
	}
	
	public Points3D(float f, float g, float h) {
		X = f;
		Y = g;
                Z = h;
		W = 1;
	}
	
	public Points3D(float f, float g, float h, float w) {
		X = f;
		Y = g;
        Z = h;
		W = w;
	}


	@Override
	public String toString() {
		return "X: " + X + " Y: " + Y + ", Z: " + Z + ", W: " + W;
	}
}
