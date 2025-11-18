public class StaticExample {
    static int i =10;
    static void sum( int a, int b){
        System.out.println(a+b);
    }
    static{
        System.out.println("Static block");
    }
    StaticExample(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        StaticExample s = new StaticExample(1, 6);
        System.out.println(s.i);
        StaticExample s2 = new StaticExample(1, 8);
        s2.i = 7;
        System.out.println(s.i);
        sum(2, 3);
    }
}
