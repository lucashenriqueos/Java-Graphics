package org.lucashos.computaca.grafica.util;

import java.awt.Dimension;

public class Conversor {
	
	Double maxX, maxY, maxXY, centerX, centerY, pixelSize;	
		
	public Conversor(Dimension d) {
		this.maxX = d.getWidth() - 1;
		this.maxY = d.getHeight() - 1;
		centerX = maxX / 2;
		centerY = maxY / 2;
		pixelSize = null;
	}
	
	public Conversor(Dimension d, float rWidth, float rHeight) {
		this.maxX = d.getWidth() - 1;
		this.maxY = d.getHeight() - 1;
		centerX = maxX / 2;
		centerY = maxY / 2;
		pixelSize = Math.max(rWidth / maxY, rHeight / maxX);	
	}
	
	public int i3DX(float x) { return (int) Math.round(centerX + x); }

	public int i3DY(float y) { return (int) Math.round(centerY - y); }

	public int ix(float a){
		if(pixelSize == null){
			return  (int) (centerX + Math.round(a));
		}
		else
		{
			return (int) (centerX + Math.round(a / pixelSize));
		}
	}
	
	public int iy(float a){
		if(pixelSize == null){
			return  (int) (centerY - Math.round(a));
		}
		else
		{
			return (int) (centerY - Math.round(a / pixelSize));
		}		
	}
}
