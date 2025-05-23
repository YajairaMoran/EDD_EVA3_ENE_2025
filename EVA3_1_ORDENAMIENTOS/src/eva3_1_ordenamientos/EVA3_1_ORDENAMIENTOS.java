/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_ordenamientos;

public class EVA3_1_ORDENAMIENTOS {
    
    public static void main(String[] args) {
        long ini,fin,tiempo;
        int [] original = new int[10];
        int [] copiaSelection = new int[10];
        int [] copiaInsertion = new int[10];
        int [] copiaBubble = new int[10];
        int [] copiaQuick = new int[10];
        int [] copiaMerge = new int[10];
        llenar(original);//llenar con valores aleatorioes entre 0 y 100
        System.out.println("Lista original");
        imprimir(original);//imprime los datos almacenados en el arreglo
        copiar (original, copiaSelection);//crea un duplicado del arreglo original
        copiar (original, copiaInsertion);//crea un duplicado del arreglo original
        copiar (original, copiaBubble);//crea un duplicado del arreglo original
        copiar (original, copiaQuick);//crea un duplicado del arreglo original
        copiar (original, copiaMerge);//crea un duplicado del arreglo original
        
//        //SELECTION SORT selccionar y ordenar 
//        System.out.println("");
//        System.out.println("SELECTION SORT----------------------------");
//        ini = System.nanoTime();//hora local en nanosegundos
//        selectionSort(copiaSelection);
//        fin = System.nanoTime();//hora local en nanosegundos
//        tiempo = (fin-ini);//resta el tiempo final del inicial 
//        imprimir(copiaSelection);
//        System.out.println("Tiempo: "+tiempo);
//        
//        //INSERTION SORT 
//        System.out.println("");
//        System.out.println("INSERTION SORT----------------------------");
//        ini = System.nanoTime();
//        insertionSort(copiaInsertion);
//        fin = System.nanoTime();
//        tiempo = (fin-ini);//resta el tiempo final del inicial 
//        imprimir(copiaInsertion);
//        System.out.println("Tiempo: "+tiempo);
//        
//        //BUBBLE SORT
//        System.out.println("");
//        System.out.println("BUBBLE SORT----------------------------");
//        ini = System.nanoTime();
//        bubbleSort(copiaBubble);
//        fin = System.nanoTime();
//        tiempo = (fin-ini);//resta el tiempo final del inicial 
//        imprimir(copiaBubble);
//        System.out.println("Tiempo: "+tiempo);
        
        //QUICKSORT
//        System.out.println("");
//        System.out.println("QUICKSORT----------------------------");
//        ini = System.nanoTime();
//        quickSort(copiaQuick);
//        fin = System.nanoTime();
//        tiempo = (fin-ini);//resta el tiempo final del inicial 
//        imprimir(copiaQuick);
//        System.out.println("Tiempo: "+tiempo);
        
        //MERGESORT
        System.out.println("");
        System.out.println("MERGESORT----------------------------");
        ini = System.nanoTime();
        mergeSort(copiaMerge);
        fin = System.nanoTime();
        tiempo = (fin-ini);//resta el tiempo final del inicial 
        imprimir(copiaMerge);
        System.out.println("Tiempo: "+tiempo);
        
        
        
        
        
        
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
    
    //INSERTION SORT es O(N2)
    //-->comparaciones
    //-->intercambios
    public static void insertionSort(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; // este es el valor a ordenar
            int insP = i;
            for (int prev = i - 1; prev >= 0; prev--) {//el for es el que hace el retroseso del programa
                if (arreglo[prev] > temp) {//intercambias --> swap
//                arreglo[prev + 1] = arreglo[prev];
                    arreglo[insP] = arreglo[prev];//gasta menos tiempo que el de arriba
//                insP = prev; 
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
    public static void bubbleSort (int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < (arreglo.length-1); j++) {
                if (arreglo[j]>arreglo[j+1]) {
                    int temp = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]= temp;
                    
                }
            }
        }
    }
    //QUICKSORT
    public static void quickSort(int []arreglo){
        quickSortRecu(arreglo, 0, arreglo.length-1);
    }

    //algoritmo recursivo
    public static void quickSortRecu(int[] arreglo, int ini, int fin) {
        //elegir pivote -->para nuestro ejemplo, el primer elemento del arreglo
        //mover los indices
             //encotrar valores e intercambiar
             //se cruzan??
                  //si-->intercambiar pivote, terminar
                  //no-->repetir desde mover indices
        //llamada recirdiva a cada parte del arreglo
        //a lado Izq y Der del pivote
        
        if (ini >= fin) 
            return; 
    //            if (arreglo[piv]>arreglo[fin]) {
    //                arreglo[fin]=arreglo[ini];
    //                arreglo[piv]=arreglo[fin];
    //                arreglo[piv]=fin;
    //            }
    
        int pivote = arreglo[ini];
        int i = ini;
        int j = fin;

        while (i < j) {
            while (i < j && arreglo[i] <= pivote) i++;
            while (arreglo[j] > pivote) j--;

            
            
            if (i < j) {
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
            
            
        }

        arreglo[ini] = arreglo[j];
        arreglo[j] = pivote;

        quickSortRecu(arreglo, ini, j - 1);
        
        quickSortRecu(arreglo, j + 1, fin);
        
        
        
    }
    
    //MERGESORT
    public static void mergeSort(){
        
    }
    // Método principal público para ordenar
    public static void mergeSort(int[] arreglo) {
        if (arreglo == null || arreglo.length <= 1) {
            return;
        }
        int[] auxiliar = new int[arreglo.length];
        mergeSort(arreglo, auxiliar, 0, arreglo.length - 1);
    }

    // Método recursivo privado
    private static void mergeSort(int[] arreglo, int[] auxiliar, int inicio, int fin) {
        if (inicio < fin) {
            int medio = inicio + (fin - inicio) / 2;
            
            // Ordenar primera mitad
            mergeSort(arreglo, auxiliar, inicio, medio);
            
            // Ordenar segunda mitad
            mergeSort(arreglo, auxiliar, medio + 1, fin);
            
            // Mezclar las mitades ordenadas
            mezclar(arreglo, auxiliar, inicio, medio, fin);
        }
    }

    // Método para mezclar dos subarreglos ordenados
    private static void mezclar(int[] arreglo, int[] auxiliar, int inicio, int medio, int fin) {
        // Copiar ambas mitades al arreglo auxiliar
        System.arraycopy(arreglo, inicio, auxiliar, inicio, fin - inicio + 1);
        
        int i = inicio;      // Índice para la mitad izquierda
        int j = medio + 1;   // Índice para la mitad derecha
        int k = inicio;      // Índice para el arreglo original
        
        // Comparar elementos y copiar el menor
        while (i <= medio && j <= fin) {
            if (auxiliar[i] <= auxiliar[j]) {
                arreglo[k++] = auxiliar[i++];
            } else {
                arreglo[k++] = auxiliar[j++];
            }
        }
        
        // Copiar los elementos restantes de la izquierda (si hay)
        while (i <= medio) {
            arreglo[k++] = auxiliar[i++];
        }
        
        // Los elementos restantes de la derecha ya están en su lugar
    }

    // Método para imprimir el arreglo (útil para testing)
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Ejemplo de uso en main
//    public static void main(String[] args) {
//        int[] numeros = {5, 2, 8, 1, 3, 7, 4, 6};
//        
//        System.out.println("Arreglo original:");
//        imprimirArreglo(numeros);
//        
//        mergeSort(numeros);
//        
//        System.out.println("Arreglo ordenado:");
//        imprimirArreglo(numeros);
//    }
//    
    
    
    
    
    
    
}
