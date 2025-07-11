public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sum  = add(10,20);
        System.out.println(sum);
    }

    private static int add(int a,int b){
        return a+b;
    }
}