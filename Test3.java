public class Test3 {
    int getNextNo(int n){
        try{
            (if n ==5){
                return n+1;
            }
        }
        finally {
            System.out.println("IMPORTANT CODE");
        }
        return n-1;
    }
    public static void mian(String[] args){
        Test3 obj = new Test3();
        System.out.println(obj.getNextNo(5));
    }
}
