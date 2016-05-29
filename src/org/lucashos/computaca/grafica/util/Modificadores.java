package org.lucashos.computaca.grafica.util;

public class Modificadores implements Cloneable{
	
	public Modificadores getClone(){
		try{
			return (Modificadores) this.clone();			
		}
		catch(Exception e){
			throw new RuntimeException("Erro de Clonagem");			
		}
	}

	public float rho, phi, theta, d;
	
	
}
