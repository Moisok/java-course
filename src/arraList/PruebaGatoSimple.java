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
    
    
    System.out.println("\n***** VECTOR DE GATOS ******\n");
    
    for (GatoSimple gato : vectorGatos) {
    	System.out.println(gato.toString());
		
	}
  }
}