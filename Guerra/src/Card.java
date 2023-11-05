public class Card {
    public Integer randomizeCard(){
        return (int) (Math.random() * 20 + 1);
    }
    private Integer value = randomizeCard();
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
}
