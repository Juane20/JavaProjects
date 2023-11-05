public class Fruits {
    String fruitName; //Attribute
    String fruitColor; //Attribute
    public Fruits(String name, String color){
        fruitColor = color;
        fruitName = name;
    }
    public void isTasty(){ //A "public" method can only be accessed through objects.
        double randomValue = Math.random();
        String fruitA = this.fruitName;
        if(randomValue > 0.5){
            System.out.println("The " + fruitA + " is very tasty!");
        }
        else{
            System.out.println("The " + fruitA + " is not tasty!");
        }
    }
    public static void main(String[] args) {
        Fruits apple = new Fruits("Apple", "Red");
        Fruits banana = new Fruits("Banana", "Red");
        System.out.println("The " + apple.fruitName + " is " + apple.fruitColor);
        System.out.println("The " + banana.fruitName + " is " + banana.fruitColor);
        //Now I'll do a Milkshake.
        apple.isTasty();
        banana.isTasty();

    }
}
