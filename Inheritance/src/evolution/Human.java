package evolution;

public class Human extends LivingBeing{
   private final String name, country, eyesColor;
   private int age;
   private double height;
   public void run(double distance){
       System.out.println("Oh, I'm so tired, " + distance + "m was a lot.");
   }
   public void playWithADog(Dog dog){
       System.out.println("Hi " + dog.getName() + " oww, you're beautiful.");
       System.out.println(dog.getName() + " (Seems " + dog.getName() + " to be happy!)");
   }

    @Override
    public void animalSound() {
        System.out.println("Hi!");
    }

    public Human(String environment, int eyesQuantity, int armsQuantity, int legsQuantity, boolean isErect, String name, String country, String eyesColor, double height, int age){
        super(environment, eyesQuantity, armsQuantity, legsQuantity, isErect);
        this.name = name;
        this.country = country;
        this.eyesColor = eyesColor;
        this.height = height;
    }
    public String toString(){
        return super.toString() + "\n" + "Human Attributes:" + "\n" + "Name: " + this.name + "\n" +
                "Country: " + this.country + "\n" +
                "Eyes Color: " + this.eyesColor + "\n" +
                "Height: " + this.height;
    }
}
