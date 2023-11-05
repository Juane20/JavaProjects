package evolution;

public class Dog extends LivingBeing{
    private final String name, color, breed;
    private int age;
    public void animalSound(){
        System.out.println("Woof! Woof!");
    }
    public Dog(String environment, int eyesQuantity, int armsQuantity, int legsQuantity, boolean isErect, String name, String color, String breed, int age) {
        super(environment, eyesQuantity, armsQuantity, legsQuantity, isErect);
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return super.toString() + "\n" + "Dog Attributes: " + "\n" +
                "Name: " + this.name + "\n" + "Color: " + this.color + "\n" +
                "Breed: " + this.breed;
    }
}
