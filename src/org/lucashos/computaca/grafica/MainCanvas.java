package org.lucashos.computaca.grafica;

import javax.swing.JFrame;

public class MainCanvas {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		//frame.add(new DesenhaArray());
		frame.setVisible(true);
	}
}