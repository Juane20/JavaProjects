package evolution;
import enums.Level;
public class Main {
    public static void main(String[] args) {
        //I'll do a Human named Elias.
        Human Elias = new Human("Surface", 2,2,2,true,"Elias","Argentina","Green",1.77,19);
        System.out.println(Elias);
        Elias.run(10);
        //I'll do a Dog called Brunito.
        Dog Brunito = new Dog("Surface", 2,2,2,false,"Brunito","Black","Pinscher/Poodle", 1);
        Brunito.animalSound();
        System.out.println(Brunito);
        Elias.playWithADog(Brunito);
        //Enums
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }

    }
}