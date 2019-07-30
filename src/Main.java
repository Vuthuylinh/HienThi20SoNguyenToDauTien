import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("To show length of list n first prime number, enter a number: ");
        int listLength = input.nextInt();
        int count=0;
        for(int i=0; ; i++){
            if(isPrime(i)){
                System.out.print(i+ "; ");
                count++;
                if(count==listLength){
                    break;
                }
            }
        }


    }

    public static boolean isPrime(int number){

        if(number<2){
           return false;
        }else if(number==2){
           return true;
        }else {
           for(int i=2; i<=Math.sqrt(number);i++){
               if (number%i==0){
                   return false;
               }
           }
        }
        return true;
    }

}
