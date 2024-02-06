import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is Number Guessing Game!!!!");
        
        Scanner readInput = new Scanner(System.in);

        System.out.print("Do you want to play??(YES/NO): ");
        String ansUser = readInput.nextLine();

        while (!(ansUser.toUpperCase().equals("YES")) && !(ansUser.toUpperCase().equals("NO"))) {
            
            System.out.print("Enter only 'YES/NO': ");
            ansUser = readInput.nextLine();
        }

        
        while(ansUser.toUpperCase().equals("YES")){
            
            try{
                System.out.println("Enter the minimum and maximum number between which you want to play with!!!!");
                System.out.print("Enter minimum number: ");
                int min = readInput.nextInt();
                System.out.print("Enter maximum number: ");
                int max = readInput.nextInt();
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                System.out.print("Guess the number!!: ");
                int guessNum = readInput.nextInt();
                

                while((guessNum > max) || (guessNum < min)){
                    System.out.println("Enter the number between min and max values");
                    System.out.print("Guess the number!!: ");
                    guessNum = readInput.nextInt();
                }

                if(guessNum < randomNum){
                    System.out.println("Guessed Number is less than the correct number");
                }
                else if(guessNum > randomNum){
                    System.out.println("Guessed Number is greater than the correct number");
                }
                else if(guessNum == randomNum){
                    System.out.println("You have guessed the number correctly!!! Congratulations!! :-) ");;
                }

                System.out.println("Note: This will start a fresh game");
                System.out.print("Do you want to continue playing (YES/NO): ");
                ansUser = readInput.next();
            }
        
            catch(Exception value){
                System.out.println("Invalid Character!!");
                break;
            }

        }
        System.out.print("Thank You for trying out the game!!!");
        readInput.close();
    }
}
