import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1번 문제
        //정수를 입력받을 int형 변수를 선언합니다.
        int n = 0;

        //값을 입력받되, 정수가 아니면 오류메세지를 출력하고 다시 입력받습니다. 정수를 입력받을때까지 반복합니다.
        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("정수를 하나 입력해 주세요.");
            try {
                n = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println(e);
                System.out.println("잘못된 입력입니다. 정수만 입력할 수 있습니다.");
            }
        }

        //check변수를 true로 초기화하고 입력받은 n의 소수 판별을 합니다. 약수가 발견된다면 check를 false로 변경하고 반복을 중단합니다.
        boolean check = true;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0) {
                check = false;
                break;
            }
        }

        //check의 값에따라 소수인지 아닌지 판별하여 결과를 출력합니다.
        if(check) System.out.println("소수입니다.");
        else System.out.println("소수가 아닙니다.");





        //2번 문제
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //테스트케이스를 입력받고 배열에 쪼개서 저장합니다.
        System.out.println("테스트 케이스를 입력해 주세요.");
        String[] value = scanner.nextLine().split("");

        //정수형으로 변환이 된다면 StringBuilder에 append하고 예외가 난다면 무시하고 넘어갑니다.
        for(String s : value){
            try{
                sb.append(Integer.parseInt(s));
            }
            catch (Exception e) {

            }
        }

        //결과값을 출력합니다.
        System.out.println("result = " + sb);
    }
}