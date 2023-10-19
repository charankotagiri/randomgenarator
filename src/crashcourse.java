import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class crashcourse {
          public static void call(){
              int a=6,b=8;
              int store = a+b;
              System.out.println(store);
              //return store;
          }
          public static void main(String[] args){
//              //data-types
//              float a  = 6F;
//              int i = 5;
//              double d = 5.5D;
//              long l = 888888L;
//              short s =1;
//              byte b= 11;
//              char c = 'c';
//              String str = "string";
//              System.out.println(str);
//
//              //arrays
//              int[] arr = {1,2};
//              String[][] twodimstr = {{"hello"},{"charan"}};
//              System.out.println(twodimstr[0][0]);
//
//              // array using new
//               String [] strnewarray = new String[5];
//               strnewarray[0] = "firstArray";
//              strnewarray[1] = "secondArray";
//              strnewarray[2] = "thirdArray";
//              strnewarray[3] = "fourArray";
//              strnewarray[4] = "fiveArray";
//              System.out.println(strnewarray[0]);
//
//              //array sort
//              Arrays.sort(strnewarray);
//
//              // length find for array
//              System.out.println(twodimstr[0].length);
//
//
//              //typecasting
//               int typea = 55;
//               double typeb = 66.0;
//               int store =  (int) (typea+typeb);
//               System.out.println(store);
//
//              //operators
//
//              //arthametic operatoers
//                 //+,-,*,/,%
//                int artha = 6;
//                int arthb = 8+artha;
//                System.out.println(arthb);
//
//                //assignment operatores
//
//                 int assign = 6;
//                 assign+=7;
//                 System.out.println(assign);
//
//                 //increment opertor
//                  int inc = 1;
//                 /* post increment */ inc++;
//                  // decrement operator
//                   int dec = 2;
//                  /*pre decrement*/ --dec;
//
//                  // math class or function
//                  System.out.println(Math.min(5,6));
//
//                  //random math function
//                  System.out.println(Math.random());
//
//                  //taking input
//                    Scanner input = new Scanner(System.in);
//                    System.out.println("enter number : ");
//                    int numb = input.nextInt();
//                    System.out.println(numb);
//
//                    //switch statements
//
//                    int day ;
//                    Scanner week = new Scanner(System.in);
//
//                    System.out.println("Enter a day in number: ");
//                    day = week.nextInt();
//
//                    switch(day){
//                        case 1 :
//                            System.out.println("Monday");
//                            break;
//                        case 2 :
//                            System.out.println("tuesday");
//                            break;
//                        default:
//                            System.out.println("out of bound expection");
//                    }
//
//                     //loops
//
//                    int loop ;
//                    for(loop=0;loop<10;loop++){
//                        System.out.println("charan");
//                    }
//
//
//                    //print factorial
//
//                   int fact;
//                   Scanner factorial = new Scanner(System.in);
//
//                  System.out.println("enter a factorial");
//                  fact = factorial.nextInt();
//
//                  for(int i=1; i<=fact;i++){
//                      System.out.println(fact +"*" + i +"="+ fact*i );
//
//                  }
//
//            //loops
//                  int check = 5;
//                  for(int i =1; i<check;i++) {
//                      System.out.println("loop start :" + i);
//                      if (i == 3) {
//                          System.out.println("task done");
//                          break;
//                      }
//                  }
//

              //do while
//              int dowhile;
//              Scanner input = new Scanner(System.in);
//              do{
//                  System.out.println("enter a number :");
//                   dowhile = input.nextInt();
//                   int add = 1+dowhile;
//                   System.out.println(add);
//
//              }while (dowhile!=20);

             call();
          }
}

