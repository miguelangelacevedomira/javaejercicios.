import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner entrada = new Scanner (System.in);
     
      System.out.println("introduzca el primer numero:");
      double num1 = entrada.nextDouble();
      
      System.out.println("introduzca el segundo numero: ");
      double num2 = entrada.nextDouble();
   
      
      double suma = num1 + num2;
      double resta = num1 - num2;
      double multiplicacion = num1 * num2;
      double division = num1 / num2;
      double modulo = num1 % num2;
      
      System.out.println("La suma es : " + suma );
      System.out.println("La resta es : " + resta );
      System.out.println("La multiplicacion es : " + multiplicacion );
      System.out.println("La division es : " + division );
      System.out.println("El modulo es : " + modulo );
      
