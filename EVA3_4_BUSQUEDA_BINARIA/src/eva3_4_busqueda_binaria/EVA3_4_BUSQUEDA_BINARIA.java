/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA3_4_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu= new Scanner(System.in);
        int [] original = new int[10];
        int [] copiaSelection = new int[10];
        
        System.out.println("Lista original");
        llenar(original);//llenar con valores aleatorioes entre 0 y 100
        imprimir(original);//imprime los datos almacenados en el arreglo
        
        copiar (original, copiaSelection);//crea un duplicado del arreglo original
        selectionSort(original);
        imprimir(original);
        
        System.out.println("Valor a buscar: ");
        int val = captu.nextInt();
        System.out.println("El valor esta en la posicion: "+ busquedaBinaria(original, val));
        
        
        
    }
    public static void llenar (int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] =(int)(Math.random()*100);
        } 
    }
    
    public static void imprimir (int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ "+arreglo[i]+" ]");
        }
        System.out.println(""); 
    }
    
    public static void copiar (int[]arreglo,int []copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i]=arreglo[i];
        }
    }
    
    //SELECTION SORT
    //O(N2)-->comparaciones
    //O(N)-->intercambios
    public static void selectionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {//pasadas
            int min = i;
            for (int j = i + 1; j < arreglo.length; j++) {//comparaciones
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            if (min != i) {//intercambias --> swap
                int temp = arreglo[min];
                arreglo[min] = arreglo[i];
                arreglo[i] = temp;
            }
        }
    }
    
    public static int busquedaBinaria(int [] arreglo, int valorBus){
        return busquedaBinariaRecu(arreglo,valorBus, 0, arreglo.length-1);
    }
    
    public static int busquedaBinariaRecu(int [] arreglo, int valorBus, int ini, int fin){
    //calcular la posicion a la mitad del arreglo
    int mid = ini+((fin-ini)/2);
    int resu = -1;//si no lo encontramos regresamos -1
    
    if (ini <= fin) {
        if (valorBus > arreglo[mid]) {//no esta a la mitad, pero esta a la derecha
            resu = busquedaBinariaRecu(arreglo, valorBus, mid+1, fin);
        } else if (valorBus < arreglo[mid]) {//no esta a la mitad, pero esta a la izquierda
            resu = busquedaBinariaRecu(arreglo, valorBus, ini, mid-1);  // Cambiado: fin -> mid-1
        } else {//valor encontrado
            resu = mid;
        }
    }
    return resu;
}
    

}
