package Test;

public class Cars { //Modifier public make Test.Cars accessible by any class.
    final String model = "Toyota"; //This can't be modified.
    private static void myMethod(){ //Method is only accessible in Test.Cars.

    }
    public static void main(String[] args) {
        Person Elias = new Person("Elias", 5000.00);
        System.out.println(Elias);
    }
}
