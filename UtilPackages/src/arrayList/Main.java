package arrayList;
import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Volkswagen");
        cars.add("Chevrolet");
        cars.add("BMW");
        System.out.println(cars.get(0)); //I print the first element of cars.
        System.out.println(cars.size()); //This will return 2.
        //Loop in an ArrayList.
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        //foreach
        for(String i : cars){
            System.out.println("This is another method: " + i);
        }
        //Now I'll make another ArrayList and sort both of them.
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(19);
        ages.add(20);
        ages.add(40);
        ages.add(23);
        ages.add(15);
        //Now I'll sort it
        Collections.sort(ages);
        for(int i : ages){
            System.out.println(i);
        }
        //We also can sort Strings
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }
    }
}
