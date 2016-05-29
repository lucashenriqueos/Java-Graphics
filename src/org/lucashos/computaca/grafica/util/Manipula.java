package org.lucashos.computaca.grafica.util;

public class Manipula {

	public static void perspectiva(Obj3D obj, float theta, float phi, float rho, float d)
    {
	    float costh = (float) Math.cos(theta),	
	    sinth = (float) Math.sin(theta),	
	    cosph = (float) Math.cos(phi),	
	    sinph = (float) Math.sin(phi);	
	    float v11 = -sinth, v12 = -cosph * costh, v13 = sinph * costh;	
	    float v21 = costh, v22 = -cosph * sinth, v23 = sinph * sinth;	
	    float v32 = sinph;	
	    float v33 = cosph, v43 = -rho;	
	    obj.coordPersp.clear();	
	    for(int i=0; i < obj.coordMundo.size(); i++)
	    {
	    	Points3D p = obj.coordMundo.get(i);
	    	float x = v11 * p.X + v21 * p.Y,	
	    			y = v12 * p.X + v22 * p.Y + v32 * p.Z,	
	    			z = v13 * p.X + v23 * p.Y + v33 * p.Z + v43;	
	    	obj.coordPersp.add(new Points2D(-d * x / z, -d * y / z));
	
	    }
	
	 }
}
