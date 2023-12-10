// 自定義的例外類 - Notriangle
class Notriangle extends Exception {
    public Notriangle(String message) {
        super(message);
    }
}

// 自定義的例外類 - Equilatertriangle
class Equilatertriangle extends Exception {
    public Equilatertriangle(String message) {
        super(message);
    }
}

// 自定義的例外類- NotEquilatertriangle
class NotEquilatertriangle extends Exception {
    public NotEquilatertriangle(String message) {
        super(message);
    }
}

public class j14 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        try {
            triangle(a, b, c);
            System.out.println("這是正三角形");
        } catch (Notriangle e) {
            System.out.println("捕捉到自定義的例外：" + e.getMessage());
        } catch (Equilatertriangle e) {
            System.out.println("捕捉到自定義的例外：" + e.getMessage());
        } catch (NotEquilatertriangle e) {
            System.out.println("捕捉到自定義的例外：" + e.getMessage());
        }
    }

    // 檢查三角形方法
    static void triangle(int a, int b, int c) throws Notriangle, Equilatertriangle, NotEquilatertriangle {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new Notriangle("不構成三角形");
        } else if (a == b && a == c && b == c) {
            throw new Equilatertriangle("這是正三角形");
        } else {
            throw new NotEquilatertriangle("這不是三角形");
        }
    }
}

