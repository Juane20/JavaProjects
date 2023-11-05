public class Main {
    public static void main(String[] args) {
        //This is a commentary (one line)
        /*
        This is a multi-line commentary.
         */
        System.out.println("Starting... 0%");
        //To do a variable, first, I need to specify the data type.
        String myString = "This is a string.";
        System.out.println(myString); //Printing a variable
        myString = "I changed!"; //We can change the value of a variable.
        System.out.println(myString); //Printing the variable with the new value.

        //Integer type
        Integer myInt = 12;
        myInt = myInt + 4; //The new value will be 16.
        System.out.println(myInt);

        //Double type
        Double myDouble = 6.5;
        Double otherDouble = 6d;

        //Float type
        Float myFloat = 6.5f; //I need to specify that's a float because Java assumes it's a double.
        System.out.println(myFloat + myDouble + myInt);

        //Boolean type
        Boolean myBoolean = true;
        Boolean otherBoolean = false;
    }
}