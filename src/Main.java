public class Main {
    public static void main(String[] args) {

        //cevdettsedeff
        int number = 59;

        boolean isPrime = true;

        if(number==1)
        {
            System.out.println("Number is not Prime number :(");
            return;
        }
        if(number<1)
        {
            System.out.println("Wrong number");
            return;
        }

        for(int a=2;a<number;a++)
        {
            if(number%a==0)
            {
                isPrime=false;
            }
        }
        if(isPrime)
        {
            System.out.println("Number is prime number :)");
        }
        else {
            System.out.println("Number is not Prime number :(");
        }
    }
}