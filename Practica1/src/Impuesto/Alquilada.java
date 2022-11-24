
package Impuesto;
import Impuestos.Vivienda;
import java.util.Scanner;

public class Alquilada extends Vivienda {
    
    
    private float MontoAlquiler;

    public Alquilada(float MontoAlquiler, String codigo, String direccion, int NumeroDePersonasEnlaCasa, String mensajeDeSugerencias) {
        super(codigo, direccion, NumeroDePersonasEnlaCasa, mensajeDeSugerencias);
        this.MontoAlquiler = MontoAlquiler;
    }

    
    

    

    public Alquilada() {
    }
    
    
    

    public float getMontoAlquiler() {
        return MontoAlquiler;
    }

    public void setMontoAlquiler(float MontoAlquiler) {
        this.MontoAlquiler = MontoAlquiler;
    }
    
    public Alquilada leer(){

        Alquilada casaAlquilada = new Alquilada(verificarDecimales("montoAlquiler"),super.ingresarString("codigo") , super.ingresarString("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"), super.ingresarString("mensajeDeSugerencia"));
        
        return casaAlquilada;
    }
    
    
    @Override
    public  float calculoImpuesto(){
        
        float monto = 0;
        
        monto = MontoAlquiler * 0.10F;
         
        
        return monto;
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String mostrarDatos(){
        
        System.out.print(super.mostrarDatos());
        
        return      
                    "\nel monto que se paga de alquiler por la vivienda es: " + MontoAlquiler
                    + "\nel impuesto que se pagara por la vivienda alquilada es: " + calculoImpuesto();
 
    }
}

