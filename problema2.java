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

    public static int busmaxreal(int[] arr, int inicio, int fin){
    
        int medio;
        int max1;
        int max2;

        if(inicio == fin){
            return arr[inicio];
        }
        else{
            medio = (inicio + fin) / 2;
            max1 = busmaxreal(arr, inicio, medio);
            max2 = busmaxreal(arr, medio + 1, fin);
            //combinar los resultados
            if(max1 > max2){
                return max1;
            }
            else{
                return max2;
            }
        }
    }

    public static int mayo2(int[] arr, int inicio, int fin, int maxAbsoluto){
        int medio;
        int max1;
        int max2;

        if(inicio == fin){
            //si el elemento actual es igual al maximo absoluto, entonces no se considera
            if(arr[inicio] == maxAbsoluto){
                return Integer.MIN_VALUE; //retorna el valor minimo para indicar que no se considera
            }
            else{
                return arr[inicio];
            }
        }
        else{
            medio = (inicio + fin) / 2;
            max1 = mayo2(arr, inicio, medio, maxAbsoluto);
            max2 = mayo2(arr, medio + 1, fin, maxAbsoluto);
            //combinar los resultados
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

        //encontrar el maximo absoluto del arreglo
        int maxAbsoluto = busmaxreal(arr, 0, n-1);
        int res = mayo2(arr, 0, n-1, maxAbsoluto);


        System.out.println("{8,3,10,5,7}");
        System.out.println("el 1ernum mayor esas : " + maxAbsoluto);
        System.out.println("el 2ndo num mayor es : " + res);
}
}


