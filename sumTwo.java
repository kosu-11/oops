
public class sumTwo {
    int i;
    sumTwo(int i){
        this.i = i;
    }
    sumTwo(int a,int b){
        System.out.println(a+b);
    }
    sumTwo(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sumTwo a = new sumTwo(1, 9);
        sumTwo b = new sumTwo(1.2, 8.9);
        sumTwo c = new sumTwo(8);
        System.out.println(c.i);
    }
}
