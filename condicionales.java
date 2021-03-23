import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner Entrada = new Scanner(System.in);
    System.out.println("ingrese un número:");
    int username = Entrada.nextInt();
    
    if (username>100) {
      System.out.println("El número que puso es mayor que 100 y es el número " + username);
    } else {
      System.out.println("El número que puso es menor que el numero 100 y es el " + username);
    }
  }
}
