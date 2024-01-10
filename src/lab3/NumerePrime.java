package lab3;

public class NumerePrime {
    // Metoda pentru a verifica dacă un număr este prim
    static boolean estePrim(int numar) {
        if (numar <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numar); i++) {
            if (numar % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Metoda pentru a afișa numerele prime dintr-un șir
    static void afiseazaNumerePrime(int[] sir) {
        System.out.print("Numere prime din sir: ");
        for (int numar : sir) {
            if (estePrim(numar)) {
                System.out.print(numar + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Exemplu de utilizare
        int[] sirDeNumere = {2, 3, 5, 7, 10, 13, 15, 17, 19, 23};
        afiseazaNumerePrime(sirDeNumere);
    }
}

