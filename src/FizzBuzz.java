import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzbuzz(int n) {

        List<String> answer = new ArrayList<>();

        String f = "Fizz";
        String b = "Buzz";
        String fb = "FizzBuzz";

        for (int i = 1; i <= n; i++) {

            boolean div3 = (i % 3 == 0);
            boolean div5 = (i % 5 == 0);

            if (div3 && div5){
                answer.add(fb);
            } else if (div3) {
                answer.add(f);
            } else if (div5) {
                answer.add(b);
            } else {
                answer.add(Integer.toString(i));
            }

        }

        return answer;


    }

    public static void main(String[] args) {

        System.out.println(fizzbuzz(5));

    }
}
