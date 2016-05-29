package org.lucashos.computaca.grafica;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

import org.lucashos.computaca.grafica.util.Draw;
import org.lucashos.computaca.grafica.util.Points2D;

public class ManySquares extends Canvas {
	private static final long serialVersionUID = 1L;

	Dimension Dim;
	Draw draw;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.add(new ManySquares());
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		Dim = getSize();
		draw = new Draw(Dim, g);
		drawSquares(200);
	}

	public void drawSquares(float lado) {
		Points2D A, B, C, D, A1, B1, C1, D1;
		float q = 0.5F, p = 1 - q, distX = -400, distY = -400;
		lado = lado / 2;

		for (int j = 1; j <= 8; j++) {
			for (int k = 1; k <= 8; k++) {
				A = new Points2D(distX, distY);
				B = new Points2D(distX, distY + lado);
				C = new Points2D(distX + lado, distY + lado);
				D = new Points2D(distX + lado, distY);

				draw.line(A, B);
				draw.line(B, C);
				draw.line(C, D);
				draw.line(D, A);

				for (int i = 1; i < 10; i++) {
					A1 = new Points2D(p * A.X + q * B.X, p * A.Y + q * B.Y);
					B1 = new Points2D(p * B.X + q * C.X, p * B.Y + q * C.Y);
					C1 = new Points2D(p * C.X + q * D.X, p * C.Y + q * D.Y);
					D1 = new Points2D(p * D.X + q * A.X, p * D.Y + q * A.Y);

					draw.line(A1, B1);
					draw.line(B1, C1);
					draw.line(C1, D1);
					draw.line(D1, A1);

					A = A1;
					B = B1;
					C = C1;
					D = D1;
				}

				distX = distX + lado;
			}
			distX = -400;
			distY = distY + lado;
		}
	}

}
