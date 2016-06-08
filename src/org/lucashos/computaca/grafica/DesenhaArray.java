package org.lucashos.computaca.grafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import javax.swing.JPanel;

import org.lucashos.computaca.grafica.util.Animacao;
import org.lucashos.computaca.grafica.util.Aresta;
import org.lucashos.computaca.grafica.util.Draw;
import org.lucashos.computaca.grafica.util.Geometria;
import org.lucashos.computaca.grafica.util.Modificadores;
import org.lucashos.computaca.grafica.util.Obj3D;
import org.lucashos.computaca.grafica.util.Points3D;

public class DesenhaArray extends JPanel{	
	private static final long serialVersionUID = 1L;
	Modificadores mod = new Modificadores();
	public List<Obj3D> objetos = new ArrayList<>();
	List<Geometria> geometrias = new ArrayList<>();
	Dimension Dim;
        Draw draw;    
    
    public DesenhaArray(){
    	atualizaDados("0.3","1.3", "17.0", "2000");
    	
    	/*try {
            CarregaObjetos();
        } catch (IOException e) {
            e.printStackTrace();
        } */   	
    }
    
    @Override
    public void paintComponent (Graphics g) {
    	super.paintComponent(g);
        g.setColor(Color.blue);
        setBackground(Color.black);
        Dim = getSize();
        draw = new Draw(Dim, g,10,10);
        
        draw.object3D(objetos, mod);
        //draw.geometry(geometrias);
    }
    
    public void iniciarAnimacao(){
        Obj3D obj = objetos.get(0);
        int i = 0;
        while(++i != 10){
            Animacao.rotX(obj, 90);
            repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void addGeometria(Geometria geometria){
        geometrias.add(geometria);
    }
    
    public void atualizaDados(String theta, String phi, String rho, String d){
    	mod.theta = (float)Double.parseDouble(theta);
    	mod.phi = (float)Double.parseDouble(phi);
    	mod.rho = (float)Double.parseDouble(rho);
    	mod.d = (float)Double.parseDouble(d);
    	
    	repaint();     
    }
    
    public void CarregaObjetos(JFrame frame) throws IOException
    {
    	FileDialog fd = new FileDialog(frame, "Escolha o arquivo", FileDialog.LOAD);
        fd.show();
        String path = fd.getDirectory() + fd.getFile();
        File file = new File(path);
        lerArquivo(file);
        repaint();
    }
    
    public void CarregaObjetos() throws IOException
    {
        File homedir = new File(System.getProperty("user.home"));
        File file = new File(homedir, "faculdade/Java-Graphics/objeto");
        lerArquivo(file);
        repaint();
    }
    
    private void lerArquivo(File file) throws IOException{
        String currentLine;
        Obj3D obj = new Obj3D();
        @SuppressWarnings("resource")
        BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file));
                while((currentLine = reader.readLine()) != null){                
                    if(currentLine.contains("nome")){
                        obj.nome = currentLine.replace("nome = ", "");
                        System.out.println(obj.nome);
                    }
                    else if(currentLine.contains("pontos")){
                        obj.qtdPontos= Integer.parseInt(currentLine.replace("pontos = ", ""));
                        System.out.println(obj.qtdPontos);
                    }
                    else if(currentLine.contains("arestas")){
                        obj.qtdArestas= Integer.parseInt(currentLine.replace("arestas = ", ""));
                        System.out.println(obj.qtdArestas);
                    }
                    else if (obj.qtdPontos > 0 && obj.qtdArestas == 0){
                        String[] pontos = currentLine.split(" ");
                        obj.coordMundo.add(new Points3D(Float.parseFloat(pontos[0]),Float.parseFloat(pontos[1]),Float.parseFloat(pontos[2])));
                    } else if(obj.qtdPontos > 0 && obj.qtdArestas > 0){
                        String[] arestas = currentLine.split(" ");
                        obj.arestas.add(new Aresta(Integer.parseInt(arestas[0]),Integer.parseInt(arestas[1])));
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DesenhaArray.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        for(int i = 0; i < objetos.size(); i++)
            if(objetos.get(i).nome.equals(obj.nome)){
                return;
            }
        objetos.add(obj);
        
    }

    public void addMod(double d, String id) {
        if(id.equals("d")){
            mod.d+=d;
        } else if (id.equals("rho")){
            mod.rho+=d;
        } else if (id.equals("phi")){
            mod.phi+=d;
        } else if (id.equals("theta")){
            mod.theta+=d;
        }
        repaint();
    }
    
    public void rmMod(double d, String id) {
        if(id.equals("d")){
            mod.d-=d;
        } else if (id.equals("rho")){
            mod.rho-=d;
        } else if (id.equals("phi")){
            mod.phi-=d;
        } else if (id.equals("theta")){
            mod.theta-=d;
        }
        repaint();
    }
    
    public Float getMod(String id) {
        if(id.equals("d")){
            return mod.d;
        } else if (id.equals("rho")){
            return mod.rho;
        } else if (id.equals("phi")){
            return mod.phi;
        } else if (id.equals("theta")){
            return mod.theta;
        }
        return (float) 0.;
    }
    
}