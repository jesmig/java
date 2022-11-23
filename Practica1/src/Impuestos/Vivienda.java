
package Impuestos;

import Impuesto.Alquilada;
import Impuesto.Comodato;
import Impuesto.Propia;
import java.util.Scanner;

public class Vivienda {
    
    private String codigo;
    private  String direccion;
    private int NumeroDePersonasEnlaCasa;
    private String mensajeDeSugerencias;

    public Vivienda(String codigo, String direccion, int NUmeroDePersonasEnlaCasa) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.NumeroDePersonasEnlaCasa = NUmeroDePersonasEnlaCasa;
   
    }

    public Vivienda() {
        
        
        this.codigo = "";
        this.direccion = "";
        this.NumeroDePersonasEnlaCasa = 0;
        this.mensajeDeSugerencias = "";
        
  
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDePersonasEnlaCasa() {
        return NumeroDePersonasEnlaCasa;
    }

    public void setNumeroDePersonasEnlaCasa(int NumeroDePersonasEnlaCasa) {
        this.NumeroDePersonasEnlaCasa = NumeroDePersonasEnlaCasa;
    }

    public String getMensajeDeSugerencias() {
        return mensajeDeSugerencias;
    }

    public void setMensajeDeSugerencias(String mensajeDeSugerencias) {
        this.mensajeDeSugerencias = mensajeDeSugerencias;
    }
    
    

    
    

    
    
    
    
    public static String ingresarCodigoDireccionYmensajeDeSugerencia(String tipo){
        
        Scanner entrada = new Scanner(System.in);
        String codigo;
        String direccion;
        String entrega = "";
        String mensajeDeSugerencia = "";

        if(tipo.equals("codigo")){
            
            System.out.print("ingresa el codigo de la vivienda: ");
            codigo = entrada.nextLine();
            
            entrega = codigo;
            
            
        }else if(tipo.equals("direccion")){
            
            System.out.print("\ningresa la direccion de la vivienda: ");
            direccion = entrada.nextLine();
            
            entrega =  direccion;
            
        }else if(tipo.equals("mensajeDeSugerencia")){
            
            
        System.out.print("\ningresa un mensaje de sugerencia: ");
        mensajeDeSugerencia = entrada.nextLine();
        entrega = mensajeDeSugerencia;
        }
        
        
        
        
        return entrega;
        
    }
    
    
    public static int validacionEnteros(String identificadorDeDato){
        
        
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        while(!entrada.hasNextInt()){
            
             String next = entrada.next();
            
            System.out.print("\ndebes ingresar un numero entero");
            
            
            if(identificadorDeDato.equals("numeroDePersonasDeLaVivienda")){
                
                System.out.print("\ningresa el numero de personas que residen en la vivienda:");
                
                
            }else if(identificadorDeDato.equals("mesesDelComodato")){
                
                System.out.print("\ningrese el numero de meses del comodato: ");
                
            }
            

          
        }
        
            numero = entrada.nextInt();
         
            return numero;
            
            
        
    }
    
    

    
    
    public float verificarDecimales(String identificadorDeDato){
        
        
        Scanner entrada = new Scanner (System.in);
        float numero = 0;
        
        while(!entrada.hasNextFloat()){
            
            String next = entrada.next();
            
            System.out.print("porfavor ingrese solo numeros\n");
            
            if(identificadorDeDato.equals("montoCompra")){
                
                System.out.print("porfavor ingrese el monto que fue pagado a la hora de comprar la vivienda: ");
                
            }else if(identificadorDeDato.equals("montoAlquiler")){
                
                System.out.print("porfavor ingrese la cantidad de dinero que se esta pagando de alquiler: ");
                
            }else if(identificadorDeDato.equals("valorAlquilerMercadoActual")){
                
                System.out.print("porfavor ingrese la cantidad de dinero que vale el alquiler de la vivienda en el mercado actual: ");
                
            }
            
           
            
        }
        
        
        numero = entrada.nextFloat();
        
        return numero;
        
        
        
    }
    
    
    

    
    
  
    
    
    
    
    
}
