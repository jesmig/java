
package Impuesto;
import Impuestos.Vivienda;
import java.util.Scanner;

public class Alquilada extends Vivienda {
    
    
    private float MontoAlquiler;
    private String mensajeDeSugerencia;

    public Alquilada(float MontoAlquiler, String codigo, String direccion, int NUmeroDePersonasEnlaCasa, String mensajeDeSugerencia) {
        super(codigo, direccion, NUmeroDePersonasEnlaCasa);
        this.mensajeDeSugerencia = mensajeDeSugerencia;
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

    public String getMensajeDeSugerencia() {
        return mensajeDeSugerencia;
    }

    public void setMensajeDeSugerencia(String mensajeDeSugerencia) {
        this.mensajeDeSugerencia = mensajeDeSugerencia;
    }
    
    
    
    public Alquilada leer(){

        Alquilada casaAlquilada = new Alquilada(verificarDecimales("montoAlquiler"),Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("codigo") , Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"), Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("mensajeDeSugerencia"));
        
        return casaAlquilada;
    }
    
    
    public static float calculoImpuesto(Alquilada casaAlquilada){
        
        float monto = 0;
        
        monto = casaAlquilada.getMontoAlquiler() * 0.10F;
         
        
        return monto;
        
    }
    
    
    public String mostrarDatos(Alquilada casaAlquilada){
        
        return "el codigo de la vivienda es: " + casaAlquilada.getCodigo() + ""
                    + "\nla direccion de la vivienda es: " + casaAlquilada.getDireccion()
                    + "\nlas personas que viven en la vivienda son: " + casaAlquilada.getNumeroDePersonasEnlaCasa()
                    + "\nel monto que se paga de alquiler por la vivienda es: " + casaAlquilada.getMontoAlquiler()
                    + "\nel impuesto que se pagara por la vivienda alquilada es: " + casaAlquilada.calculoImpuesto(casaAlquilada)
            
                    + "\nel mensaje de sugerencia ingresado fue: " + casaAlquilada.getMensajeDeSugerencias();
    }
}
