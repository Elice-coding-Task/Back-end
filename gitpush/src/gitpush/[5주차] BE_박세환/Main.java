import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1번 문제
        Dice d = new Dice(); System.out.println("주사위의 숫자 : " + d.roll());

        //2번 문제
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("정수 하나를 입력하세요.");
        int n = scanner.nextInt();
        int result = 0;
        
        for(int i = 1; i <= n; i++){
            result += i;
        }

        System.out.println("result = " + result);

    }
}
