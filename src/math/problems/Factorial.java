package math.problems;

public class Factorial {

    public static void main(String[] args) {

        int number = 5;
        int fact = 1;
        int i;
        for (i=1;i<=number;i++) {
            fact = fact * i;
        }

        System.out.println("The Factorial of Number 5 is :" + fact);


        int factorial = fact(5);
        System.out.println("The factorial of the 5 is:" + factorial);
    }
    static int fact(int n)
    {
        int x;
        if (n==1){
            return 1; }
        else {
            x = n*fact(n-1);
            return x; }
    }
}
