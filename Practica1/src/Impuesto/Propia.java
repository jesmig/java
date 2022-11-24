
package Impuesto;

import Impuestos.Vivienda;



public class Propia extends Vivienda{
    
    
    private String fechaCompra;
    private float MontoCompra;
    private String MensajeDeSugerencias;
    

    public Propia(String fechaCompra, float MontoCompra, String codigo, String direccion, int NUmeroDePersonasEnlaCasa, String mensajeDeSugerencias) {
        super(codigo, direccion, NUmeroDePersonasEnlaCasa, mensajeDeSugerencias);
        this.fechaCompra = fechaCompra;
        this.MontoCompra = MontoCompra;
        this.MensajeDeSugerencias = mensajeDeSugerencias;
      
    }

    public Propia() {

    }

    
    

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public float getMontoCompra() {
        return MontoCompra;
    }

    public void setMontoCompra(float MontoCompra) {
        this.MontoCompra = MontoCompra;
    }


    
    
    

    public Propia leer(){
      
      java.util.Scanner entrada = new java.util.Scanner(System.in);
      
      String fechaCompra;
      float MontoCompra;
      String mensajeDeSugerencia;

      
        
      
        System.out.print("\ningrese la fecha en la cual fue comprada la casa DIA/MES/AÑO");
        fechaCompra = entrada.nextLine();
      
        System.out.print("\nporfavor ingrese el monto que fue pagado a la hora de comprar la vivienda: ");
        MontoCompra = super.verificarDecimales("montoCompra");

        
        
        

      Propia casaPropia = new Propia(fechaCompra, MontoCompra, super.ingresarString("codigo") , super.ingresarString("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"), super.ingresarString("mensajeDeSugerencia"));
      
       return casaPropia; 
    }
    
    
    
    @Override
        public float calculoImpuesto(){
        
        float monto  = MontoCompra * 0.01F;
        
        
         
            
        return monto;
        
    }
        
        
    @Override
        public String mostrarDatos(){
            
            System.out.print(super.mostrarDatos());
            return 
                    "\nla fecha de compra de la vivienda fue:" + fechaCompra
                    + "\nel monto que fue pagado por la vivienda fue: " + MontoCompra
                    + "\nel impuesto a pagar por la vivienda propia es : " +calculoImpuesto();

        }
        
}
