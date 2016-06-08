package org.lucashos.computaca.grafica.util;

public class Animacao {    
    public static void rotX(Obj3D obj, double ang)
    {
        float cos = (float)Math.cos(ang),
                sen = (float)Math.sin(ang);
        
        for (int i = 0; i < obj.coordMundo.size(); i++){
            Points3D p = obj.coordMundo.get(i);
            
            float y = p.Y;
            float z = p.Z;
            
            p.Y = y * cos - z * sen;
            p.Y = y * sen + z * cos;
        }
    }    
}
