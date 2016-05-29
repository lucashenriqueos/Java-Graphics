package org.lucashos.computaca.grafica;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

import org.lucashos.computaca.grafica.util.Conversor;
import org.lucashos.computaca.grafica.util.Draw;
import org.lucashos.computaca.grafica.util.Points2D;

public class EquilateralTriangle extends Canvas {
	
	private static final long serialVersionUID = 1L;
	
	Dimension d;
	Conversor conv;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new EquilateralTriangle());
		frame.setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		d = getSize();
		Draw draw = new Draw(d,g);
		setBackground(Color.black);		
		g.setColor(Color.green);		
		
		float 	distanciaBase = 0,
				a = 130F, 
				b = 280F,
				lado = a - b,
				meio = a - lado / 2,
				altura = (float) (Math.sqrt(3) * lado /2);
		
		Points2D A = new Points2D(a, altura);
		Points2D B = new Points2D(b, altura);
		Points2D C = new Points2D(meio, distanciaBase);
		
		draw.line(A, B);
		draw.line(B, C);
		draw.line(A, C);
	}
}
