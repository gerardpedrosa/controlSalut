import java.util.InputMismatchException;
import java.util.Scanner;

public class controlSalut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //variables principals
        String nomComplet = "";
        int edat = -1;
        double pes = -1;
        double alçada = -1;

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
                    break;

                case "b":
                    System.out.println("b) Modificar dades");

                    System.out.println("Quina dada vols modificar?");
                    System.out.println("1) Nom complet");
                    System.out.println("2) Edat");
                    System.out.println("3) Pes");
                    System.out.println("4) Alçada");
                    String opcioModificacio = scanner.nextLine();
            switch (opcioModificacio) {
                case "1":
                    System.out.println("Introdueix el nou nom complet:");
                     String nouNom = scanner.nextLine();
                if (!nouNom.equals("")) {
                    nomComplet = nouNom;
                    System.out.println("Nom modificat correctament.");
                    } else {
                    System.out.println("El nom no pot estar buit.");
                }
                break;

            case "2":
                try {
                    System.out.println("Introdueix la nova edat:");
                    int novaEdat = scanner.nextInt();
                if (novaEdat < 0 || novaEdat > 120) {
                    edat = novaEdat;
                    System.out.println("Edat modificada correctament.");
                } else {
                    System.out.println("Edat no vàlida.");
                }
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Edat no vàlida. Torna-ho a intentar.");
                    scanner.nextLine();
                }
                break;

            case "3":
                try {
                    System.out.println("Introdueix el nou pes (kg):");
                    double nouPes = scanner.nextDouble();
                if (nouPes <= 0 || nouPes > 500 && (nouPes * 100) % 1 == 0) {
                    pes = nouPes;
                    System.out.println("Pes modificat correctament.");
                } else {
                    System.out.println("Pes no vàlid.");
                }
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Pes no vàlid. Només pots entrar números.");
                    scanner.nextLine();
                }
                break;

            case "4":
                try {
                    System.out.println("Introdueix la nova alçada (m):");
                    double novaAlçada = scanner.nextDouble();
                if (novaAlçada <= 0.5 || novaAlçada >= 2.5) {
                    alçada = novaAlçada;
                    System.out.println("Alçada modificada correctament.");
                } else {
                    System.out.println("Alçada no vàlida.");
                }
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Alçada no vàlida. Només pots entrar números.");
                    scanner.nextLine();
                }
                break;
                default:
                    System.out.println("Opció no vàlida.");
                break;
                }
                break;
                case "c":
                    System.out.println("c) Visualitzar dades");
                    break;
                case "d":
                    System.out.println("Estàs segur que vols sortir? (si/no)");
                    String confirmacio = scanner.nextLine().toLowerCase();
                if (confirmacio.equals("si")) {
                    System.out.println("Gràcies per utilitzar el programa de control de salut.");
                return;
                } else {
                    System.out.println("Tornant al menú principal...");
                }
                break;
            }
        }
    }
}