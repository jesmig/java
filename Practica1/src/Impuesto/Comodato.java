
package Impuesto;

import Impuestos.Vivienda;
import java.util.Scanner;

public class Comodato extends Vivienda {
    
    private int mesesDelComodato;
    private float valorAlquilerMercadoActual;

    public Comodato(int mesesDelComodato, float valorAlquilerMercadoActual, String codigo, String direccion, int NUmeroDePersonasEnlaCasa) {
        super(codigo, direccion, NUmeroDePersonasEnlaCasa);
        this.mesesDelComodato = mesesDelComodato;
        this.valorAlquilerMercadoActual = valorAlquilerMercadoActual;
    }

    public Comodato() {
    }
    
    
    

    public int getMesesDelComodato() {
        return mesesDelComodato;
    }

    public void setMesesDelComodato(int mesesDelComodato) {
        this.mesesDelComodato = mesesDelComodato;
    }

    public float getValorAlquilerMercadoActual() {
        return valorAlquilerMercadoActual;
    }

    public void setValorAlquilerMercadoActual(float valorAlquilerMercadoActual) {
        this.valorAlquilerMercadoActual = valorAlquilerMercadoActual;
    }
    
    
    
    
    
    
    public Comodato leer(){
        
        Scanner entrada = new Scanner(System.in);
        int mesesComodato;
        float ValorAlquilerMercadoActual;
        
      
        
        System.out.print("\nprofavor ingrese los meses del comodato: ");
        mesesComodato = super.validacionEnteros("mesesDelComodato");
        
        System.out.print("\nporfavor ingrese la cantidad de dinero que vale el alquiler de la vivienda en el mercado actual");
        ValorAlquilerMercadoActual = super.verificarDecimales("valorAlquilerMercadoActual");
        
        
        
        Comodato casaComodato = new Comodato(mesesComodato, ValorAlquilerMercadoActual, Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("codigo") , Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"));
        
        return casaComodato;
        
    }
    
    
        public static float calculoImpuesto(Comodato casaComodato){
        
        float monto = 0;
        
        monto = casaComodato.getValorAlquilerMercadoActual()* 0.15F;
         
        
        return monto;
        
    }
        
        
    public String mostrarDatos(Comodato casaComodato){
        
        return "el codigo de la vivienda es: " + casaComodato.getCodigo() + ""
                    + "\nla direccion de la vivienda es: " + casaComodato.getDireccion()
                    + "\nlas personas que viven en la vivienda son: " + casaComodato.getNumeroDePersonasEnlaCasa()
                    + "\nlos meses del comodato son: " + casaComodato.getMesesDelComodato()
                    + "\nel valor de alquiler en el mercado actual de la vivienda es: " + casaComodato.getValorAlquilerMercadoActual()
                    + "\nel impuesto a pagar por la vivienda es de: " + casaComodato.calculoImpuesto(casaComodato)
                    + "\nel mensaje de sugerencia ingresado fue: " + casaComodato.getMensajeDeSugerencias();
    }
    
}
