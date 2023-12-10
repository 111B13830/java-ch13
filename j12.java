// 自訂的例外類別 - CenterException
class CenterException extends Exception {
    public CenterException(String message) {
        super(message);
    }
}

// 自訂的例外類別 - OutException
class OutException extends Exception {
    public OutException(String message) {
        super(message);
    }
}

// 自訂的例外類別 - InException
class InException extends Exception {
    public InException(String message) {
        super(message);
    }
}

public class j12 {
    public static void main(String args[]) {
        double radius = 10.0;
        double x1 = 5.3;
        double y1 = 6.8;
        double x2 = 0.2;
        double y2 = 9.5;
        double dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        try {
            if (dist <= radius) {
                throw new CenterException("(" + x1 + "，" + y1 + ") 在半徑" + radius + "，圓心(" + x2 + "," + y2 + ")的園內");
            } else if (x1 > 0 && x1 < 10 && y1 > 0 && y1 < 10) {
                throw new InException("(" + x1 + "，" + y1 + ") 在半徑" + radius + "，圓心(" + x2 + "," + y2 + ")的園內");
            } else {
                throw new OutException("(" + x1 + "，" + y1 + ") 不在半徑" + radius + "，圓心(" + x2 + "," + y2 + ")的園內");
            }
        } catch (CenterException e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        } catch (OutException e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        } catch (InException e) {
            System.out.println("捕捉到自訂的例外：" + e.getMessage());
        }
    }
}
