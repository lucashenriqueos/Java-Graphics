package org.lucashos.computaca.grafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.lucashos.computaca.grafica.util.Aresta;
import org.lucashos.computaca.grafica.util.Draw;
import org.lucashos.computaca.grafica.util.Geometria;
import org.lucashos.computaca.grafica.util.Modificadores;
import org.lucashos.computaca.grafica.util.Obj3D;
import org.lucashos.computaca.grafica.util.Points3D;

public class DesenhaArray extends JPanel{	
	private static final long serialVersionUID = 1L;
	Modificadores current = new Modificadores();
	Modificadores mod = new Modificadores();
	public List<Obj3D> objetos = new ArrayList<>();
	List<Geometria> geometrias = new ArrayList<>();
	Dimension Dim;
    Draw draw;    
    
    public DesenhaArray(){
    	atualizaDados("0.3","1.3", "17.0", "2000");
    	CarregaObjetos();    	
    }
    
    @Override
    public void paintComponent (Graphics g) {
    	super.paintComponent(g);
        g.setColor(Color.blue);
        setBackground(Color.black);
        Dim = getSize();
        draw = new Draw(Dim, g,10,10);
        
        draw.object3D(objetos, current);
        //draw.geometry(geometrias);
    }
    
    public void addGeometria(Geometria geometria){
        geometrias.add(geometria);
    }
    
    public void atualizaDados(String theta, String phi, String rho, String d){
    	current = mod.getClone();
    	System.out.println("Atualiza!!!!");
    	mod.theta = (float)Double.parseDouble(theta);
    	mod.phi = (float)Double.parseDouble(phi);
    	mod.rho = (float)Double.parseDouble(rho);
    	mod.d = (float)Double.parseDouble(d);
    	
    	repaint();
    	
        
    }
    
    private void CarregaObjetos()
    {
    	Obj3D obj = new Obj3D();
    	obj.coordMundo.add(new Points3D( 1, -1, -1));
    	obj.coordMundo.add(new Points3D( 1, 1, -1));
		obj.coordMundo.add(new Points3D(-1, 1, -1));
		obj.coordMundo.add(new Points3D(-1, -1, -1));
		obj.coordMundo.add(new Points3D( 1, -1, 1));
		obj.coordMundo.add(new Points3D( 1, 1, 1));
		obj.coordMundo.add(new Points3D(-1, 1, 1));
		obj.coordMundo.add(new Points3D(-1, -1, 1));
		// Arestas horizontais da base:
		obj.arestas.add(new Aresta(0, 1));
		obj.arestas.add(new Aresta(1, 2));
		obj.arestas.add(new Aresta(2, 3));
		obj.arestas.add(new Aresta(3, 0));
		// Arestas horizontais do topo:
		obj.arestas.add(new Aresta(4, 5));
		obj.arestas.add(new Aresta(5, 6));
		obj.arestas.add(new Aresta(6, 7));
		obj.arestas.add(new Aresta(7, 4));
		// Arestas verticais:
		obj.arestas.add(new Aresta(0, 4));
		obj.arestas.add(new Aresta(1, 5));
		obj.arestas.add(new Aresta(2, 6));
		obj.arestas.add(new Aresta(3, 7));
		objetos.add(obj);
    }
}