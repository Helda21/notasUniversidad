/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasuniversidad;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NotasUniversidad {

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Digite el nombre del estudiante ");
        String nombres = lectura.nextLine();
       
        System.out.println("                         ");
        System.out.println("Digite el apellido del estudiante ");
        String apellidos = lectura.nextLine();  
        System.out.println("                         ");
       
        System.out.println("Digite el programa del estudiante ");
        String programa = lectura.nextLine();  
        System.out.println("Digite la identificacion del estudiante ");//escribir
        System.out.println("                         ");        
        String identificacion = lectura.next();
        System.out.println("                         ");

       
        float n1;
        do{
        System.out.println(" Escribir la primera Calificación");
        n1 =  lectura.nextFloat();
        } while (n1>6) ;

        float n2;
        do {
        System.out.println(" Escribir la Segunda Calificación");
        n2 = lectura.nextFloat();
        } while (n2 > 6);  
        float n3;
        do
        {
        System.out.println(" Escribir la tercera Calificación");
        n3 = lectura.nextFloat();
        } while (n3 > 6 );    

        float n4;
        do{
        System.out.println(" Escribir la cuarta Calificación");
        n4 = lectura.nextFloat();
        } while (n4 > 6);                
               
             
        float notas  = (n1+n2+n3+n4);
       
        float media = (notas / 4) ;
        
        float p = media;
        
        float p1 = media*10;
        
        float parteDecimal =  (p1%10); 
        float parteDecimal1 = (media%1);// Lo que sobra de dividir al número entre 1
	float parteEntera =  (media- parteDecimal1); // Le quitamos la parte decimal usando una resta
       // System.out.printf("Parte entera: %f. Parte decimal: %f\n", parteEntera, parteDecimal);
/*      
            intType.put(0, "Cero");
        intType.put(1, "Uno");
        intType.put(2, "Dos");
        intType.put(3, "Tres");
        intType.put(4, "Cuatro");

*/

        String Palabra = null;
        String Palabra1 = null;
        
        if (parteEntera == 0){
             Palabra = "Cero";
        }else{
            if (parteEntera == 1){
                 Palabra = "Uno";
            }else{
                if (parteEntera == 2){
                     Palabra = "Dos";
                }else{
                    if (parteEntera == 3){
                         Palabra = "Tres";
                    }else{
                        if (parteEntera == 4){
                             Palabra = "Cuatro";
                        }else{
                            if (parteEntera == 5){
                                 Palabra = "Cinco";
                            }
                        }
                    }
                }   
            }
            
            
        if (parteDecimal == 0){
             Palabra1 = "Cero";
        }else{
            if (parteDecimal == 1){
                 Palabra1 = "Uno";
            }else{
                if (parteDecimal == 2){
                     Palabra1 = "Dos";
                }else{
                    if (parteDecimal == 3){
                         Palabra1 = "Tres";
                    }else{
                        if (parteDecimal == 4){
                             Palabra1 = "Cuatro";
                        }else{
                            if (parteDecimal == 5){
                                 Palabra1 = "Cinco";
                            }else{
                                if (parteDecimal == 6){
                                    Palabra1 = "Seis";
                                }else{
                                    if (parteDecimal == 7){
                                        Palabra1 = "siete";
                                    }else{
                                        if (parteDecimal == 8){
                                            Palabra1 = "Ocho";
                                        }else{
                                            if (parteDecimal == 9){
                                                Palabra1 = "Nueve";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }   
            }    
        }    
        
          System.out.println("Su calificación es: " + Palabra + " punto " + Palabra1);
            
            
          
        }
        
        }
}  