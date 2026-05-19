//problema 1 
//diseñe un algoritmo recursivo que determine si un 
//arrgelo de enteros se encuentra ordenado de menor 
// a mayor.
//ejemplo: [1,2,3,5,8],resultado esperado true
//ejemplo: [1,4,2,8],resultado esperado false

//


public class pregunta1 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,5,8};
        int[] arr2 = {1,4,2,8};

        boolean resul1= ordenado(arr1, 0);
        boolean resul2= ordenado(arr2, 0);   


        //print 
        System.out.println("ordenados o desordenados");  
        System.out.println("-----------");   
        System.out.println("arreglo 1: " + resul1);
        System.out.println("arreglo 2: " + resul2);
    }    

}

