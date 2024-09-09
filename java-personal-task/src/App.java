import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        double result = 0.0;

        ArithmeticCalculator<Integer> calculator = new ArithmeticCalculator<>();
        double operator1 = calculator.operator(number1, number2, operator);
        calculator.setResultList(operator1);
        double operator2 = calculator.operator(2, 5, operator);
        calculator.setResultList(operator2);
        double operator3 = calculator.operator(6, 8, operator);
        calculator.setResultList(operator3);

        List<Double> result1 = calculator.getResultList();
        for (Double num : result1) {
            System.out.println(num);
        }

        System.out.println("==========람다적용========");

        List<Double> goeList = calculator.getGoeList(6.0);
        for (Double aDouble : goeList) {
            System.out.println(aDouble);
        }


    }

    public void lv1() {
        //양의 정수 2개를 입력
        Scanner sc = new Scanner(System.in);
        String exit = "";

        int number1;
        int number2;
        char operator;
        double result = 0.0;
        //“exit” 문자열을 입력하기 전
        while (!exit.equals("exit")) {
            System.out.println("첫 번째 글자 입력");
            number1 = sc.nextInt();
            System.out.println("두 번째 글자 입력");
            number2 = sc.nextInt();

            //사칙연산 기호
            System.out.println("연산 기호 입력");
            operator = sc.next().charAt(0);

            //조건문을 통해서 기호에 따른 사칙연산을 구분지어 처리할 수 있도록
            if (operator == '+') {
                result = number1 + number2;
            } else if (operator == '-') {
                result = number1 - number2;
            } else if (operator == '*') {
                result = number1 * number2;
            } else if (operator == '/') {
                if (number2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    result = (double) number1 / number2;
                }
            } else {
                System.out.println("잘못된 기호를 입력했습니다.");
            }
            System.out.println(result);
            System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
            sc.nextLine();
            exit = sc.nextLine();
        }
    }

    public void lv2(){
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        char operator;

        String exit = "";
        while (!exit.equals("exit")){

            System.out.println("첫 번째 숫자 입력");
            number1 = sc.nextInt();
            System.out.println("두 번째 숫자 입력");
            number2 = sc.nextInt();

            //사칙연산 기호
            System.out.println("연산 기호 입력");
            operator = sc.next().charAt(0);

            double result = calculator.calculate(number1, number2, operator);

            System.out.println(result);
            System.out.println("종료를 원하면 exit / 계속하려면 아무 글자 입력");
            sc.nextLine();
            exit = sc.nextLine();
        }

        List<Double> resultList1 = calculator.getResult();

        for (Double result : resultList1) {
            System.out.println(result);
        }

        System.out.println("========delete중...======");
        calculator.deleteList();
        calculator.deleteList();
        System.out.println("========delete완료...======");


        List<Double> resultList2 = calculator.getResult();

        for (Double result : resultList2) {
            System.out.println(result);
        }
    }
}