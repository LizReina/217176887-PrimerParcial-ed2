/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.List;

/**
 *
 * @author liz fernanda reina quispert
 */
public interface IArbolBusqueda<K extends Comparable<K>,V>{
    public void insertar(K clave,V valor) throws ExceptionClaveYaExiste;
    public V eliminar(K clave) throws ExceptionClaveNoExiste;
    public V buscar(K clave);
    public boolean contiene(K clave);
    public int size();
    public int altura();           
    public void vaciar();
    public boolean esArbolVacio();
    public int nivel();
    public List<K> recorridoInOrdenRecursivo();
    public List<K> recorridoEnPreOrden();
    public List<K> recorridoEnPostOrden();
    public List<K> recorridoPorNiveles();  
   
   
     public String toString();

     public void insertarIterativo(K clave,V valor)throws ExceptionClaveYaExiste;
    
}
