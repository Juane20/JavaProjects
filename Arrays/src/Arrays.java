public class Arrays {
    public static void main(String[] args) {
        //An array is a type of variable that includes many elements.
        int[] ages = {19, 20, 13, 59, 12, 44};
        //I can access to some element with []:
        System.out.println(ages[1]); //This will print 20, index starts in 0.
        //Also, I can loop through an array, with, for example, a for loop.
        for(int i = 0; i <= (ages.length - 1); i++){ //Array length returns 6 in this case.
            System.out.println(ages[i]);
        }
        //And I can use the for each, to make it shorter. (And change an array element!)
        ages[0] = 100;
        for(int i : ages){
            System.out.println("Another way: " + i);
        }
        //Multidimensional arrays: These kinds of arrays are used like
        String[][] nameAndSurname = { {"Juan", "Nat"}, {"Cabrera", "Da Cruz"}};
        System.out.println(nameAndSurname[0][0] + " " + nameAndSurname[1][0]);
        System.out.println(nameAndSurname[0][1] + " " + nameAndSurname[1][1]);
        //Loop through a multidimensional array.
        for (String[] strings : nameAndSurname) {
            for (String string : strings) {
                System.out.println(string);
            }
        }
    }
}