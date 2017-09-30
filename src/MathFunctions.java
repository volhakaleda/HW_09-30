public class MathFunctions {

    private int num1;
    private int num2;

    public MathFunctions(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public double divide() {
        double double01 = num1;
        double double02 = num2;
        return double01 / double02;
    }

    public double average() {
        return (num1 + num2) / 2.0;

    }

    public int min() {

        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
//        num1 > num2 ? num1 : num2;

    }

    public int max() {

        if (num1 < num2) {
            return num2;
        }
            return num1;
        }
    }


