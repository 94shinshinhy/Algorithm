import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        String[] sArr = s.split(" ");
        if("".equals(sArr[0])){
            System.out.println(0);
        } else {
            System.out.println(sArr.length);
        }
    }
}
