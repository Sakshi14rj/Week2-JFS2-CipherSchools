import java.util.Scanner;
public class We{
    int n1,n2,result;
    
    Scanner sc = new Scanner(System.in);
     void Calc(){
         try{
             System.out.println("Enter 1st num");
             n1 = sc.nextInt();
             System.out.println("Enter 2st num");
             n2 = sc.nextInt();
             result = n1/n2;
         }
         if(n==2){
             throw new ArithmenticException();
         }
         catch(InputMismatchException ime){
             System.out.println("IM detected");
         }
         catch (ArithmeticException ae){
             System.out.println("AE detected");
         }
         catch(Exception e){
             System.out.println("Ouch exception caught"+e.getMessage());
             e.printStackTrace();
         }
         System.out.println(result);
     }
     public static void main(String[] args){
         We obj = new We();
         obj.Calc();
     }
}
