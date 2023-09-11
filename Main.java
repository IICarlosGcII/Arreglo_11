import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10]; //Declaramos el arreglo con 10 espacios
        int posicion; //Declaramos una variable que utilizaremos

        System.out.println("LLenando el arreglo: ");
        for (int i = 0; i < 10; i++) { //Llenamos el arreglo
        arreglo[i] = entrada.nextInt(); //Guardamos los datos en el arreglo con la entrada escanner
        }
        do{ //Utilizamos un do.while para que se repita lo que queramos
            System.out.println("Digite una posicion: ");
            posicion = entrada.nextInt(); //Pedimos la posicion donde se va guardar el numero

        }while(posicion<0 || posicion>9); //Posicion en un intervalo de 0 a 9

        //Eliminando el dato que sobra
        for(int i = posicion; i<9 ; i++){
            arreglo[i] = arreglo[i+1]; //dato en la posicion i sera igual a la posicion i+1
        }
        System.out.println("El arreglo es: ");
        for(int i = 0; i<9 ; i++) //Mostrando datos del arreglo resultante
            System.out.println(arreglo[i]+" - ");

    }
}
