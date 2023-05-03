import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3번 문제
        Scanner scanner = new Scanner(System.in);

        System.out.println("0~99 사이의 정수를 하나 입력하세요.");
        String value = scanner.nextLine();
        if(Integer.parseInt(value) < 10){
            value += "0";
        }

        //두번째 풀이
        int result = Integer.parseInt(value.substring(0,1))+Integer.parseInt(value.substring(1,2));

        //첫번째 풀이
//        String[] splitValue = value.split("");
//
//        int result = 0;
//        for(String i : splitValue){
//            result += Integer.parseInt(i);
//        }

        System.out.println("result = " + result);





        //4번문제
        //스캐너 생략
        int mul = 1;
        //정수를 입력받고 모두 곱한다
        for(int i = 0; i < 3; i++){
            System.out.println("정수를 하나 입력하세요.");
            mul *= scanner.nextInt();
        }

        //자릿수별로 나눈다
        String[] split = String.valueOf(mul).split("");

        //각 숫자가 몇번 사용되었는지 카운트한다
        int[] count = new int[10];
        for(String i : split){
            count[Integer.parseInt(i)]++;
        }

        //출력 형식에 맞게 출력한다
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count.length; i++){
            if(count[i] == 0) continue;
            sb.append(i).append("이 ").append(count[i]).append("번, ");
        }
        sb.delete(sb.length()-2, sb.length()); //마지막 ','을 지워서 출력 형식을 맞추기 위함
        sb.append(" 쓰였다.");
        System.out.println(sb);
    }
}
