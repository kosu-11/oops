class SumOfDigits {
    public static void main(String[] args) {
        int num = 753;

        int d1 = num / 100;       
        int d2 = (num / 10) % 10;   
        int d3 = num % 10;           

        int sum = d1 + d2 + d3;

        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}
