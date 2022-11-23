
package Impuesto;

import Impuestos.Vivienda;



public class Propia extends Vivienda{
    
    
    private String fechaCompra;
    private float MontoCompra;
    private String MensajeDeSugerencias;
    

    public Propia(String fechaCompra, float MontoCompra, String codigo, String direccion, int NUmeroDePersonasEnlaCasa, String mensajeDeSugerencias) {
        super(codigo, direccion, NUmeroDePersonasEnlaCasa);
        this.fechaCompra = fechaCompra;
        this.MontoCompra = MontoCompra;
        this.MensajeDeSugerencias = mensajeDeSugerencias;
      
    }

    public Propia() {

    }

    public String getMensajeDeSugerencias() {
        return MensajeDeSugerencias;
    }

    public void setMensajeDeSugerencias(String MensajeDeSugerencias) {
        this.MensajeDeSugerencias = MensajeDeSugerencias;
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

        
        
        

      Propia casaPropia = new Propia(fechaCompra, MontoCompra, Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("codigo") , Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("direccion"), Vivienda.validacionEnteros("numeroDePersonasDeLaVivienda"), Vivienda.ingresarCodigoDireccionYmensajeDeSugerencia("mensajeDeSugerencia"));
      
       return casaPropia; 
    }
    
    
    
        public static float calculoImpuesto(Propia casaPropia){
        
        float monto  = casaPropia.getMontoCompra() * 0.01F;
        
        
         
            System.out.println(monto);
        return monto;
        
    }
        
        
        public String mostrarDatos(Propia casaPropia){
            
            
            return "el codigo de la vivienda es: " + casaPropia.getCodigo() + ""
                    + "\nla direccion de la vivienda es: " + casaPropia.getDireccion()
                    + "\nlas personas que viven en la vivienda son: " + casaPropia.getNumeroDePersonasEnlaCasa()
                    + "\nla fecha de compra de la vivienda fue:" + casaPropia.getFechaCompra()
                    + "\nel monto que fue pagado por la vivienda fue: " + casaPropia.getMontoCompra()
                    + "\nel impuesto a pagar por la vivienda propia es : " +casaPropia.calculoImpuesto(casaPropia)
            
                    + "\nel mensaje de sugerencia ingresado fue: " + casaPropia.getMensajeDeSugerencias();
        }
        
}
