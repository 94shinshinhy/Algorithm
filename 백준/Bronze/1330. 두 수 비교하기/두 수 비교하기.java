import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] sArr = s.split(" ");
        int a = Integer.parseInt(sArr[0]);
        int b = Integer.parseInt(sArr[1]);
        String answer = "";

        if(a > b){
            answer = ">";
        } else if(a < b){
            answer = "<";
        } else {
            answer = "==";
        }

        System.out.println(answer);
    }
}