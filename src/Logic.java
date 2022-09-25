
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Logic {
    static Scanner scanner = new Scanner(System.in);


    //Metod som kör programmet upSideDown som ändrar ordningen på vektorn
    public static void upSideDown() {
        int numberOfWords = 5; // anger antal ord i vektorn
        int counter = 0; // håller koll på räkningen i loopen

        String[] list = new String[numberOfWords]; //Skapar en vektor av typen String.Storleken anges av var numberOfWords

        //priontar
        System.out.println("Enter " + numberOfWords + " words, 'END' quits");

        while (counter <= numberOfWords-1) {
            String userInput = scanner.nextLine();

            if (userInput.equals("END")) {
                break;
            }

            list[counter] = userInput;
            counter++;
        }
        for (int i = numberOfWords - 1; i >= 0; i--) {
            if (list[i] != null) {
                System.out.println(list[i]);
            }
        }

    }

    // Metod som anger min och max efter att användaren anger 5 heltal.
    public static void minMax() {
        int min = 0;
        int max = 0;
        int counter = 0;


        //Skapar en vektor med 5 platser.
        int[] list = new int[5];

        //En print som ber användaren om 5 heltal
        System.out.println("Enter 5 integers below:");

        //En loop som körs till variabeln counter når 4. Counter stiger med 1 för varje loop
        //För varje loop läses även ett heltal från användaren. Totalt 5st läses in
        while (counter < 5) {
            list[counter] = scanner.nextInt();
            counter++;
        }

        //Min och max deffineras här med talen från första platsen i vektorn. Vi kommer sedan att jämföra de mot alla
        //andra tal i vektorn
        for (int i = 0; i < list.length; i++) {
            min = list[0];
            max = list[0];


        //Här är en if-sats som går igenom alla tal i vektorn och jämför de min variabeln. På så sätt för vi fram
        // det minsta talet.
            if (list[i] < min) {
                min = list[i];
            }

        //Här gör vi samma sak fast jämför talen med variabeln max för att ta reda på vilket är det störta talet
        //i vektorn
            if (list[i] > max) {
                max = list[i];
            }

        }
        //Skriver ut variablerna min max
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

    }


    //Metod som kör spelet Sten Sax Påse
    public static void rockPaperScissors() {
        int scoreUser = 0; // användarens poäng
        int scoreCPU = 0; // datorns poäng
        String[] weapons = {"rock", "paper", "scissors"}; // en vektor som innehåller de val datorn kan göra.
        Random random = new Random(); //Objekt av klassen random. Kommer användas sedan för att slumpa CPU val


        //Loop som ber användaren om ett val
        while (true) {
            System.out.println("""
                                    
                    Make a choice:
                                    
                    rock
                    paper
                    scissors
                                    
                    """);
            System.out.print(">");

            //Användarens val läses in. Metoden toLowerCase och trim körs för att eliminera fel input av användaren.
            //Som stora bokstäver blir små och mellanslag tas bort.
            String userInput = scanner.nextLine().toLowerCase().trim();

            //Om användaren anger något annat än "rock", "paper" eller "scissors" får man en prompt om felaktigt val.
            if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissors")) {
                System.out.println("##############");
                System.out.println("Invalid choice!!!");
                System.out.println("User score: " + scoreUser);
                System.out.println("CPU score: " + scoreCPU);
                System.out.println("##############");

                //Här slumpas ett ord från vektorn weapons som innehåller orden "rock", "paper" och "scissors"
                //som sedan tilldelas till datorn
            } else {
                String cpuChoice = weapons[random.nextInt(weapons.length)];
                System.out.println("##############");
                System.out.println("User Chose: " + userInput + "\t" + "CPU chose: " + cpuChoice);

                //Regler som avgör vem som vinner.

                //Första satsen avser fallen när användaren vinner
                if (userInput.equals("rock") && cpuChoice.equals("scissors") || userInput.equals("paper") && cpuChoice.equals("rock") || userInput.equals("scissors") && cpuChoice.equals("paper")) {
                    System.out.println("##############");
                    System.out.println("User won!!!");
                    scoreUser++;
                    System.out.println("User score: " + scoreUser);
                    System.out.println("CPU score: " + scoreCPU);

                    System.out.println("##############");


                // Denna sats avser när det är oavgjort
                } else if (userInput.equals(cpuChoice)) {
                    System.out.println("##############");
                    System.out.println("DRAW!!!");
                    System.out.println("User score: " + scoreUser);
                    System.out.println("CPU score: " + scoreCPU);
                    System.out.println("##############");

                //Denna sats avser när CPU vinner
                } else {
                    System.out.println("##############");
                    System.out.println("CPU won!!!");
                    scoreCPU++;
                    System.out.println("User score: " + scoreUser);
                    System.out.println("CPU score: " + scoreCPU);
                    System.out.println("##############");
                }

            //Printar vem som vann när villkoren nedan möts, dvs den som först når till 3
            }
            if (scoreUser == 3) {
                System.out.println("CONGRATULATIONS, YOU WON!!!");
                break;
            }
            if (scoreCPU == 3) {
                System.out.println("GAME OVER, YOU LOST!!!");
                break;
            }

        }


    }

    //Metoden som kör programmet order
    public static void order() {

        int min;
        int min2;

        int max;
        int max2;

        boolean order = true;
        int sum = 0;
        int counter = 0;

        int[] list = new int[5];

        System.out.println("Enter 5 integers below:");

        while (counter < 5) {
            list[counter] = scanner.nextInt();
            counter++;
        }

        for (int i = 0; i < list.length; i++) {
            sum += list[i];

            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    order = false;
                    break;
                }
            }

        }

        //Sorterar vektorn och tilldelar variablerna med korrekt värde.
        Arrays.sort(list);
        min = list[0];
        min2 = list[1];
        max = list[4];
        max2 = list[3];

        //Printar ut alla variabler med en text som förklarar vilket
        System.out.println("Min value: " + min);
        System.out.println("2min value: " + min2);
        System.out.println("Max value: " + max);
        System.out.println("2Max value: " + max2);
        System.out.println("In order: " + order);
        System.out.println("Sum: " + sum);

    }




}



