import java.util.Scanner;

public class controlSalut {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //variables
    String nomComplet;
    int edat;
    double pes;
    double alçada;

    //Introducció
    System.out.println("Benvingut al programa de control de salut");

    //Menú
    System.out.println("Elegeix que vols fer");
    System.out.println("a) Introduir dades");
    System.out.println("b) Modificar dades");
    System.out.println("c) Visualitzar dades");
    String opcions = scanner.nextLine();

    switch (opcions) {
        case "a":
            System.out.println("a) Introduir dades");
            break;
        case "b":
            System.out.println("b) Modificar dades");
            break;
        case "c":
            System.out.println("c) Visualitzar dades");
        default:
            break;
    }
    }
}