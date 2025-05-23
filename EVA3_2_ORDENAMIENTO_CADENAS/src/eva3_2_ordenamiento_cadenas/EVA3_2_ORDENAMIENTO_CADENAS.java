/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_ordenamiento_cadenas;

/**
 *
 * @author usuario
 */
public class EVA3_2_ORDENAMIENTO_CADENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long ini,fin,tiempo;
        String [] original = new String[10];
        String [] copiaSelection = new String[10];
        String [] copiaInsertion = new String[10];
        String [] copiaBubble = new String[10];
        original[0] = "Alonso";
        original[1] = "Estefania";
        original[2] = "Maria";
        original[3] = "Roberto";
        original[4] = "Alejandra";
        original[5] = "Esteban";
        original[6] = "Paola";
        original[7] = "Rodrigo";
        original[8] = "Alfredo";
        original[9] = "Yahir";
        
        System.out.println("Lista original");
        imprimir(original);
        copiar (original, copiaSelection);
        copiar (original, copiaInsertion);
        copiar (original, copiaBubble);
        
        System.out.println("");
        System.out.println("SELECTION SORT----------------------------");
        ini = System.nanoTime();//hora local en nanosegundos
        selectionSort(copiaSelection);
        fin = System.nanoTime();//hora local en nanosegundos
        tiempo = (fin-ini);//resta el tiempo final del inicial 
        imprimir(copiaSelection);
        System.out.println("Tiempo: "+tiempo+" nanosegundos");
        
        //INSERTION SORT 
        System.out.println("");
        System.out.println("INSERTION SORT----------------------------");
        ini = System.nanoTime();
        insertionSort(copiaInsertion);
        fin = System.nanoTime();
        tiempo = (fin-ini);//resta el tiempo final del inicial 
        imprimir(copiaInsertion);
        System.out.println("Tiempo: "+tiempo+" nanosegundos");
        
        //BUBBLE SORT 
        System.out.println("");
        System.out.println("BUBBLE SORT----------------------------");
        ini = System.nanoTime();
        bubbleSort(copiaBubble);
        fin = System.nanoTime();
        tiempo = (fin-ini);//resta el tiempo final del inicial 
        imprimir(copiaBubble);
        System.out.println("Tiempo: "+tiempo);
        
    }
    
//    public static void llenar (String []arreglo){
//        for (int i = 0; i < arreglo.length; i++) {
//            arreglo[i] =(StringBuilder());
//        } 
//    }
    
    public static void imprimir (String []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ "+arreglo[i]+" ]");
        }
        System.out.println(""); 
    }
    
    public static void copiar (String[]arreglo,String []copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i]=arreglo[i];
        }
    }
    
    //SELECTION SORT
    //O(N2)-->comparaciones
    //O(N)-->intercambios    
    public static void selectionSort(String[] arreglo) {
    for (int i = 0; i < arreglo.length - 1; i++) { // pasadas
        int min = i;
        for (int j = i + 1; j < arreglo.length; j++) { // comparaciones
//             if ((arreglo[j]) < arreglo[min]) {
            if (arreglo[j].compareToIgnoreCase(arreglo[min]) < 0) {
                min = j;
            }
        }
        if (min != i) { // intercambias --> swap
            String temp = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
    
    public static void insertionSort(String[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            String temp = arreglo[i]; // este es el valor a ordenar
            int insP = i;
            for (int prev = i - 1; prev >= 0; prev--) {//el for es el que hace el retroseso del programa
//                if (arreglo[prev] > temp) {//original
                if (arreglo[prev].compareToIgnoreCase(temp) > 0) {//intercambias --> swap
//                arreglo[prev + 1] = arreglo[prev];
                    arreglo[insP] = arreglo[prev];//gasta menos tiempo que el de arriba
                    insP--;
                } else {//detiene el for
                    break;
                }
            }
            //si se termino se inserta el valor en la lista
            arreglo[insP] = temp;
        }
    }
    
    //BUBBLE SORT- ESTE ALGORITMO TARDA MAS QUE LOS DOS ANTERIORES
    public static void bubbleSort (String []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length-1); j++) {
//                if (arreglo[j]>arreglo[j+1]) {
                if (arreglo[j].compareToIgnoreCase(arreglo[j+1])>0) {
                    String temp = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= temp;
                    
                }
            }
        }
    }
    
    
    
}
