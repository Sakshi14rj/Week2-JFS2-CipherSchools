class App{
    App(){
        System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }
}
public class T2 extends App{
    T2(){
        super();
        System.out.println("Constructor of T2");
    }

public static void main(String[] args){
    new T2();
   }
}
