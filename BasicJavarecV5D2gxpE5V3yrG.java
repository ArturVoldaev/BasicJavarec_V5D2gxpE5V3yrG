import java.util.Scanner;

public class BasicJavarecV5D2gxpE5V3yrG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a random number: ");
        int number = sc.nextInt();

        String type = "";
        int tempNumber;
        int doubleNum;
        int checkNumder = number;

        while (number >= 1) {
            tempNumber = number/2;
            doubleNum = number%2;
            number = tempNumber;
            type += Integer.toString(doubleNum);
        }

        System.out.println(new StringBuilder(type).reverse().toString() + " - result");
        System.out.println(Integer.toBinaryString(checkNumder) + " - check your self");

        sc.close();
    }

}
