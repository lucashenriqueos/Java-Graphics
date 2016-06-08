package org.lucashos.computaca.grafica.util;

public class Animacao {    
    public static void rotX(Obj3D obj, double ang)
    {
        double rad = (ang * Math.PI) / 180;
        float cos = (float)Math.cos(rad),
                sen = (float)Math.sin(rad);
        
        for (int i = 0; i < obj.coordMundo.size(); i++){
            Points3D p = obj.coordMundo.get(i);
            
            float y = p.Y;
            float z = p.Z;
            
            p.Y = y * cos - z * sen;
            p.Z = y * sen + z * cos;
        }
    }
    
    
    public static void rotY(Obj3D obj, double ang)
    {
        double rad = (ang * Math.PI) / 180;
        float cos = (float)Math.cos(rad),
                sen = (float)Math.sin(rad);
        
        for (int i = 0; i < obj.coordMundo.size(); i++){
            Points3D p = obj.coordMundo.get(i);
            
            float z = p.Z;
            float x = p.X;
            
            p.Z = z * cos - x * sen;
            p.X = z * sen + x * cos;
        }
    }
    
    public static void rotZ(Obj3D obj, double ang)
    {
        double rad = (ang * Math.PI) / 180;
        float cos = (float)Math.cos(rad),
                sen = (float)Math.sin(rad);
        
        for (int i = 0; i < obj.coordMundo.size(); i++){
            Points3D p = obj.coordMundo.get(i);
            
            float x = p.X;
            float y = p.Y;
            
            p.X = x * cos - y * sen;
            p.Y = x * sen + y * cos;
        }
    }
}
