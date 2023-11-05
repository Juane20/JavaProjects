public class Loops {
    public static void main(String[] args) {
        //While loop: While serves for do something until a condition is reached.
        int i = 0;
        while (i < 10){
            System.out.println(i); //This will print 0,1,2,3,4,5,6,7,8,9, all the numbers until i < 10
            i++;
        }
        i = 0;
        /*Do while loop: This is a variation of the while, whereas while loop check the condition, if the condition is true
        then executes the code, do while first execute the code once,
        and then acts like a while, and it'll execute the code until condition is false.
        */
        do{
            System.out.println(i);
            i++;
        }
        while (i != 0 && i <= 10); //Although the condition is fake in the first run, 0 is printed because the do statement.
        System.out.println("-----------For Loop-----------");
        //For Loop: This kind of loop is similar to the while, but it's used when you know how many times you want to loop.
        for(int k = 0; k < 10; k++){
            System.out.println("Iteration N°: " + k);
        }
        //I can put a for inside another for:
        for(int j = 0; j < 10; j++){
            for(int f = 0; f < 10; f++){
                System.out.println("Matrix Index N°: " + "[" + j + "]" + "[" + f + "]");
            }
        }
        //"For-each" loop: This special variation of for is used to loop through elements in an array.
        String[] brands = {"Samsung", "LG", "Motorola", "Xiaomi"}; //This is an array.
        for(String a : brands){
            System.out.println(a);
        }
        //"Continue": This statement breaks one iteration in the loop and then continues.
        for(int b = 0; b < 10; b++){
            if( b == 4){
                continue;
            }
            System.out.println(b + " is not 4.");
        }
    }

}