package org.lucashos.computaca.grafica.util;

public class Transformers {

	public Transformers() {
		
	}
	//matriz de rota��o R: 	P' = R * P
	//	cos(ang) 	-sen(ang)	0
	//	sen(ang)	cos(ang)	0
	//	0		0		1
	public static Points2D rotacao(Points2D ponto, float ang /*em graus*/){
		//c�digo aqui
		return ponto;
	}
	
	//matriz de translacao T: 	P' = T * P
		//	1 	0	dx
		//	0	1	dy
		//	0	0	1
	public static Points2D translacao(Points2D ponto, float dx, float dy){
		//c�digo aqui
		return ponto;
	}
		
	//matriz de escala E: 	P' = E * P
	//	sx 	0	0
	//	0	sy	0
	//	0	0	1
	public static Points2D escala(Points2D ponto, float sx, float sy){
		//c�digo aqui
		return ponto;
	}


}
