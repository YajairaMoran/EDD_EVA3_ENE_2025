/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_sorting_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class EVA3_3_SORTING_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //COLLECTIONS
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(100);
        lista.add(600);
        lista.add(400);
        lista.add(200);
        lista.add(800);
        System.out.print(lista);
        
        
        
        Comparator c = new Comparator() {//se crea una clase abstracta
            //DEBEMOS DETERMINAR EL CRITERIO DE ORDENAMIENTO
            //VALOR NEGATIVO SI o1 < o2
            //          CERO SI o1 = o2
            //VALOR POSITIVO SI o1 > o2
            @Override
            public int compare(Object o1, Object o2) {
               Integer val1 = (Integer)o1;
               Integer val2 = (Integer)o2;
               return val1 - val2;
            }
        };
        lista.sort(c);
        System.out.println("");
        System.out.print(lista);
        System.out.println("");
        
        
        
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Lunes");
        cadenas.add("Martes");
        cadenas.add("Miercoles");
        cadenas.add("Jueves");
        System.out.println(cadenas);
        
        Comparator cade = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
              String cade1 = (String)o1;
              String cade2 = (String)o2;
              return cade1.compareTo(cade2);
              
            }
        };
        
        cadenas.sort(cade);
        System.out.print(cadenas);
        
        
    }
    
}
