import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        //classic
        for(int i = 1 ; i < 101 ; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i + "-FizzBuzz");
            } else if(i%5==0){
                System.out.println(i + "-Buzz");
            } else if(i%3==0){
                System.out.println(i + "-Fizz");
            }
        }

        //stream
        IntStream.iterate(1, x-> x+1)
                .limit(100)
                .filter(x -> x%3==0||x%5==0)
                .forEach(x-> {
                    if (x % 3 == 0 && x % 5 == 0)
                        System.out.println(x + "-FizzBuzz");
                    else if (x % 5 == 0)
                        System.out.println(x + "-Buzz");
                    else
                        System.out.println(x + "-Fizz");
                });
    }
}
