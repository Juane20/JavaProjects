import java.lang.reflect.Array;
import java.util.ArrayList;
public class Participant {
    private String name;
    private int roundsWon = 0;
    private int lastCardPlayed;

    public int getLastCardPlayed() {
        return lastCardPlayed;
    }

    public void setLastCardPlayed(int lastCardPlayed) {
        this.lastCardPlayed = lastCardPlayed;
    }

    public int getRoundsWon() {
        return roundsWon;
    }
    public void roundWon() {
        this.roundsWon += 1;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private ArrayList<Integer> cards = new ArrayList<Integer>();

    public ArrayList<Integer> getCards() {
        return cards;
    }
    public void removeCard(int index) {
        this.cards.remove(index);
    }
    public void generateCards() {
        for(int i = 0; i < 3; i++){ //I generate the 4 random AI Cards.
            Card card = new Card();
            cards.add(card.getValue()); //I add the random value generated to the ArrayList.
        }
    }
    public Participant(String name){
        this.setName(name);
    }
}
