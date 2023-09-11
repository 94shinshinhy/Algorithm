import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] sArr = s.split(" ");

        System.out.println(Integer.parseInt(sArr[0]) - Integer.parseInt(sArr[1]));
    }
}