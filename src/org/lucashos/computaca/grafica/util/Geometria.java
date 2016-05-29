/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lucashos.computaca.grafica.util;

import java.util.ArrayList;
import java.util.List;
import org.lucashos.computaca.grafica.util.Points2D;

/**
 *
 * @author Lucashos
 */
public class Geometria {
    String nome;
    List<Points2D> pontos2D = new ArrayList<>();
    
    public Geometria(String nome){
        this.nome = nome;
    }
    
    public void setPontos(String X, String Y){
        String[] pontosX = X.split(" ");
        String[] pontosY = Y.split(" ");
        
        if(pontosX.length == pontosY.length){
            for(int i = 0; i < pontosX.length; i++){
                Points2D point = new Points2D(Float.parseFloat(pontosX[i]), Float.parseFloat(pontosY[i]));
                pontos2D.add(point);
            }
        }        
    }
    
    public List<Points2D> getPoints(){
        return pontos2D;
    }

	public void printString(){
    	pontos2D.forEach(p -> {
    		p.toString();
    	});
    }
}
