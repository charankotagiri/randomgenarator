import java.util.Scanner;

public class randomguess {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int value;
        int Mynumber = (int) (Math.random()*100);

        do{
            System.out.println("Enter your guess number : 0-100");
            value = input.nextInt();
            if(Mynumber == value){
                System.out.println("Wooh your are right");
                break;
            } else if (value > Mynumber) {
                System.out.println("your number is large");
            }
            else {
                System.out.println("your number is smaller");
            }
        }while(value>=0);
        System.out.println("your number is :");
        System.out.println(Mynumber);
    }
}
