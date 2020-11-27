   
package ventaspractica;

import java.util.Scanner;


public class VentasPractica {
  //atributos
    public static void main(String[] args) {
        //metodos lilgerald
        
        Scanner entra = new Scanner(System.in);
        double descuento, precio;
        System.out.println("Introduzca el monto de la venta: ");
        precio = entra.nextDouble();
        System.out.println("Introduzca el porcentaje del descuento: ");
        descuento = entra.nextDouble();
        Descuento de = new Descuento();  //objetos 
        Impuestos im = new Impuestos(); // objetos
        
        System.out.println("Monto de la venta: "+(int)precio);
        double des1 = de.descu(descuento, precio);
        de.descuen(des1);
        
        double resta = precio - des1;
        System.out.println("Monto de venta con descuento : "+resta);
        
        double impuest = im.impu(resta);
        im.impues(impuest);
        
        double suma = resta + impuest;
        System.out.println("Total a pagar: "+suma);
       // double impuesto = resta + im.impu();
        //System.out.println("Total a pagar: "+impuesto);
        
        
        
        
        
    }
    
    
    
}
