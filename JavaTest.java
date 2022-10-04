import java.util.Scanner;

public class JavaTest {
    public static int a = 200;
    public static void main(String[] args) {
        rangeCheck(a);
        System.out.println(a);
    }

    public static void rangeCheck(int integer){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        if (integer > 0 && integer < 100){
            System.out.println("yeah");
        } else{
            int temp = scan.nextInt();
            a = temp;
        }
    }
}
