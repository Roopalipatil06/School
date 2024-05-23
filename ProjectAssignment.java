import java.util.List;
import java.util.Scanner;
import java.lang.NullPointerException;
public class ProjectAssignment {

     private Object s;
     public boolean Auth(String pass) {
     if (pass == "JAVA")
     {
          System.out.println("pass is correct");
     }
     else
     {
          System.out.println("pass is incorrect");
     }
     return false;
     }
     public static void main(String[] args) {
               ProjectAssignment s= new ProjectAssignment();
               boolean res =s.Auth("JAVA");
               System.out.println(res); }
     //   user input Factorial number

          int i,fact =1;
          long number =6;{ // this is a number to calculate a factorial
          for(i=1; i<=number ;i++) {
              fact=fact*i;  }
          {
          System.out.println("Factorial of "+number+" is :" +fact);
          }

     //   by using fibonacci series

         Scanner s=new Scanner(System.in);
         System.out.println("Enter any number to calculate fibonacci series:");
         int n=s.nextInt();
         int  x=1, y=0,z=0;
         for(int i=1; i<=n; i++)
         {
              System.out.println(z+ " ");
              z= x+y;
              x=y;
              y=z;
         }

      //  by using prime number
        {

             {
                  int num,i,count =0;
                  Scanner s1=new Scanner (System.in);
                  System.out.println("enter the number to check wheather it is prime or not: ");
                  num= s1.nextInt();
                  for (i=2 ; i<num ; i++)
                  {
                       if(num%i==0)
                       {
                            count++;
                            break;
                       }

                  }
                  if(count==0)
                       System.out.println("\n is a Prime Number.");
                       else
                            System.out.println("\n is a Not Prime Number.");
             }
        }
          }

               // sum of the digit
          {
           int Number;
           int Reminder;
           int sum=0;
           s= new Scanner(System.in);
           System.out.println("Please enter any number to calculate its sum :");
           Number = ((Scanner) s).nextInt();
           while (Number >0)  {
                Reminder = Number % 10;
                sum = sum + Reminder;
                Number = Number / 10;
           }
           System.out.println(sum);
           }

        // reverse number program
          {
          Scanner s = new Scanner (System.in);
          System.out.println("Enter a number to get the reverse number :");
          int num=s.nextInt();
          int reversed =0;
          while (num !=0) {
               int digit =num % 10;
               reversed = reversed * 10 + digit;
               num /=10;
          }
          System.out.println("The reversed number is " +reversed);
          s.close();
          }
          }

