
package Impuesto;

import Impuestos.Vivienda;
import java.util.Scanner;

public class Comodato extends Vivienda {
    
    private int mesesDelComodato;
    private float valorAlquilerMercadoActual;

    public Comodato(int mesesDelComodato, float valorAlquilerMercadoActual, String codigo, String direccion, int NumeroDePersonasEnlaCasa, String mensajeDeSugerencias) {
        super(codigo, direccion, NumeroDePersonasEnlaCasa, mensajeDeSugerencias);
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
        
        
        
        Comodato casaComodato = new Comodato(mesesComodato, ValorAlquilerMercadoActual, super.ingresarString("codigo") , super.ingresarString("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"), super.ingresarString("mensajeDeSugerencia"));
        
        return casaComodato;
        
    }
    
    
    @Override
        public float calculoImpuesto(){
        
        float monto = 0;
        
        monto = valorAlquilerMercadoActual * 0.15F;
         
        
        return monto;
        
    }
        
        
    @Override
    public String mostrarDatos(){
            
        System.out.print(super.mostrarDatos());
        
        return 
                      "\nlos meses del comodato son: " + mesesDelComodato
                    + "\nel valor de alquiler en el mercado actual de la vivienda es: " + valorAlquilerMercadoActual
                    + "\nel impuesto a pagar por la vivienda es de: " + calculoImpuesto();
                   
    }
    
}
