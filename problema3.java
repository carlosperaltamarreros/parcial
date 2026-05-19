
//problema 3
//dado un arrelo de enteros, una inversion se define como un par de indeces (f)
//tales que :
//i < j y arr[i] > arr[j]
//es decir ocurre una inversion cuando un elemento que aparece antes en el arreglo
//es mayor que  uno que aparede despyes 
// diseñar un algoritmo utilizando la tecnica de divide y venceras que permita contar
// el numero total de inversiones en el arreglo de manera eficiente

//ejmplo[]3,1,2]
//inversiones
//(3,1) y (3,2)
//resultado esperado: 2

//requisitos
//diseñar el algoritmo usando divide y venceras
//explicar como se detectan las inversiones 
//obtener la recurrencia T(n) y analizar la complejidad temporal
//explicar por que el algoritmo es mas eficiente que revisar todos los pares posibles 



public class problema3 {
    public static int combinar(int[] arr, int inicio, int medio, int fin){
        int i = inicio;
        int j = medio + 1;
        int k = 0;
        for(int x = inicio; x <= fin; x++){
            if(i > medio){
                arr[k++] = arr[j++];
            }
            else if(j > fin){
                arr[k++] = arr[i++];
            }
            else if(arr[i] <= arr[j]){
                arr[k++] = arr[i++];
            }
            else{
                arr[k++] = arr[j++];
                //cuando se encuentra una inversion, se cuenta el numero de elementos restantes en la mitad izquierda del arreglo
                //ya que todos los elementos restantes en la mitad izquierda seran mayores que el elemento actual en la mitad derecha
                //por lo tanto se suman las inversiones encontradas hasta el momento con el numero de elementos restantes en la mitad izquierda del arreglo
                //para obtener el total de inversiones encontradas hasta el momento
                //y se retorna el total de inversiones encontradas hasta el momento
                return (medio - i + 1);
            }
        }
        return 0;
    }

    public static int cantidad(int[] arr, int inicio, int fin){
        int medio;
        int inv1;
        int inv2;
        int invTotal;

        if(inicio >= fin){
            return 0;
        }
        else{
            //divido el arreglo en dos mitades
            medio = (inicio + fin) / 2;

            //contar las inversiones en cada mitad del arreglo
            inv1 = cantidad(arr, inicio, medio);
            inv2 = cantidad(arr, medio + 1, fin);

            //combinar los resultados y contar las inversiones entre las dos mitades
            invTotal = inv1 + inv2 + combinar(arr, inicio, medio, fin);

            return invTotal;
        }
    }


    public static void main(String[] args){

    int arr[] = {3,1,2};
    int n = arr.length;

    int inver  = cantidad(arr, 0, n-1);
    System.out.println("total de inversiones  "+inver);
    }
    
}