import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j >= temp) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            temp--;
        }
    }
}