package org.lucashos.computaca.grafica.util;

public class Transformers {

	public Transformers() {
		
	}
	//matriz de rotação R: 	P' = R * P
	//	cos(ang) 	-sen(ang)	0
	//	sen(ang)	cos(ang)	0
	//	0		0		1
	public static Points2D rotacao(Points2D ponto, float ang /*em graus*/){
		//código aqui
		return ponto;
	}
	
	//matriz de translacao T: 	P' = T * P
		//	1 	0	dx
		//	0	1	dy
		//	0	0	1
	public static Points2D translacao(Points2D ponto, float dx, float dy){
		//código aqui
		return ponto;
	}
		
	//matriz de escala E: 	P' = E * P
	//	sx 	0	0
	//	0	sy	0
	//	0	0	1
	public static Points2D escala(Points2D ponto, float sx, float sy){
		//código aqui
		return ponto;
	}


}
