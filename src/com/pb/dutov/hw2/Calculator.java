import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int x;
          int y;
          String symbol;
          int res;
          System.out.println("введите переменную х:");
          x = scan.nextInt();
          System.out.println("введите переменную y:");
          y = scan.nextInt();
          System.out.println("введите знак действия:");
          symbol = scan.next();
          if (symbol.equals("/") & y == 0) 
          {
               System.out.print("Попытка деления на 0");
          } else{
               switch (symbol) {
                    case "+":
                         System.out.println(x + y);
                         break;
                    case "-":
                         System.out.println(x - y);
                         break;
                    case "*":
                         System.out.println(x * y);
                         break;
                    case "/":
                         System.out.println(x / y);
                         break;
                    default:
                         System.out.println("Неверное действие");
               }


          }
     }
}
