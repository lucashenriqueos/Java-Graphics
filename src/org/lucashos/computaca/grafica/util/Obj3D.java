package org.lucashos.computaca.grafica.util;

import java.util.ArrayList;
import java.util.List;

public class Obj3D {
    public String nome;
    public Integer qtdPontos;
    public Integer qtdArestas;
	public List<Points2D> coordPersp = new ArrayList<>();
    public List<Points3D> coordMundo = new ArrayList<>();
    public List<Aresta> arestas = new ArrayList<>();

    public Obj3D() {
        this.qtdPontos = 0;
        this.qtdArestas = 0;
    }
    
}
