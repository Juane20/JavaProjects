import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    static Scanner keyboardGet = new Scanner(System.in);
    public static void compareResults(Participant p1, Participant p2){
        if(p1.getLastCardPlayed() > p2.getLastCardPlayed()){
            p1.roundWon();
            System.out.println(p1.getName() + " won this round!");
        }
        else if(p1.getLastCardPlayed() < p2.getLastCardPlayed()){
            p2.roundWon();
            System.out.println(p2.getName() + " won this round!");
        }
        else{
            System.out.println("Wow! That was a draw!");
        }
        if(p1.getRoundsWon() >= 2) {
            System.out.println(p1.getName() + " won!");
            System.exit(0);
        }
        else if(p2.getRoundsWon() >= 2){
            System.out.println(p2.getName() + " won!");
            System.exit(0);
        }
        else if(p2.getCards().isEmpty() && p1.getCards().isEmpty() && p1.getRoundsWon() == p2.getRoundsWon()){
            System.out.println("That was a draw!");
            System.exit(0);
        }
        else{
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                //Handle
            }
            System.out.println(p1.getName() + " " + p1.getRoundsWon() + "-" + p2.getRoundsWon() + " " + p2.getName());
        }

    }
    public static void playCard(Participant who){
        boolean isTurn = true;
        if(!Objects.equals(who.getName(), "PC") && !who.getCards().isEmpty()){
            System.out.println(who.getName() + ", these are your cards: ");
            System.out.println(who.getCards());
            while (isTurn){
                System.out.println("What card did you choose?");
                int cardPlayed = keyboardGet.nextInt();
                if(who.getCards().contains(cardPlayed)){
                    System.out.println(who.getName() + " played: " + cardPlayed);
                    who.setLastCardPlayed(cardPlayed);
                    who.removeCard(who.getCards().indexOf(cardPlayed));
                    isTurn = false;
                }
                else{
                    System.out.println("Error, you have not that card.");
                }
            }
        }
        else if(!who.getCards().isEmpty()){
            System.out.println(who.getName() + " is choosing card...");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                //Handle
            }
            who.setLastCardPlayed(who.getCards().get(0));
            System.out.println(who.getName() + " played: " + who.getCards().get(0));
            who.removeCard(0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to The War: Tell me your name: ");
        String playerName = keyboardGet.nextLine();
        Participant human = new Participant(playerName);
        Participant pc = new Participant("PC");
        //Now the game's mechanic
        human.generateCards();
        pc.generateCards();
        //Turns
        playCard(human);
        playCard(pc);
        compareResults(pc, human);
        playCard(human);
        playCard(pc);
        compareResults(pc, human);
        playCard(human);
        playCard(pc);
        compareResults(pc, human);
    }
}