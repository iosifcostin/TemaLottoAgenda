import java.util.Random;

public class LottoBubbleSort{

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

    static int[] genereazaNumere()
    {

        int numereGenerate [] = new int[6];

        for (int i = 0; i<numereGenerate.length; i++)
        {
            numereGenerate[i] = new Random().nextInt(49)+1;
        }

        sortare(numereGenerate);

        for (int i = 0; i < numereGenerate.length; i++)
        {

            for (int j = 1; j < numereGenerate.length; j++)
            {
                if (numereGenerate[j-1] == numereGenerate[j])
                {
                    numereGenerate[j] = new Random().nextInt(49)+1;

                    while (numereGenerate[j-1] == numereGenerate[j])
                        numereGenerate[j] = new Random().nextInt(49)+1;
                    sortare(numereGenerate);
                }
            }
        }

        return numereGenerate;
    }


    static int comparaNumere (int [] nums1 , int [] nums2)
    {
        int gasite = 0;
        for (int i=0; i<6; i++)
            for (int j=0; j<6; j++){
                if (nums1[i] == nums2[j])
                    gasite++;
            }return gasite;
    }

    static void printNumere(int[] ticket) {
        for (int i = 0; i < 6; i++) {
            System.out.println(ticket[i]);
        }
        System.out.println();

    } // end method

    static void sortare(int [] sir )
    {

        for (int i = 0; i < sir.length; i++)
        {
            for (int j = 1; j < sir.length; j++)
            {
                if (sir[j-1] > sir [j] )
                {
                    int maiMare = sir[j - 1];
                    sir[j - 1] = sir[j];
                    sir[j] = maiMare;
                }
            }
        }
    }
}  // end class