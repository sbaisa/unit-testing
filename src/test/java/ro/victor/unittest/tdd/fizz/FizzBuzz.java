package ro.victor.unittest.tdd.fizz;

import java.util.Map;

public class FizzBuzz {

//    public static List<String> getNumbers(int numbers) {
//        return IntStream.range(1, numbers + 1).mapToObj(BuzzFizz::getString).collect(toList());
//    }
    private final Map<Integer, String> factors;

    public FizzBuzz(Map<Integer, String> factors) {
        this.factors = factors;
    }

    public String getString(int number) {
        StringBuilder result = new StringBuilder();
        for (Integer divisor : factors.keySet()) {
            if (number % divisor == 0) {
                result.append(factors.get(divisor));
            }
        }
        if (result.toString().isEmpty()) {
            return String.valueOf(number);
        }
        return result.toString();
    }


}
