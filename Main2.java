import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //solicitar nombre
        System.out.print("ingresa tu nombre:");
        String nombre = scanner.nextLine();
        
        //solicitar edad
        System.out.print("ingresa tu edad:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del Scanner
        
        //solicitar correo
        System.out.print("ingresa tu correo");
        String correo = scanner.nextLine();
        
        System.out.println("\n---datos ingresados---");
        System.out.println("nombre:" + nombre);
        System.out.println("edad:" + edad);
        System.out.println("correo:" +correo);
        
        scanner.close();
        
        
        
        
    }
}
