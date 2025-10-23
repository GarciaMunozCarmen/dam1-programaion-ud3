public class Contador {
    public static void contar(int n){
        System.out.println(n);
        if (n == 0){
            System.out.println("---");
            return;
        }
        n--;
        contar(n);
    }
    public static void factorial(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n * (n-1));
        n--;
        factorial(n);
    }
    public static void main(String[] args) {
        contar(10);
        factorial(5);
    }
}
