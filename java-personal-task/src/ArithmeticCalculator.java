import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {

    private final List<Double> resultList = new ArrayList<>();

    public double operator(T num1, T num2, char operator){
        OperatorType type = OperatorType.fromOperator(operator);

        return switch (type){
            case ADD -> num1.doubleValue() + num2.doubleValue();
            case MINUS -> num1.doubleValue() - num2.doubleValue();
            case DIVISION -> num1.doubleValue() / num2.doubleValue();
            case MULTIPLICATION -> num1.doubleValue() * num2.doubleValue();
        };
    }

    public List<Double> getResultList(){
        return resultList;
    }

    public void setResultList(Double resultList){
        this.resultList.add(resultList);
    }

    public List<Double> getGoeList(Double targetNum){
        return resultList.stream()
                .filter(result -> result >= targetNum)
                .collect(Collectors.toList());
    }

    public List<Double> getGoeList1(Double targetNum){
        List<Double> newList = new ArrayList<>();
        for (Double result : resultList) {
            if(result > targetNum){
                newList.add(result);
            }
        }
        return newList;
    }
}
