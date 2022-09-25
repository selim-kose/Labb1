import java.util.Scanner;


// En klass som visar menyn och vilket program som ska köras.
public class MenuUI extends Logic {
    static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {

        //Loop som visar menyn till man anger "e" som stoppar loopen
        while (true) {
            System.out.println("""
                      
                    Make a choice!
                                    
                    1. Upp och Ner
                    2. Min Max
                    3. Sten Sax Påse
                    4. Ordning och reda
                    e. Avsluta
                    """);

            //Ber användaren om en siffra för att göra valet i menyn
            System.out.print(">");
            String input = scanner.nextLine();

            //Beroende på vilken siffra användaren matar in körs respektive metod
            switch (input) {
                case "1" -> upSideDown();
                case "2" -> minMax();
                case "3" -> rockPaperScissors();
                case "4" -> order();
                case "e" -> System.exit(0);
                default -> System.out.println("Wrong input, try again!");
            }

        }

    }


}



