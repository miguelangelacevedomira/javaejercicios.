import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
    
        System.out.println("¿que area desea calcular?");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. circulo");
        System.out.print("opcion ");
        System.out.println("ingrese el numero de la opcion");
        int opcion = entrada.nextInt();
       
       switch(opcion){
          
           case 1:
               System.out.print("Base del triangulo");
               double baseTri = entrada.nextDouble();
               System.out.print("Altura del triangulo");
               double alturaTri = entrada.nextDouble();
               double areaTri = (baseTri * alturaTri);
               System.out.print("Area  del triangulo:" +areaTri);
               break;
               
            case 2:
                System.out.print("Base del rectangulo:");
                double baseRec = entrada.nextDouble();
                System.out.print("Altura del rectangulo:");
                double alturaRec = entrada.nextDouble();
                double areaRec = (baseRec * alturaRec);
                System.out.println("Area del rectangulo:" + areaRec);
                break;
                
            case 3:
                System.out.print("Radio del circulo:");
                double radioCir = entrada.nextDouble();
                double areaCir = 3.1416 * radioCir * radioCir;
                System.out.println("area del circulo:" + areaCir);
                break;
                
                default:
                   System.out.println("opcion no valida:");
                   break;
                   
              }
        entrada.close();
            
    }
}
