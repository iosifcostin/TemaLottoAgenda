import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lotto {

    public static void main(String[] args) {

        int[] numereAgentie = genereazaNumere();
        System.out.println("Numere castigatoare : ");
        printNumere(numereAgentie);

        int[] numereBilet = genereazaNumere();
        System.out.println("Numerele primului bilet : ");
        printNumere(numereBilet);


        int numerePotrivite = comparaNumere(numereAgentie, numereBilet);
        int contor = 1;

        while (numerePotrivite<6)
        {
            numereBilet = genereazaNumere();
            contor++;
            System.out.println(contor);
            numerePotrivite = comparaNumere(numereAgentie, numereBilet);

        }
        System.out.println("Esti castigator a " +numerePotrivite+ " numere, dupa " + contor + " de jocuri");
        System.out.println("Numere agentie: ");
        printNumere(numereAgentie);
        System.out.println("Numere Bilet: ");
        printNumere(numereBilet);

    }

    static int[] genereazaNumere() {                            // metoda pentru a genera 6
        int numereGenerate[] = new int[6];                      // numere diferite unul de altul
        ArrayList<Integer> numbers = new ArrayList();           // si a le pune intr-un sir
        for (int i = 0; i < 49; i++) {                          //
            numbers.add(i + 1);
        }
        Collections.shuffle(numbers);
        for (int i = 0; i < 6; i++) {
            numereGenerate[i] = numbers.get(i);
        }
        return numereGenerate;


    }


    // SAU ASA : ......


//    static int[] genereazaNumere
//    {
//
//        int numereGenerate [] = new int[6];
//
//        for (int i = 0; i<numereGenerate.length; i++)
//        {
//            numereGenerate[i] = new Random().nextInt(49)+1;
//        }
//
//        Arrays.sort(numereGenerate);
//
//        for (int i = 1; i<numereGenerate.length; i++){
//
//            while (numereGenerate[i] == numereGenerate [i-1]){
//
//                numereGenerate [i] = new Random().nextInt(49)+1;
//
//                Arrays.sort(numereGenerate);
//            }
//        }
//
//        return numereGenerate;
//    }


    // SAU ASA : .......


//    static int[] genereazaNumere()
//    {
//
//        int numereGenerate [] = new int[6];
//
//        for (int i = 0; i<numereGenerate.length; i++)
//        {
//            numereGenerate[i] = new Random().nextInt(49)+1;
//        }
//
//        sortare(numereGenerate);
//
//        for (int i = 1; i<numereGenerate.length; i++){
//
//            while (numereGenerate[i] == numereGenerate [i-1]){
//
//                numereGenerate [i] = new Random().nextInt(49)+1;
//
//                sortare(numereGenerate);
//            }
//        }
//
//        return numereGenerate;
//    }

    static void sortare(int [] sir )
    {
        sir = new int[6];

        int maiMare = 0;

        for (int i = 0; i < sir.length; i++)
        {
            for (int j = 1; j < sir.length; j++)
            {
                if (sir[j-1] > sir [j] )

                    maiMare = sir[j-1];
                sir[j-1] = sir[j];
                sir[j] = maiMare;
            }
        }
    }

    static int comparaNumere (int [] nums1 , int [] nums2)      // metoda pentru comparatie
    {
        int gasite = 0;
        for (int i=0; i<6; i++)
            for (int j=0; j<6; j++){
                if (nums1[i] == nums2[j])
                    gasite++;
            }return gasite;
    }

    static void printNumere(int[] ticket) {                    // metoda pentru afisare
        for (int i = 0; i < 6; i++) {
            System.out.println(ticket[i]);
        }
        System.out.println();

    } // end method
}  // end class