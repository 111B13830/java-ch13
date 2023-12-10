import java.util.Scanner;

// 自訂的例外類別 - IntegerLessThanZero
class IntegerLessThanZero extends Exception {
    public IntegerLessThanZero(String message) {
        super(message);
    }
}

// 自訂的例外類別 - IntegerGreaterThanZero
class IntegerGreaterThanZero extends Exception {
    public IntegerGreaterThanZero(String message) {
        super(message);
    }
}

// 自訂的例外類別 - IntegerEqualToZero
class IntegerEqualToZero extends Exception {
    public IntegerEqualToZero(String message) {
        super(message);
    }
}

public class j17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("請輸入一個整數：");
            int input = scanner.nextInt();

            checkInteger(input);
        } catch (IntegerLessThanZero e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        } catch (IntegerGreaterThanZero e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        } catch (IntegerEqualToZero e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("捕捉到例外：" + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // 檢查整數的方法
    static void checkInteger(int num) throws IntegerLessThanZero, IntegerGreaterThanZero, IntegerEqualToZero {
        if (num < 0) {
            throw new IntegerLessThanZero("輸入整數小於0" );
        } else if (num > 0) {
            throw new IntegerGreaterThanZero("輸入整數大於0" );
        } else {
            throw new IntegerEqualToZero("輸入整數等於0" );
        }
    }
}
