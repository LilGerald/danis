/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaspractica;

/**
 *
 * @author pc reclutamiento
 */
public class Impuestos {
    public double impu (double resta){
        
        double impuest = resta*0.07;
       
        return impuest;
        
        
    }
    public void impues(double impuest){
        System.out.println("Impuesto: "+impuest);
        
    }

    
}
