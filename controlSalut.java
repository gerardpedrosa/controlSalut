import java.util.InputMismatchException;
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
        while (true) {
            //Menú
            System.out.println("Elegeix que vols fer");
            System.out.println("a) Introduir dades");
            System.out.println("b) Modificar dades");
            System.out.println("c) Visualitzar dades");
            System.out.println("d) Sortir");
            String opcions = scanner.nextLine();

            switch (opcions) {
                case "a":
                    System.out.println("a) Introduir dades");
                    System.out.println("Introdueix el teu nom complet:");
                    nomComplet = scanner.nextLine();
                    if (nomComplet.equals("")) {
                        System.out.println("El nom no pot estar buit. Torna-ho a intentar.");
                        break;
                    }
                    
                    try {
                        System.out.println("Introdueix la teva edat:");
                        edat = scanner.nextInt();
                        if (edat < 0 || edat > 120) {
                            System.out.println("Edat no vàlida. Torna-ho a intentar.");
                            scanner.nextLine();
                            break;
                        }
                        scanner.nextLine();
                    } 
                    catch (InputMismatchException e) {
                        System.out.println("Edat no vàlida. Torna-ho a intentar.");
                        scanner.nextLine();
                        break;
                    }
                    try {
                    System.out.println("Introdueix el teu pes (kg):");
                    pes = scanner.nextDouble();
                    if (pes <= 0 || pes > 500) {
                        System.out.println("Pes no vàlid. Torna-ho a intentar.");
                        scanner.nextLine();
                        break;
                    } else if ((pes * 100) % 1 != 0) {
                        System.out.println("Pes no vàlid. Torna-ho a intentar introduint un màxim de 2 decimals.");
                        scanner.nextLine();
                        break;
                    }   
                    } catch (Exception e) {
                        System.out.println("Pes no vàlid. Només pots entrar caràcters que siguin números.");
                        scanner.nextLine();
                        break;
                    }
                    
                    scanner.nextLine();
                    try {
                        System.out.println("Introdueix la teva alçada (m):");
                        alçada = scanner.nextDouble();
                    if (alçada <= 0.5 || alçada >= 2.5) {
                        System.out.println("Alçada no vàlida,ha de ser entre 0.5 i 2.5 metres");
                        scanner.nextLine();
                    break;
                    }
                    } catch (Exception e) {
                        System.out.println("Alçada no vàlid. Només pots entrar caràcters que siguin números.");
                        scanner.nextLine();
                    break;
                    }
                    scanner.nextLine();

                case "b":
                    System.out.println("b) Modificar dades");
                    break;
                case "c":
                    System.out.println("c) Visualitzar dades");
                    break;
                case "d":
                    System.out.println("d) Sortir");
                    return;
            }
        }
    }
}
