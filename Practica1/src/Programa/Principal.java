
package Programa;
import Impuesto.Alquilada;
import Impuesto.Comodato;
import Impuesto.Propia;
import java.util.Vector;


public class Principal {
    
        public static void main(String[] args) {
        
        Propia casaPropia [] = new Propia[3];
        Alquilada casaAlquilada [] = new Alquilada[3];
        Comodato casaComodato [] = new Comodato[3];
        
        llenarVectores(casaPropia, casaAlquilada, casaComodato);
        

        
        
        
        
        
        
       
    }
        
        
  public static void llenarVectores(Propia casaPropia[], Alquilada casaAlquilada[], Comodato casaComodato[]){
      
      
      float totalImpuestosDecasasPropias = 0;
      float totalImpuestosDecasasAlquilada = 0;
      float totalImpuestosDecasasComodato = 0;
      
      System.out.println("\nINGRESE LOS DATOS DE LAS VIVIENDAS PROPIAS");
      
      for(int i = 0; i < casaPropia.length; i++){
          
          System.out.println("\nvivienda propia numero " + (i + 1));
          casaPropia[i] = new Propia();
          casaPropia[i] = casaPropia[i].leer();
          System.out.println(casaPropia[i].mostrarDatos());
          

          
          
      }
      
      System.out.print("\nINGRESE LOS DATOS DE LAS VIVIENDAS Alquiladas");
      
      
      for(int i = 0; i < casaAlquilada.length; i++ ){
          
          System.out.println("\nvivienda alquilada numero " + (i + 1));
          
          casaAlquilada[i] = new Alquilada();
          casaAlquilada[i] = casaAlquilada[i].leer();
          System.out.print(casaAlquilada[i].mostrarDatos());
          

          
          
      }
      
      System.out.print("\nINGRESE LOS DATOS DE LAS VIVIENDAS COMODATO");
      
      for(int i = 0; i < casaComodato.length; i++){
          
          
          casaComodato[i] = new Comodato();
          System.out.println("\nvivienda comodato numero " + (i + 1));
          casaComodato[i] = casaComodato[i].leer();
          
          System.out.print(casaComodato[i].mostrarDatos());
          
          
      }
      
      
      
      for(int i = 0; i < 3; i++){
          
        totalImpuestosDecasasPropias = totalImpuestosDecasasPropias + casaPropia[i].calculoImpuesto();
        totalImpuestosDecasasAlquilada = totalImpuestosDecasasAlquilada +  casaAlquilada[i].calculoImpuesto();
        totalImpuestosDecasasComodato = totalImpuestosDecasasComodato + casaComodato[i].calculoImpuesto();
                    
                    
                        

        
                    
                    
                    
          
      }
      
      System.out.print("\nel total de impuestos a pagar por todas las viviendas propias es de: " + totalImpuestosDecasasPropias);
      System.out.print("\nel total de impuestos a pagar por todas las viviendas Alquiladas es de: " + totalImpuestosDecasasAlquilada);
      System.out.print("\neltotal de impuestos a pagar por todas las viviendas Comodatos es de: " + totalImpuestosDecasasComodato);

  } 
  
  
  
}
