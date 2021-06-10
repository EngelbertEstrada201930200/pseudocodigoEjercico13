import java.util.*;
public class Ejercicio13{
    public static void main(String[] args) {

        int opcion, num1, num2, suma, dividir;
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("   Menú\n1.-Sumar   2.-Dividir   3.-Salir");
        opcion = entrada.nextInt();
        
        while(opcion !=3 ){
            if (opcion == 1) {
                System.out.println("Ingrese el primer número");
                num1 = entrada.nextInt();

                System.out.println("Ingrese el segundo número");
                num2 = entrada.nextInt();
                suma = num1 + num2;

                System.out.println("La suma es: "+suma);
                    
            }else {
                System.out.println("Ingrese el numerador");
                num1 = entrada.nextInt();

                System.out.println("Ingrese el deninador");
                num2 = entrada.nextInt();
                
                if(num2 !=0){
                    dividir = num1/num2;
                    System.out.println("La división es: "+dividir);

                }else 
                    System.out.println("No se puede dividir por el numero "+num2);

            }
            
            System.out.println("   Menú\n1.-Sumar   2.-Dividir   3.-Salir");
            opcion = entrada.nextInt();
        }
    }
}