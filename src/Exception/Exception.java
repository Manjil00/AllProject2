package Exception;

public class Exception {
    public static void main(String[] args) throws Exception {
        int num = 5;
        for (int i = -2; i < 3; i++) ;
        System.out.println(divideNumber(num,i));
    }

    public static int divideNumber(int num, int i) throws Exception

    {
        try {
                return num / i;

            } catch (ArithmeticException e) {
                return 00000;
            } finally {
                System.out.println("Running Finally");
            }



    }
}
