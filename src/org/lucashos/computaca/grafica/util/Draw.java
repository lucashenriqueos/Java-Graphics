package org.lucashos.computaca.grafica.util;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

public class Draw extends Canvas {
    private static final long serialVersionUID = 1L;

    Conversor convert;
    Graphics g;
    Points2D current = new Points2D();
    Aresta atual = new Aresta();

    public Draw(Dimension D, Graphics g){
            this.convert = new Conversor(D);
            this.g = g;
    }

    public Draw(Dimension D, Graphics g, float rWidth, float rHeight){
            this.convert = new Conversor(D,rWidth,rHeight);
            this.g = g;
    }


    /*public void line(Points2D From, Points2D To){
            g.drawLine(convert.ix(From.X), convert.iy(From.Y), convert.ix(To.X), convert.iy(To.Y));
    }*/
    
    public void line(Points2D From, Points2D To){
    g.drawLine(convert.i3DX(From.X), convert.i3DY(From.Y), convert.i3DX(To.X), convert.i3DY(To.Y));
	}

    public void vector(Vector V){
            line(V.A, V.B);
    }

    public void points(List<Points2D> pontos){		
        for (int i = 0; i < pontos.size()-1; ){
                line(pontos.get(i),pontos.get(++i));
                if(i == pontos.size()-1){
                        line(pontos.get(i),pontos.get(0));
                }
        }		
    }
    
    public void moveTo(Aresta target){
        atual = target;
    }

    public void geometry(List<Geometria> geometrias) {
       geometrias.forEach(geometria ->{
           points(geometria.getPoints());
       });
    }
    
    public void object3D (List<Obj3D> objetos, Modificadores mod){
    	objetos.forEach(objeto -> {
    		Manipula.perspectiva(objeto, mod.theta, mod.phi, mod.rho, mod.d);
    		objeto.arestas.forEach(aresta -> {
    			System.out.println(objeto.coordPersp.get(aresta.X));
    			line(objeto.coordPersp.get(aresta.X),objeto.coordPersp.get(aresta.Y));
    		});
    	});
    }		
}
