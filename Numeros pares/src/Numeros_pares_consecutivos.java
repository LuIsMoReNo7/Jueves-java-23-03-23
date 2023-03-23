//llamamos a la clase Scanner
import java.util.Scanner;
public class Numeros_pares_consecutivos {
    public static void main(String[] args) {
        /*Ingresamos los datos*/
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el numero a mostrar: ");
        int n1 = dato.nextInt(); 
        //llamamos a for para la condicional
        int x;
        for(int i=1;i<n1;i++){
            x=i*2; //aqui x toma el valor del cual valor de i multiplicado por 2
            System.out.println("Numero par:"+x);
        }
    }
}

