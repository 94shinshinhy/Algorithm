import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] sArr = s.split(" ");

        System.out.println(Double.parseDouble(sArr[0]) / Double.parseDouble(sArr[1]));
    }
}