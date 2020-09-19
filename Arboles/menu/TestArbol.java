/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles.menu;

import Arboles.ArbolAVL;
import Arboles.ArbolB;
import Arboles.ArbolBusquedaBinario;
import Arboles.ArbolMViasBusqueda;
import Arboles.ExceptionClaveNoExiste;
import Arboles.ExceptionClaveYaExiste;
import Arboles.ExceptionOrdenInvalido;
import Arboles.IArbolBusqueda;
import Arboles.Practico1.Abb;
import java.util.Scanner;

/**
 *
 * @author liz fernanda reina quispert
 */
public class TestArbol{
    
 public static void main(String[] args) throws ExceptionClaveYaExiste, ExceptionClaveNoExiste, ExceptionOrdenInvalido  { 
     
      IArbolBusqueda<Integer,String> ArbolDeBusqueda = null;
      IArbolBusqueda<Integer,String> ArbolBe;
      Scanner entrada= new Scanner(System.in);
      
        System.out.println("elija el tipo de arbol,ABB, AVL, AMV");
        System.out.println("para la pregunta 1 introdusca-> ABB");
        System.out.println("para la pregunta 2 introdusca-> AVL");
        System.out.println("para la pregunta 3 introdusca-> AMV");
        String tipoDeArbol=entrada.next();
        tipoDeArbol=tipoDeArbol.toUpperCase();
     switch(tipoDeArbol){
          
          case("ABB"):
              ArbolDeBusqueda=new ArbolBusquedaBinario<>();
              break;
        
          case("AVL"):
              ArbolDeBusqueda=new ArbolAVL<>();
          break;
         
         
          case("AMV"):
              ArbolDeBusqueda=new ArbolMViasBusqueda<>(4);
              break;
    
          default:
              System.out.println("tipo de arbol invaldo, escogiendo.. ArbolBusquedaBinario");
               ArbolDeBusqueda=new ArbolBusquedaBinario<>();
      }
                            
            
       int opcion= -1;
     Scanner ponerDato= new Scanner(System.in);
     int cantidad;
    while(opcion!=0){
               System.out.println("iNGRESE 0 PARA SALIR  ");
               System.out.println("1.-es monticulo");
               System.out.println("2.-insertar avl iterativo  ");
               System.out.println("3.-nodo padres ");
       System.out.println("Introduca Una Opcion ");
       opcion=entrada.nextInt();
               
        switch(opcion){
       
              case 1: 
       //Implementar un método que retorne verdadero si un árbol binario es un montículo, falso en caso contrario. En un montículo el dato que almacena un nodo cualquiera siempre es menor que los datos de sus descendientes
                  ArbolDeBusqueda.insertar(80, "salinas");
                  ArbolDeBusqueda.insertar(100, "julio gonzales");
                  ArbolDeBusqueda.toString();
                  System.out.println(ArbolDeBusqueda);
           
                System.out.println(((ArbolBusquedaBinario)ArbolDeBusqueda).esMonticulo());
               
              break; 
              
                  case 2:  
            //  Implementar un método insertar iterativo para dicho árbol. No puede utilizar los metodos insertar o leiminar ya existentes. Tal como establece el árbol AVL solo se debe ver la necesidad de balancear por el camino que siguió el algoritmo para insertar hasta volver a la raíz

              ArbolDeBusqueda.insertarIterativo(20, "juan peres");
              ArbolDeBusqueda.insertarIterativo(7, "lucas graam");
              ArbolDeBusqueda.insertarIterativo(70, "liliana v");
              ArbolDeBusqueda.insertarIterativo(50, "copito");
              ArbolDeBusqueda.insertarIterativo(40, "diego ");
              ArbolDeBusqueda.insertarIterativo(15, "lucas");
              ArbolDeBusqueda.insertarIterativo(12, "mario");
              ArbolDeBusqueda.insertarIterativo(90, "jose"); 
            
             
                  ArbolDeBusqueda.toString();
                  System.out.println(ArbolDeBusqueda);
            
              break; 
              
                case 3:  
      //TImplementar un método para un árbol de m-vías que retorne cuantos nodos del árbol son padres fuera del nivel n

               ArbolDeBusqueda.insertar(20, "cristian soza");
              ArbolDeBusqueda.insertar(7, "julio gonzales");
              ArbolDeBusqueda.insertar(23, "llanos");
              ArbolDeBusqueda.insertar(9, "mario");
              ArbolDeBusqueda.insertar(11, "armando");
              ArbolDeBusqueda.insertar(25, "julia");
              ArbolDeBusqueda.insertar(4, "berta");
              ArbolDeBusqueda.insertar(3, "marcela"); 
              ArbolDeBusqueda.insertar(22, "carol");
              ArbolDeBusqueda.insertar(10, "valeria");
              ArbolDeBusqueda.insertar(8, "maria");
              ArbolDeBusqueda.insertar(24, "carla");
              ArbolDeBusqueda.insertar(50, "dayana");
              ArbolDeBusqueda.insertar(100, "lucia");
              ArbolDeBusqueda.insertar(35, "juan");
         
               ArbolDeBusqueda.toString();
               System.out.println(ArbolDeBusqueda);
                  
                System.out.println("introduce el nivel");
                System.out.println(((ArbolMViasBusqueda)ArbolDeBusqueda).cantidadNodosPadres(ponerDato.nextInt()));
            break; 

            
        }
         opcion=0;
    }   
    
    
 }     
 
 
 
    
 }    
