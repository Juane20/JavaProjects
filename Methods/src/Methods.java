public class Methods {
    //A method can be used for re-use code, is like a function.
    static void sayHi(){
        System.out.println("Hi!"); //This method uses keyword "void" which means it will not return anything.
    }
    static void greets(String name, int age){ //Idem void
        System.out.println("Hi " + name + ", you're " + age + " years old!");
    }
    static int square(int number){ //This methods returns a value.
        return number*number;
    }
    static boolean isAdult(int age){ //We can use if-else in methods.
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    static int sum(int x, int y){           //Here we're "overloading" methods, which means call multiple methods with the same name.
        return x + y;                       //This could be using if the input type could change depending on the context.
    }
    static double sum(double x, double y){
        return x + y;
    }
    public static void main(String[] args) {
        sayHi();
        String[][] firstNames = {{"Juan", "Elias", "Nat", "Berenice"}, {"Cabrera", "Garcia", "Da Cruz", "Cabrera"}};
        int[] ages = {17, 19, 20, 23};
        for(int i = 0; i < firstNames.length - 1; i++){
            for(int j = 0; j < firstNames[i].length; j++){
                greets(firstNames[i][j] + " " + firstNames[i+1][j], ages[j]);
            }
        }
        //Some methods can return values, like square.
        int n = (int) (Math.random() * 11);
        System.out.println(n);
        int squaredN = square(n);
        System.out.println(squaredN);
        //We will use isAdult:
        if(isAdult(17)){
            System.out.println("All right, pass.");
        }
        else{
            System.out.println("I'm sorry, you're not old enough.");
        }
        System.out.println(sum(1,2));
        System.out.println(sum(1.5, 2.5));
    }
}