import java.util.Scanner;
public class prueba_pares_con_while {
    public static void main(String[] args) {
        /*Ingresamos los datos*/
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el numero a mostrar: ");
        int n1 = dato.nextInt();
        int i = 1;
        while(i<=n1){
            if (i % 2 == 0){
            System.out.println("Numero par: "+i);
            }
            i ++;
    }
  }

}