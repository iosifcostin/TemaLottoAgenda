public class Agenda { // begin class

    static final int MAX=10;
    static String[] agenda = new String[MAX];
    static final int EXIT=6;


    public static void main(String[] args)
    { // begin main

        afiseazaOptiuni();
        int optiune = SkeletonJava.readIntConsole("Alege o optiune :");

        while(optiune!=EXIT)
        {
            if(optiune>EXIT)
                System.out.println("Optiune inexistenta");
            System.out.println("Ati ales:"+optiune);

            switch(optiune)
            {

                case 1: afisareAgenda(); break;
                case 2: cautare(); break;
                case 3: adaugare(); break;
                case 4: modificare(); break;
                case 5: stergere(); break;
                case 6: System.exit(0);

            }

            afisareAgenda();
            optiune = SkeletonJava.readIntConsole("optiunea dvs:");

        } // end while

    } // end main

    static void afisareAgenda()
    {                                               // metoda pentru afisare agenda
        for (String t : agenda)
        {
            if (t != null)
                System.out.println(t);
        }
    } // end metoda


    static void cautare()                                                      // metoda de cautare
    {
        String cautaNume = SkeletonJava.readStringConsole("Ce cautati? : ");

        boolean gasit = false;

        for (int i = 0; i<agenda.length; i++)
        {

            if (cautaNume.equals(agenda[i]))
            {
                gasit = true;
                break;
            }

        } // end for loop

        if (gasit)
        {
            System.out.println("L-am gasit" );
        }
        else
        {
            System.out.println(cautaNume + " Nu exista");
        }

    } // end metoda


    static void adaugare()                                                        // metoda de adaugare
    {
        String nume = SkeletonJava.readStringConsole("Nume si telefon : ");
        int index=0;
        boolean adaugat=false;
        for(int i=0;i<agenda.length; i++)
        {
            if(agenda[i]==null)
            {
                agenda[i]=nume;
                adaugat=true;
                break;
            }
        } // end loop

        if(!adaugat)
            System.out.println("Agenda este plina !");

    } // end metoda


    static void modificare ()
    {
        String identifica = SkeletonJava.readStringConsole("Ce doriti sa modificati ? : ");
        String modifica = SkeletonJava.readStringConsole("Modificati ... : ");

        boolean ysf = false;

        for (int i = 0; i < agenda.length; i++) {

            if (identifica.equals(agenda[i]))
            {
                agenda[i] = agenda[i].replaceAll(agenda[i], modifica);
                ysf = true;
            }
        }
        if (!ysf)
            System.out.println("Mai incearcati odata");

    }  // end metoda

    static void stergere () {

        String stergere = SkeletonJava.readStringConsole("Ce doriti sa stergeti ? : ");

        boolean ysf = false;

        for (int i = 0; i<agenda.length; i++) {

            if (stergere.equals(agenda[i]))
            {
                agenda[i] = null;
                ysf = true;
            }

        }
        if (!ysf)
            System.out.println("Mai incearcati odata");
    } // end metoda


    static void afiseazaOptiuni(){                         // metoda pentru afisare optiuni
        System.out.println("1. Afisare");
        System.out.println("2. Cautare");
        System.out.println("3. Adaugare");
        System.out.println("4. Modificare");
        System.out.println("5. Stergere");
        System.out.println("6. Exit");

    } // end metoda
} // end class