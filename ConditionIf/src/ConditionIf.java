public class ConditionIf {
    public static double truncateOrRound(double value) {
        double integerPart = Math.floor(value); //I grab the integer part
        double decimalPart = value - integerPart; //This difference gets the decimal part.

        if(decimalPart >= 0.5) {
            // Round up
            return Math.round(value);
        } else {
            // Truncate
            return Math.floor(value);
        }
    }
    public static void main(String[] args) {
        //If statement is used for check a condition, then, if it's true, execute some code, else, execute another part of code.
            //Example (This could be a model of a theme park age-check)
        int age = 19;
        int minimumAge = 35;
        if(age >= minimumAge) {
            System.out.println("Nice, you can pass.");
        }
        else{
            System.out.println("Sorry. You're not old enough.");
        }
        //Also, I can use else if, to check more conditions.
        int qualification = (int) truncateOrRound(Math.random() * 11);
        System.out.println("Qualification: " + qualification);
        if(qualification == 10) {
            System.out.println("Congratulations! You passed with excellent.");
        }
        else if(qualification >=4) {
            System.out.println("Nice! You have to do a final test.");
        }
        else {
            System.out.println("Sorry. You need to repeat the course.");
        }
        //Switch statement: It's used to check many cases like a concatenation of if and else-if.
        int year = (int) truncateOrRound(Math.random() * 10000);
        boolean isLeap;
        System.out.println(year);
        //Now I'll do a program to check if the year is a leap year.
        int remainMod4 = year % 4;
        int remainMod100 = year % 100;
        switch (remainMod4){
            case 0:
                if(remainMod100 != 0){
                    isLeap = true;
                    System.out.println("The year is leap!");
                }
                break;
            default:
                System.out.println("That's not a leap year.");
        }

    }
}
