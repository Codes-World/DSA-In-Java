import java.lang.*;
import java.util.Scanner;
public class DecimalToBinary {

    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a  Decimal number: ");
        return sc.nextInt();
    }

    //Method to define the calculation of decimal to binary conversion.
    public static void decToBinary(int n){
        int rem;
        StringBuilder binary = new StringBuilder();
        while(n>0){
            rem = n%2;
            binary.append(rem);
            n /= 2;
        }
        System.out.println(binary.reverse());
    }

    //Method to define the calculation of decimal to Octal conversion.
    public static void decToOctal(int n){
        int rem;
        StringBuilder binary = new StringBuilder();
        while(n>0){
            rem = n%8;
            binary.append(rem);
            n /= 8;
        }
        System.out.println(binary.reverse());
    }

    //Method to define the calculation of decimal to Hexadecimal conversion.
    public static void decToHexadecimal(int n){
        int rem;
        StringBuilder binary = new StringBuilder();
        while(n>0){
            rem = n%16;
            if(rem == 10){
                binary.append('A');
            }
            else if(rem == 11){
                binary.append('B');
            }
            else if(rem == 12){
                binary.append('C');
            }
            else if(rem == 13){
                binary.append('D');
            }
            else if(rem == 14){
                binary.append('E');
            }
            else if(rem == 15){
                binary.append('F');
            }
            else{
                binary.append(rem);
            }
            n /= 8;
        }
        System.out.println(binary.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("######################### NUMBER SYSTEM ######################\n");
        System.out.println("\n\t1.Convert Into Binary Number \n\t2.Convert Into Octal Number \n\t3.Convert Into Hexadecimal Number \n\t4.Exit\n");

        boolean flowOfCode = true; //flowOfCode variable is used to run the program till user doesn't want to terminate the program..
        int choice;
        do {
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> decToBinary(getNumber());
                case 2 -> decToOctal(getNumber());
                case 3 -> decToHexadecimal(getNumber());
                case 4 -> flowOfCode = false;
                default -> System.out.println("Invalid Choice! Try Again");
            }
        } while (flowOfCode);
    }
}
