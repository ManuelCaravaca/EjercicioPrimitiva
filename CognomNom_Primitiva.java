import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * Programa de simulació de La Primitiva
 * @auhor //TODO: Nom Alumne
 * @version 1.0
 * @date //TODO: data
 */
//TODO: Fer refractor per canviar el nom de la classe
public class CognomNom_Primitiva {
    /**
     * Mètode main executable
     *
     * @param args
     * @since 1.0
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    /**
     * //TODO: Completar
     *
     * @since 1.0
     */
    private static void menuPrincipal() {
        System.out.println("***** PRIMITIVA ******");

        int[] aposta = introduirAposta();
        int[] combinacioGuanyadora = calcularCombinacioGuanyadora();
        int premi;

        if (combinacioGuanyadora != null) {
            System.out.println("La combinació ganadora és: ");

            for (int i = 0; i < combinacioGuanyadora.length - 1; i++) {
                System.out.print(combinacioGuanyadora[i] + " ");
            }

            System.out.println("Reintegrament " + combinacioGuanyadora[combinacioGuanyadora.length - 1]);
        }

        premi = comprovarEncerts(aposta, combinacioGuanyadora);
        System.out.println("El teu premi és: " + premi + " €");
    }

    /**
     * //TODO: Completasr
     *
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int[] introduirAposta() {
        System.out.println("Introdueix la teva aposta: ");
        int[] aposta = null;

        //TODO: Fer el codi del mètode

        return aposta;
    }

    /**
     * //TODO: Completar
     *
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int[] calcularCombinacioGuanyadora() {
        int[] combinacio = null;

        //TODO: Fer el codi del mètode

        return combinacio;
    }

    /**
     * //TODO: Completar
     *
     * @param aposta               //TODO: Completar
     * @param combinacioGuanyadora //TODO: Completar
     * @return //TODO: Completar
     * @since 1.0
     */
    private static int comprovarEncerts(int[] aposta, int[] combinacioGuanyadora) {
        int premi = 0;
        int encerts = 0;
        boolean reintregrament = false;

        //Comprobar encerts a la combinació
        //TODO: Fer el codi del mètode

        //Comprobar reintegrament
        //TODO: Fer el codi del mètode

        //Calcular premi
        //TODO: Fer el codi del mètode

        return premi;
    }

    /**
     * Aquest mètode llegeix un enter per teclat dins d'un domini determinat
     *
     * @param missatge parametritzat per a mostrar a l'usuari@
     * @param min      valor min acceptat
     * @param max      valor max acceptat
     * @return retorna un int
     * @since 1.0
     */
    private static int llegirInt(String missatge, int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);

        return x;
    }

    /**
     * Aquest mètode serveix per capturar floats des de teclat amb control d'errors
     *
     * @param missatge
     * @return
     * @since 1.0
     */
    private static float llegirFloat(String missatge) {
        Scanner llegir = new Scanner(System.in);
        float x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.print(missatge);
            valorCorrecte = llegir.hasNextFloat();

            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no float.");
            } else {
                x = llegir.nextFloat();
            }
            llegir.nextLine();
        } while (!valorCorrecte);

        return x;
    }

    public static int[] calcularCombinacion() {
        int[] combinacionGanadora = new int[6];

        // Generamos combinación ganadora
        for (int i = 0; i < 6; i++) {
            int numeroAleatorio;
            do {
                // Generar un numero aleatorio
                numeroAleatorio = new Random().nextInt(49) + 1;
            } while (contieneNumero(combinacionGanadora, numeroAleatorio)); // Evitaremos duplicats
            combinacionGanadora[i] = numeroAleatorio;
        }

        // Obtenir numero aleatorio (entre 0 y 9)
        int reintegro = new Random().nextInt(10);

        // Combinamos resultados en el array
        int[] combinacionFinal = Arrays.copyOf(combinacionGanadora, 7);
        combinacionFinal[6] = reintegro;

        return combinacionFinal;
    }

    // Metodo para verificar los numeros en el array
    public static boolean contieneNumero(int[] array, int numero) {
        for (int i : array) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }

    // Método para imprimir contenido
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}





