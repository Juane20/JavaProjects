public class recursion {
    static int sumUntil(int k){ //This method sums the numbers between 0 and k.
        if(k == 1){
            return 1; //This is my base case, where the recursion should end.
        }
        else{
            return k + sumUntil(k-1); //This works like this, 10 + sumRange(9) = 10 + 9 + sumRange(8) + ... + 1
        }
    }
    static int sumRange(int start, int end){
        if(end > start){
            return end + sumRange(start, end - 1); // 10 > 5 then I do 10 + sumRange(5,9) = 10 + 9 + 8 + 7 + 6 + sumRange(5,5) = 45;
        }
        else{
            return end;
        }
    }
    public static void main(String[] args) {
        System.out.println(sumUntil(10)); //10 + 9 + 8 + ... + 1 = 55
        System.out.println(sumRange(5,10)); //10 + 9 + 8 + 7 + 6 + 5 = 45
    }
}