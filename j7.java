public class j7 {
    public static void main(String args[]) {
        int[] arr = {4, 12, 87, 21, 6, 18};
        int[] den = {2, 0, 7, 0, 61, 0};
        double sum = 0.0;

        try {
            for (int i = 0; i < arr.length; i++) {
                sum += (double) arr[i] / den[i];
            }
            System.out.println("sum=" + sum);

        } catch (Exception e) {
            System.out.println("捕捉到例外了：" + e.getMessage());
        }
    }
}

