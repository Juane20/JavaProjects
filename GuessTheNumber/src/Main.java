import java.util.Scanner;
public class Main {
    static int generateRandomNumberUntilN(int n){
        return (int) (Math.random() * (n+1));
    }
    static int tellToGuess(){
        System.out.println("Guess it: ");
        Scanner keyboardGet = new Scanner(System.in);
        return keyboardGet.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Hi! Select number range to generate. From 0 to... (select positive, please)"); //Greetings
        Scanner keyboardGet = new Scanner(System.in); //Scanner necessary line.
        int rangeSelected = keyboardGet.nextInt(); //I save the input in rangeSelected.
        int secretNumber = generateRandomNumberUntilN(rangeSelected);
        int attempts = (int) ((rangeSelected * 0.016) + 4);
        System.out.println("Ok! I've selected the number, you have: " + attempts + " attempts.");
        while (attempts > 0){
            int numberSelected = tellToGuess();
            if (numberSelected == secretNumber){
                System.out.println("Congratulations! You won.");
                break;
            }
            else{
                attempts--;
                if(numberSelected < secretNumber){
                    System.out.println("Too small. You have now: " + attempts + " attempts.");
                }
                else {
                    System.out.println("Too big. You have now: " + attempts + " attempts.");
                }
            }
            if (attempts == 0){
                System.out.println("Sorry. You lose. The number was: " + secretNumber);
            }
        }
    }
}