import java.util.Scanner;
public class suma_pares_con_while {
    public static void main(String[] args) {
        /*Ingresamos el dato*/
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el numero a mostrar: ");
        int n1 = dato.nextInt();
        //usamos int
        int sum = 0;
        int i = 0;
        //llamamos a while para la condicion
        while(i<=n1){
            if (i % 2 == 0){
              sum = sum + i;
            System.out.println("Numero par: "+i);
          
            }
            i ++;
      }
      System.out.println("La suma es: "+sum); 
  }

}