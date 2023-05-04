import java.util.*;

public class Main {
    public static void main(String[] args) {
        //5번 문제
        //값을 하나 입력받습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~9사이의 정수 하나를 입력하세요.");
        int n = scanner.nextInt();

        //출력 형식에 맞게 빌드합니다.
        StringBuilder sb =  new StringBuilder();
        for(int i = 1; i < 10; i++){
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
        }

        //최종 결과물을 출력합니다.
        System.out.println(sb);



        //6번 문제
        //테스트 케이스를 입력받습니다
        System.out.println("값들이 나열된 문자열을 입력해주세요.");
        scanner.nextLine();//개행문자를 받아서 처리하기 위함
        String values = scanner.nextLine();

        //값을 나누어 배열에 저장한 뒤 Integer형 배열에 변환하여 저장합니다
        String[] splitValue = values.split(" ");
        Integer[] convert = new Integer[splitValue.length];

        for(int i = 0; i < splitValue.length; i++){
            convert[i] = Integer.parseInt(splitValue[i]);
        }

        //ArrayList형으로 변환한 후 가장 큰 값을 찾습니다.
        List<Integer> findMax = Arrays.asList(convert);
        int max = Collections.max(findMax);

        //가장 큰 값과 그 위치를 출력합니다.
        System.out.println(max + " " + (findMax.indexOf(max) + 1));
    }
}
