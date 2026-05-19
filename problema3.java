
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

    
    public static void main(String[] args){

    int arr[] = {3,1,2};
    int n = arr.length;

    int inver  = cantidad(arr, 0, n-1);
    System.out.println("total de inversiones  " + inver);
    }
    
}