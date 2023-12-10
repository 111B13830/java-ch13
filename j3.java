public class j3{
    public static void main(String[] args) {
        int num = 12, den = 0;

        try {
            int ans = num / den;
            System.out.println("答案是：" + ans);

        } catch (ArithmeticException e) {
            System.out.println("發生除法運算異常：" + e.getMessage());

        } finally {
            System.out.println("這是 finally 區塊，無論如何都會執行。");
        }

        System.out.println("end of main()!!");
    }
}
