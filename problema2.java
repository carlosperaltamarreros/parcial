//diseña un algoritmo utilizando 
//duvude y venceras que encuentre el segundo elemnto
// mas grande del arreglo de enteros
//ejemplo:[8,3,10,5,7]
//resultado esperado: 8

//REQUISITOS
//diseñando el algoritmo usando divide y venceras 
//ecplicar como se combina los resultados 
//obtener T(n)
//analizar la complejidad temporal big O
public class problema2 {
    public static int mayo2(int[] arr, int inicio , int fin){
        //caso base
        if(inicio == fin){
            return arr[inicio]; 
        }
        
        /*
        error, envez que me salga 8 me sale 10. 
        for(int i = inicio; i < fin; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr[fin]; */

        
        //divido el arreglo en dos partes
        //llamo recursivamente a cada mitad

        else{
            int mitad = (inicio + fin) / 2;
            int max1 = mayo2(arr, inicio, mitad);
            int max2 = mayo2(arr, mitad + 1, fin);
            //combinar resultados
            if(max1 > max2){
                return max1;
            }
            else{
                return max2;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {8,3,10,5,7};
        int n = arr.length;

        int res = mayo2(arr, 0, n-1);
        System.out.println("{8,3,10,5,7}");
        System.out.println("el 2do mayor es : " + res);

    }
    
}
