//diseña un algoritmo utilizando 
//duvude y venceras que encuentre el segundo elemnto
// mas grande del arreglo de enteros
//ejemplo:[8,3,10,5,7]
//resultado esperado: 8

//REQUISITOS
//diseñando el algoritmo usando divide y venceras 

//decidi dividir el arreglo en dos mitades, y encontrar el maximo en cada mitad,
//luego se comparan los maximos encontrados en cada mitad para determinar el maximo absoluto
//despues de encontrar el maximo absoluto, se vuelve a dividir el arreglo en dos mitades,
//y se busca el maximo en cada mitad, pero esta vez se ignora el maximo absoluto encontrado anteriormente,
//y se comparan los maximos encontrados en cada mitad para determinar el segundo maximo absoluto

//ejemplo: [8,3,10,5,7]
//1 se divide el arreglo en dos mitades: [8,3] y [10,5,7]
//2 se encuentra el maximo en cada mitad: max1 = 8, max2 = 10
//3 se compara los maximos encontrados en cada mitad: maxAbsoluto = 10
//4 se vuelve a dividir el arreglo en dos mitades: [8,3] y [5,7]
//5 se busca el maximo en cada mitad, pero esta vez se ignora el
//maximo absoluto encontrado anteriormente: max1 = 8, max2 = 7
//6 se comparan los maximos encontrados en cada mitad para determinar el segundo maximo absoluto: segundoMaximo = 8
//7 se retorna el segundo maximo absoluto como resultado final: resultado = 8

//ecplicar como se combina los resultados 


//-----se combina los resultados comparando los maximos encontrados en cada mitad del arreglo
//-----,y se retorna el mayor de los dos maximos 
//------ como el resultado final.


//obtener T(n) y analizar la complejidad del algoritmo o(n)
//----t(n) = 2*t(n/2) + c
//-----t(n) = O(n)
//-----porque se hace dos llamadas 
//----- recursivas a la mitad del arreglo, 
//----- y se hace una comparacion para combinar los 
//----- resultados, cada llamada recursiva reduce el 
//----- tamaño del problema a la mitad, por lo tanto 
//----- el tiempo total es proporcional a n, por lo
//----- tanto la complejidad es O(n).


//
public class problema2 {

    public static int busmaxreal(int[] arr, int inicio, int fin){
    //hice una funcion recursiva para encontrar el maximo absoluto del arreglo,
        int medio;
        int max1;
        int max2;

        if(inicio == fin){
            return arr[inicio];
        }
        else{
            //dividir el arreglo en dos mitades
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
        //una vez encontrado el maximo absoluto, se busca el segundo maximo absoluto
        int res = mayo2(arr, 0, n-1, maxAbsoluto);


        System.out.println("{8,3,10,5,7}");
        System.out.println("el 1ernum mayor esas : " + maxAbsoluto);
        System.out.println("el 2ndo num mayor es : " + res);
}
}


