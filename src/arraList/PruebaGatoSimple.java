package arraList;

import java.util.ArrayList;

/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 */
public class PruebaGatoSimple {
	
  public static void main(String[] args) {
    
    GatoSimple garfield = new GatoSimple("Garfield","rojo","siames","macho",5,12);
   
    System.out.println("hola gatito");
    garfield.maulla();
    System.out.println("toma tarta");
    garfield.come("tarta selva negra");
    System.out.println("toma pescado, a ver si esto te gusta");
    garfield.come("pescado");
    
    GatoSimple tom = new GatoSimple("Tom","rojo","siames","macho",5,12);
    
    System.out.println("Tom, toma sopita de verduras");
    tom.come("sopa de verduras");
    
    GatoSimple lisa = new GatoSimple("Lisa","rojo","siames","hembra",5,12);
    
    System.out.println("gatitos, a ver cómo maulláis");
    garfield.maulla();
    tom.maulla();
    lisa.maulla();
    
    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);
    
    
    // Vector de objetos de tipo GatoSimple

    GatoSimple vectorGatos[]=new GatoSimple[4];
    
    vectorGatos[0]=garfield;
    vectorGatos[1]=tom;
    vectorGatos[2]=lisa;
    vectorGatos[3]=new GatoSimple("Any","rojo","siames","hembra",5,12);
    //vectorGatos[4]=new GatoSimple("Samy","rojo","siames","hembra",5,12);
    

    // ArrayList de gatos
    
    ArrayList<GatoSimple> ListaGatos = new ArrayList<GatoSimple>();
    
    //(Metodo para añadir a la lista)
    
    ListaGatos.add(garfield);
    ListaGatos.add(tom);
    ListaGatos.add(0,lisa);
    ListaGatos.add(new GatoSimple("Manuel","Marron","Pardo","macho",6,7));
    //Añade o modifica la lista con el objeto y el indice
    ListaGatos.add(0,lisa);
    ListaGatos.add(1,new GatoSimple("Any","Azul","Siames","hembra",5,134));
    
    
    //Chivato Lista
   for (GatoSimple gato : ListaGatos) {
	   System.out.println (gato.toString());
   }
    
   //(Metodo que referencia el elemento en la posicion)
   System.out.println (ListaGatos.get(3));
   //Si queremos artributo...
   System.out.println (ListaGatos.get(3).getSexo());
   
   
   //Metodo para eliminar los elementos de una lista
  /* ListaGatos.clear();
   for (GatoSimple gato : ListaGatos) {
	   System.out.println (gato.toString());
   }*/
   
   
   //Sustituye un elemento en una posicion por otro
   ListaGatos.set(0,garfield);
   for (GatoSimple gato : ListaGatos) {
	   System.out.println (gato.toString());
   }
   
   
   //Retorna verdadero si la lista no contiene elementos
   if (ListaGatos.isEmpty()) {
	   System.out.println ("La lista esta vacia");
   }
   
   else {
	   System.out.println ("La lista contiene datos");
   }
   
   //Bucar el objeto y la posicion donde se encuentra
   System.out.println (ListaGatos.indexOf(garfield));
   
  
  
   //Como indexOF solo que empieza buscando por el final de la lista
   System.out.println (ListaGatos.lastIndexOf(garfield));
  
   
   //Para eliminar elemento en la lista y poder reutilizarla 
   ListaGatos.remove(0);
   for (GatoSimple gato : ListaGatos) {
	   System.out.println (gato.toString());
	   
   }
   System.out.println (" ");
   
   //Como el anterior solo que en lugar de seleccionar la posicion seleccionas el 
   //objeto y eliminas el primero que pilla
   ListaGatos.remove(garfield);
   for (GatoSimple gato : ListaGatos) {
	   System.out.println (gato.toString());
	   
   }
   System.out.println (" ");
  
 //Para eliminar elemento en la lista 
   ListaGatos.remove(0);

  
  }
}