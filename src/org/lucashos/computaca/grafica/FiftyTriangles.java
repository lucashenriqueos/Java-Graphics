package org.lucashos.computaca.grafica;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

import org.lucashos.computaca.grafica.util.Conversor;
import org.lucashos.computaca.grafica.util.Draw;
import org.lucashos.computaca.grafica.util.Points2D;


public class FiftyTriangles extends Canvas {
	private static final long serialVersionUID = 1L;
	
	Dimension Dim;
	Draw draw;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.add(new FiftyTriangles());
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		setBackground(Color.black);
		g.setColor(Color.green);
		Dim = getSize();
		draw = new Draw(Dim, g);
		drawTriangles(400, g);
	}

	
	public void drawTriangles(float lado, Graphics g){
		float 	h = (float) Math.sqrt(3) * lado / 2,
				q = 0.03F,
				p = 1 - q;		
		Points2D A, B, C, A1,B1,C1;		
		lado = lado/2;
		
		A = new Points2D(-lado, lado-lado);		
		B = new Points2D(lado, lado-lado);
		C = new Points2D(lado - lado,h);
		
		draw.line(A, B);
		draw.line(B, C);	
		draw.line(C, A);
		
		for (int i = 0; i <= 50; i++){	
			A1 = new Points2D(p * A.X + q * B.X, p * A.Y + q * B.Y);
			B1 = new Points2D(p * B.X + q * C.X, p * B.Y + q * C.Y);
			C1 = new Points2D(p * C.X + q * A.X, p * C.Y + q * A.Y);
			
			draw.line(A1, B1);
			draw.line(B1, C1);	
			draw.line(C1, A1);
			
			A = A1;
			B = B1;
			C = C1;
		}		
	}	
}
