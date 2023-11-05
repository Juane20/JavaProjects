import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<Integer> checkLetter(char letter, ArrayList<Character> word){
        ArrayList<Integer> foundIndexes = new ArrayList<Integer>();
        for(int i = 0; i < word.size(); i++){
            if(word.get(i).equals(letter)){
                foundIndexes.add(i);
            }
        }
        return foundIndexes;
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> possibleWords = new ArrayList<String>();
        try {
            File file = new File("words.txt");
            Scanner scannerFile = new Scanner(file);
            while(scannerFile.hasNextLine()){
                String word = scannerFile.nextLine();
                possibleWords.add(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int attempts = 6;
        int randomNumber = (int) (Math.random() * possibleWords.size());
        String randomWord = possibleWords.get(randomNumber);
        StringBuilder hiddenWord = new StringBuilder();
        ArrayList<Character> arrayWord = new ArrayList<Character>();
        char letter;
        ArrayList<Integer> foundIndexes = new ArrayList<Integer>();
        for(int i = 0; i < randomWord.length(); i++) {
            hiddenWord.append("_ ");
            arrayWord.add(i, randomWord.charAt(i));
        }
        Scanner getKeyboard = new Scanner(System.in);
        System.out.println("""
                Hi! This is The Hangman Game!
                We already choosed your word:\s""");
        while(attempts > 0 && hiddenWord.toString().contains("_")){
            System.out.println(hiddenWord + "(" + randomWord.length() + " letters)");
            System.out.println("You have " + attempts + " attempts.");
            System.out.println("Try a letter:");
            letter = getKeyboard.next().charAt(0);
            foundIndexes = checkLetter(letter, arrayWord);
            for(int j = 0; j < foundIndexes.size(); j++) {
                hiddenWord.setCharAt(foundIndexes.get(j) * 2, arrayWord.get(foundIndexes.get(j)));
            }
            if(!foundIndexes.isEmpty()){
                System.out.println("Well! You've guessed " + foundIndexes.size() + " letters!");
            }
            else{
                System.out.println("You didn't guess any letter.");
                attempts--;
            }
        }
        if(attempts <= 0 && !hiddenWord.toString().contains("_")){
            System.out.println("You won!");
        }
        else if(attempts <= 0 && hiddenWord.toString().contains("_")){
            System.out.println("Sorry, you lost.");
            System.out.println("The word was: " + randomWord);
        }
        else{
            System.out.println("You won!");
        }
}
}