import java.util.*;

public class Main {
    public static void main(String[] args) {
        //3번 문제
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("정수를 하나 입력해 주세요.");
        int n = scanner.nextInt();

        sb.append(1);
        while(n > 9) {
            n /= 10;
            sb.append(0);
        }

        sb.append("의 자릿수");
        System.out.println(sb);



        //4번 문제
        int a = 0;
        int b = 0;
        for(int i = 1; i <= 10; i++) {
            a += i*i;
            b += i;
        }
        b *= b;
        System.out.println(b - a);
    }
}