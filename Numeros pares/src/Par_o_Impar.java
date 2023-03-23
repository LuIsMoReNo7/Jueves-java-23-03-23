/*llamamos a la clase scanner */
import java.util.Scanner;
public class Par_o_Impar {
    public static void main(String[] args) {
        /*Ingresamos los datos */
         Scanner dato = new Scanner(System.in);
         System.out.println("ingrese el numero a mostrar: ");
         int n1 = dato.nextInt(); 
         /*usamo for para hacer un bucle */
         for (int i = 1; i<=n1; i++) {
            System.out.println("ingrese un numero: ");
            int num = dato.nextInt();
            /*llamamos a if y else para hacr una condicion */
            if (num%2 ==0){
                System.out.println("Es par");
                 }else{ 
                    System.out.println("Es impar");
            }
         }
    }
}
