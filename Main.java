import java.util.Scanner; //Do wpisywania treści
import java.lang.Math; //Do obliczeń
class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj imię:");
    String name = scanner.nextLine(); //Wpisywanie treści w konsole, nazwa dowolna

    System.out.println("Podaj wiek:");
    int age = scanner.nextInt(); //int
    
    System.out.println("Cześć " + name); //Treść wyświetlana w konsoli
    
    if (!name.isEmpty() && name.endsWith("a")){ //Sprawdzanie czy nie jest puste, kończy się na a operator AND
      System.out.println("Jesteś kobietą");
    } 
      else if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Kuba"))) { //Sprawdzanie czy nie jest puste, nie kończy się na a, OR rowna sie
      System.out.println("Jesteś mężczyzną");
    } 
    else {
      System.out.println("Podane imię nie może być puste");
    }
    if (age >= 18) {
      System.out.println("Jesteś pełnoletni");
    } else {
      System.out.println("Jesteś niepełnoletni");
    }
  }
}