package carwash;

import java.util.Scanner;

public class CarWash {


    public static void main(String[] args) {
        cliente _cliente = new cliente();
        TiposDeLavado _TiposDeLavado = new TiposDeLavado();
        Ventasw _Ventasw = new Ventasw();
        Scanner teclado = new Scanner(System.in);
            int cont = 0 ;
         

            while(cont!=9){

                    System.out.println("-----------------------------------------------------");
                    System.out.println("|                 Bienvenido a Auto lavado Geek                   |");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("");
                    System.out.println("                 Seleccione una de las siguientes opciones                ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("[1].-  Datos generales de la empresa .             ");
                    System.out.println("[2].-  Dar de alta los servicios del Auto lavado.    ");
                    System.out.println("[3].-  Actualizacion de servicios .      ");
                    System.out.println("[4].-  Registro de servicios de limpieza. ");
                    System.out.println("[5].-  Ver catálogo de servicios. ");
                    System.out.println("[6].-  Ver reporte de venta                 ");
                    System.out.println("[7].-  Ver estadistica general de venta");
                    System.out.println("[8].-  Salir del sistema                       ");
                    System.out.println("");
                    System.out.print("Sleccione una opcion  [1..8] : ");
                    cont = teclado.nextInt();
                    String valorTeclado;
                    
                    switch(cont){
                        
                        case 1:{
                            
                            System.out.println("Auto lavado Geek       ");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Numero de telefono:   622-227-64-67      ");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Dirección:      ");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Horarios: Lunes a viernes : 7 am - 7pm Y sabado de 10 am - 5 pm.    ");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("Entre nuestros servicios contamos con 5 tipos.   ");
                            System.out.println("--------------------------------------------------------------------");
                            break;
                        }
                        case 2:{
                            
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                       ALTA DE SERVICIOS                       |");
                    System.out.println("----------------------------------------------------------------");
                    
                    
                    
                    System.out.print("Seleccione el tipo de lavado : ");
                    _TiposDeLavado.setNombreDeLavado(teclado.next());
                    System.out.print("Inserte el precio de lavado : ");
                    _TiposDeLavado.setPrecioDeLavado(teclado.nextInt());
                    
                    System.out.println("------------------------------------------------------------");
                    break;
                     
                    }
                        case 3:{
                            
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                       MODIFICACION DE PRECIOS                    |");
                    System.out.println("----------------------------------------------------------------");
                           
                    _Ventasw.ModificarPrecios();
                            
                        }
                        
                        case 4:{
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("|                       REGISTRO DE VENTAS                     |");
                    System.out.println("----------------------------------------------------------------");
                    
                            System.out.println("Ingrese el tipo de lavado ");
                            
                        }
                        // Caso agregado independiende del 5
                       case 5:{
                           
                            
                        }
        
        
    }
                    
    
    }
}
}
