//problema 1 
//diseñe un algoritmo recursivo que determine si un 
//arrgelo de enteros se encuentra ordenado de menor 
// a mayor.
//ejemplo: [1,2,3,5,8],resultado esperado true
//ejemplo: [1,4,2,8],resultado esperado false

//

 

public class pregunta1 {
    
    public static boolean ordenado(int[] arr, int i, int n){
    //caso base
    if(i == n-1){
        return true;
    }
    else{
        //comparacion
        if(arr[i] > arr[i+1]){
            return false;
        }
        else{
            return ordenado(arr, i+1, n);
        }
    }

    
}

    public static void main(String[] args){
        int[] arr1 = {1,2,3,5,8};
        int[] arr2 = {1,4,2,8};
        
        //longitud 
        int n1 = arr1.length;
        int n2 = arr2.length;

        //llamada de la funcion
        boolean resul1= ordenado(arr1, 0,n1);
        boolean resul2= ordenado(arr2, 0,n2);   


        //print 
        System.out.println("ordenados o desordenados");  
        System.out.println("-----------");   
        System.out.println("arreglo 1: " + resul1);
        System.out.println("arreglo 2: " + resul2);
    }    



}

