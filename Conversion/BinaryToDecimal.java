import java.util.Scanner;

public class BinaryToDecimal {

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number in binary form: ");
        return sc.nextInt();
    }

    //Method to define the calculation of decimal to binary conversion.
    public static void BinToDecimal(int n){
        int rem, sum = 0, res, i = 0;
        while(n>0){
            rem = n%10;
            res = (int) Math.pow(2, i);
            sum = sum + (rem*res);
            n /= 10;
            i++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        BinToDecimal(getNumber());
    }
}
