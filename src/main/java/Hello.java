public class Hello {
    public static void main(String[] args) {
        var a = 15;
        if(a % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (a % 5 == 0) {
            System.out.println("Fizz");
        } else if (a % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(a);
        }
    }
}
