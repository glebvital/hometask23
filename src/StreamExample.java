import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample {
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void addNumber(List<Integer> number) {
        numbers.addAll(number);
    }

    public int sumEvenNumbers (){
        return numbers.stream().filter(x -> x % 2 == 0).reduce(0,Integer::sum);
    }

    public void doubleAll (){
        numbers.stream().map(x -> x * 2).forEach(x -> System.out.print(x+" "));
    }

    public Optional<Integer> findMax (){
        return numbers.stream().max(Integer::compareTo);
    }

    public void getAllUnevenNumbers (){
        numbers.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.print(x+" , "));
    }

    public double getAverage (){
        int sum = numbers.stream().reduce(0,Integer::sum);
        return (double) numbers.size() / sum;
    }
}
