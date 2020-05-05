import java.io.*;
import java.util.Scanner;

// I wanted to make the program by using function declaration, I/O and switch function.

 public class JihoWooHW1a
 {
  
  public static void Is_this_integer(String in) // A check for Errors.
  {
   byte Byte[] = in.getBytes();
   for(int i=0;i<in.length();i++)
    {
    if(!(Byte[i] > 47 && Byte[i] < 58 ))
       {
    System.out.println("Incorrected input value.");
    System.out.println("Program ended.");
    System.exit(0);
       }
    } 
  }
  
  public static char Is_this_Operator(String in) // A check for Errors.
  {
   char Char = in.charAt(0);
    if(!(Char == '+' || Char == '-' || Char == '/' || Char == '*' || Char == '%' || Char == '&' || Char == '|'))
       {
    System.out.println("Incorrected input value.");
    System.out.println("Program ended.");
    System.exit(0); 
       }
   return Char;
  }
  
  public static int A(int x, int y) // for addition
  {
   return x+y;
  }
  public static int B(int x, int y) // for subtraction
  {
   return x-y;
  }
  public static int C(int x, int y) // for division
  {
   return x/y;
  }
  public static int D(int x, int y) // for multiplication
  {
   return x*y;
  }
  public static int E(int x, int y) // for modulus
  {
   return x%y;
  }
  public static int F(int x, int y) // for bitwise &
  {
   return x&y;
  }
  public static int G(int x, int y) // for bitwise |
  {
   return x|y;
  }

    public static void main(String[] ar) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // Format for input
  
        char Choice = 0;
        String Input1, Input2, Input3;  
        int x=0, y=0, sum=0;

        System.out.println("This Program is a program of operation");
        System.out.println("--------------------------------------");
       
        while(true)
        {
        System.out.print("Enter the first integer : ");
        Input1 = in.readLine(); // read a string
        Is_this_integer(Input1); // A check for error ( Is the value integer ? )
        x = Integer.valueOf(Input1);// get integer 1

       
        System.out.print("Enter the second integer : ");
        Input2 = in.readLine(); // read a string
        Is_this_integer(Input2); // A check for error ( Is the value integer ? )
        y = Integer.valueOf(Input2); // get integer 2
    
        System.out.print("Enter the operation : ");
        Choice = Is_this_Operator(in.readLine()); // A check for error ( Is the value operator ? ) and getting operation

       
        switch(Choice) // group by case and use function made a while ago
        
        {
            case '+':
                sum = A(x, y);
                break;
            case '-':
                sum = B(x ,y);
                break;
            case '/':
                sum = C(x, y);
                break;
            case '*':
                sum = D(x, y);
                break;
            case '%':
             sum = E(x, y);
             break;
            case '&':
             sum = F(x, y);
             break;
            case '|':
             sum = G(x,y);
             break;
       
        }
        System.out.printf("The results of %d %c %d is %d\n", x, Choice, y, sum); // print the result
        }
    }
}
